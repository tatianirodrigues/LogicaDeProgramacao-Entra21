package ListaDeExercicios;

import java.util.Scanner;

//Construa um algoritmo que:
//a) - Leia várias fichas contendo cada uma:
//* sua matrícula
//* o nome de um atleta
//* o seu peso
//* o sexo
//* a idade
//b) - Calcule e imprima:
//a) - O peso e a matrícula do atleta mais pesado;
//b) - A média de idade dos atletas do sexo feminino;
//c) - A matrícula e o peso do atleta masculino de menor peso.
//Obs: O programa deve finalizar quando for digitada matrícula = 0
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int x = 0, matricula = 1, sexo, idade;
		double peso, maiorPeso = 0, menorPeso = 1000, matriculaMaiorPeso = 0, matriculaMenorPeso = 0, somaPeso = 0,
				mediaPeso = 0, nFeminino = 1;
		String nome;

		while (matricula != 0) {

			
			System.out.println("\nCADASTRO JOGADORES" + "\n--------------------\nQual o seu nome?");
			nome = entrada.nextLine();
			
			entrada.nextLine();
			
			System.out.println("Qual a sua matrícula?");
			matricula = entrada.nextInt();
			
			if (matricula == 0) {
				break;
			}
			else {
			
			System.out.println("Qual o seu peso em KG?");
			peso = entrada.nextInt();
			System.out.println("Qual seu sexo? Femnino(1), Masculino(2)");
			sexo = entrada.nextInt();

			while (sexo != 1 && sexo != 2) {
				System.out.println("Sexo Invalido!\n\nTente novamente");
				System.out.println("\nQual seu sexo? Femnino(1), Masculino(2)");
				sexo = entrada.nextInt();
				}

			System.out.println("Qual a sua idade?");
			idade = entrada.nextInt();

			if (peso > maiorPeso) {
				maiorPeso = peso;
				matriculaMaiorPeso = matricula;
			}
			if (peso < menorPeso) {
				menorPeso = peso;
				matriculaMenorPeso = matricula;
			}
			if (sexo == 1) {
				somaPeso = somaPeso + peso;
				mediaPeso = somaPeso / nFeminino;
				nFeminino++;
			}
		}
		}
		System.out.println("Este é o maior peso: " + maiorPeso + "KG" + "  Sua matrícula: " + matriculaMaiorPeso);
		System.out.println("Este é o menor peso: " + menorPeso + "KG" + "  Sua matrícula: " + matriculaMenorPeso);
		System.out.println("Média do Peso feminino: " + mediaPeso + "KG");
	}
}
