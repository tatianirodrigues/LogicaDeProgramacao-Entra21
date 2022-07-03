/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;


/**
* @author tatianirodrigues
*
*/
public class Exercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int ano, nascimento, ingressoEmpresa, idade, tempoEmpresa;
		String nome;
		
		System.out.println("Nome:");
		nome = entrada.nextLine();
		
		System.out.println("Ano do nascimento:");
		nascimento = entrada.nextInt();
			
		System.out.println("Ano de ingresso na empresa:");
		ingressoEmpresa = entrada.nextInt();
		
		System.out.println("Ano atual:");
		ano = entrada.nextInt();
		
		idade = ano - nascimento;
		tempoEmpresa = ano - ingressoEmpresa;
		
			if (idade >= 65 || tempoEmpresa >=30 ) {
				System.out.println("Idade: " + idade + " Tempo de trabalho: "+tempoEmpresa + "\nRequerer aposentadoria");
			}
			else if (idade >= 60 && tempoEmpresa >=25) {
				System.out.println("Idade: " + idade + " Tempo de trabalho: "+tempoEmpresa+ "\nRequerer aposentadoria");
			}
			else {
				System.out.println("Idade: " + idade + " Tempo de trabalho: "+tempoEmpresa+"\nNao Requerer");
			}
	}
}
