/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
//a)Ter no mínimo 65 anos de idade.
//b)Ter trabalhado no mínimo 30 anos.
//c)Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int ingressoEmpresa, idade, tempoEmpresa ;
		String nome;
		
		System.out.println("Nome:");
		nome = entrada.nextLine();
		
		System.out.println("Idade:");
		idade = entrada.nextInt();
			
		System.out.println("Tempo na empresa:");
		tempoEmpresa = entrada.nextInt();
		
		
			if (idade >= 65 || tempoEmpresa >=30 ) {
				System.out.println("Requerer aposentadoria");
			}
			else if (idade >= 60 && tempoEmpresa >=25) {
				System.out.println("Requerer aposentadoria");
			}
			else {
				System.out.println("Nao Requerer");
			}

	}

}
