/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Esta
//pesquisa deseja coletar os dados sobre o salário e número de filhos de cada habitante
//e após as leituras, escrever:
//a) Média de salário da população
//b) Média do número de filhos
//c) Maior salário dos habitantes
//d) Percentual de pessoas com salário menor que R$ 150,00
//Considere a população para 5 pessoas.
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float salario, nFilhos, somaSalario = 0, somaFilhos=0;
		float mediaFilhos = 0, mediaSalario = 0, maiorSalario = 0, menor150 = 0, porcentagemMenor150 = 0;
		
		int i;
		
		for (i = 0; i < 5; i++) {
			
			System.out.println("Salario:");
			 
			salario = entrada.nextFloat();
			somaSalario = somaSalario + salario;
			
				if (salario > maiorSalario) {
					maiorSalario = salario;
				}
				if (salario < 150) {
					menor150++;
				}
					
			System.out.println("Numero de filhos:");
	
			nFilhos = entrada.nextFloat();
			somaFilhos = somaFilhos + nFilhos;
		}
	
		mediaSalario = somaSalario / i;
		mediaFilhos = somaFilhos/ i;
		porcentagemMenor150 = (menor150 * 100) / i;
				
		System.out.println("Media Salarios:" + mediaSalario + " R$\nMedia de Filhos:" + mediaFilhos + "\nMaior Salario:" + maiorSalario
				+ "R$\nPercentual de pessoas com salário menor que R$ 150,00:" + porcentagemMenor150 + "%");
	}

}
