package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
            
            int IRRF;
            int INSS ;
            int ateMil;
            int ateMilEQuinhentos;// descont de 8%
            int ateMilEQuinhentosUm;// descont de 11%
            int ateDezMil;// descont de 11%
            int isentoAteTresMil;
            int TresMilAteSeisMil;//7.5%
            int AcimaDeSeisMil;//15%
            salarioBase=3.000;
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
		return Math.round(0.0);
	}
	
	
        //Exemplo de mét/*o*/do que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {
            int descInss=8;
            int descIr=11;
            //double salarioBruto=3.000;
             System.out.println(salarioBase);
            
		return salarioBase - (salarioBase * (descInss + descIr) / 100); 
	}
   public static void main(String[] args) {
            CalculadoraSalario CalculadoraSalario = new CalculadoraSalario();
            CalculadoraSalario.calcularInss(1.000);
    }
}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/