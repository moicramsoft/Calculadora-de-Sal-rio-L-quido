package br.com.codenation.calculadora;


public class CalculadoraSalario {

          private  int IRRF;
          private  int INSS ;
         private   int ateMil;
         private final   double ateMilEQuinhentos=8;// descont de 8%
         private final   int ateMilEQuinhentosUm=11;// descont de 11%
         private final   int ateDezMil=11;// descont de 11%
         private final   int isentoAteTresMil=0;
         private final   int TresMilAteSeisMil=(int) 7.5;//7.5%
         private   int AcimaDeSeisMil=15;//15%
         private double desconto;
            //salarioBase=3.000;
	public long calcularSalarioLiquido(double salarioBase) {
            
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
		return Math.round(0.0);
	}
	
	
        //Exemplo de mét/*o*/do que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {
       if (salarioBase <= 1500) {
            this.desconto = this.ateMilEQuinhentos;
       } else {
			this.desconto = 11d;
		}
            
		//return salarioBase - (salarioBase * (descInss + descIr) / 100); 
            return 0;
	}
   public static void main(String[] args) {
           // CalculadoraSalario CalculadoraSalario = new CalculadoraSalario();
           // CalculadoraSalario.calcularInss(1.000);
           
          
    }
}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/