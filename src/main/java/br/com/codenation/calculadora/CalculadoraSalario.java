package br.com.codenation.calculadora;


public class CalculadoraSalario {
	double vlSalMinimo = 1039.00;
	double salBase;
	double salLiquido;
	double bsCalIRRF;
	double ttlINSS;
	double ttIRRF;
	public long calcularSalarioLiquido(double salBase) {
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
                                
		this.salBase = salBase;
		if (this.salBase < this.vlSalMinimo) {
			return 0;
		}
		calcularInss(this.salBase);
		calcularIRRF(this.salBase);
		this.salLiquido = this.salBase - this.ttIRRF - this.ttlINSS;
		return Math.round(this.salLiquido);
	}


	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	public long calcularInss(double salBase) {
                double alqt;
               	if (this.salBase <= 1500) {
			alqt = 8d;
		} else if (this.salBase >= 1500.01 && this.salBase <= 4000) {
			alqt = 9d;
		} else {
			alqt = 11d;
		}
		this.ttlINSS = this.salBase * alqt / 100;
		this.bsCalIRRF = this.salBase - this.ttlINSS;
		return Math.round(this.ttlINSS);
	}

	/**
	* @param salBase
     * @return 
	 */
	public long calcularIRRF(double salBase) {
		calcularInss(salBase);
           	double alqt = 0d;
              if (this.bsCalIRRF <= 3000) {
			this.ttIRRF = 0d;
		} else if (this.bsCalIRRF >= 3000.01 && this.bsCalIRRF <= 6000) {
			alqt = 7.5;
		} else {
			alqt = 15d;
		}
		if (alqt > 0)
			this.ttIRRF = this.bsCalIRRF * alqt / 100;

		return Math.round(this.ttIRRF);
		//descontos();
	}

	private void descontos() {
           		if (this.salBase >= 3000.0 && this.salBase <= 6000) {
			this.ttIRRF -= 142.80;
		} else if (this.salBase < 6000.00) {
             } else {
                    this.ttIRRF -= 354.80;
             }
	}
}
