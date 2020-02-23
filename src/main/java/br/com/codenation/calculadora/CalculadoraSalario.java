package br.com.codenation.calculadora;


public class CalculadoraSalario {
	

	public long calcularSalarioLiquido(double salarioBase) {
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
                    var Variaveis= new var();
                    
		Variaveis.salarioBase = Variaveis.salarioBase;
		if (Variaveis.salarioBase < Variaveis.vlSalarioMinimo) {
			return 0;
		}
		Variaveis.calcularInss(Variaveis.salarioBase);
		Variaveis.calcularIRRF(Variaveis.salarioBase);
		Variaveis.salarioliquido = Variaveis.salarioBase - Variaveis.totalIRRF - Variaveis.totalINSS;
		return Math.round(Variaveis.salarioliquido);
	}


	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	public long calcularInss(double salarioBase) {
		/**
		 *
		 Faixa salarial	Percentual de desconto
		 Até R$ 1.500,00	8%
		 De R$ 1.500,01 até R$ 4.000,00	9%
		 Acima de R$ 4.000,00	11%
		 */
		double aliquota;
                var Variaveis= new var();
		if (Variaveis.salarioBase <= 1500) {
			aliquota = 8d;
		} else if (Variaveis.salarioBase >= 1500.01 && Variaveis.salarioBase <= 4000) {
			aliquota = 9d;
		} else {
			aliquota = 11d;
		}
		Variaveis.totalINSS = Variaveis.salarioBase * aliquota / 100;
		Variaveis.baseCalculoIRRF = Variaveis.salarioBase - Variaveis.totalINSS;
		return Math.round(Variaveis.totalINSS);
	}

	/**
	* @param salarioBase
     * @return 
	 */
	public long calcularIRRF(double salarioBase) {
		calcularInss(salarioBase);
           	double aliquota = 0d;
                var Variaveis= new var();
		if (Variaveis.baseCalculoIRRF <= 3000) {
			Variaveis.totalIRRF = 0d;
		} else if (Variaveis.baseCalculoIRRF >= 3000.01 && Variaveis.baseCalculoIRRF <= 6000) {
			aliquota = 7.5;
		} else {
			aliquota = 15d;
		}
		if (aliquota > 0)
			Variaveis.totalIRRF = Variaveis.baseCalculoIRRF * aliquota / 100;

		return Math.round(Variaveis.totalIRRF);
		//aplicarDeducoes();
	}

	/**
	 * Até 1.903,98	0%	0,00
	 * De 1.903,99 até 2.826,65	7,5%	142,80
	 * De 2.826,66 até 3.751,05	15%	354,80
	 * De 3.751,06 até 4.664,68	22,5%	636,13
	 * Acima de 4.664,69	27,5%	869,36
	 */
	private void aplicarDeducoes() {
             var Variaveis= new var();
		if (Variaveis.salarioBase >= 3000.0 && Variaveis.salarioBase <= 6000) {
			Variaveis.totalIRRF -= 142.80;
		} else if (Variaveis.salarioBase >= 6000.00)
			Variaveis.totalIRRF -= 354.80;
	}
}


/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/