/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int grauDeEscolaridade = 669, sexo, n = 0, nF = 0, nM = 0, mulheresSegundoGrau= 0, homensTerceiroagrau = 0, porcentagemHomens;
		
		while(grauDeEscolaridade != 0) {
		
		System.out.println("\nNome:");
		nome = entrada.nextLine();
		
		System.out.println("Grau de Escolaridade: (1) Segunda Grau ou (2) Terceiro Grau");
		grauDeEscolaridade = entrada.nextInt();
			if(grauDeEscolaridade == 0) {
				break;
			}
			while (grauDeEscolaridade != 1 && grauDeEscolaridade != 2) {
				System.out.println("Grau de escolaridade invalido!\n\nTente novamente");
				System.out.println("Grau de Escolaridade: (1) Segunda Grau ou (2) Terceiro Grau");
				grauDeEscolaridade = entrada.nextInt();
				}
		System.out.println("Sexo: (1) Feminino ou (2) Masculino");
		sexo = entrada.nextInt();
			while (sexo != 1 && sexo != 2) {
				System.out.println("Sexo invalido!\n\nTente novamente");
				System.out.println("Sexo: (1) Feminino ou (2) Masculino");
				sexo = entrada.nextInt();
				}
			if (sexo == 1){
			 nF ++;
				if (grauDeEscolaridade == 1){
					mulheresSegundoGrau ++;
				}
			}
			else if(sexo == 2){
				 nM ++;
					if (grauDeEscolaridade == 2){
						homensTerceiroagrau ++;
					}
				}
			entrada.nextLine();
	} 
		porcentagemHomens = (homensTerceiroagrau * 100)/ nM;
		System.out.println("Número de Pessoas:" + (nM + nF) + "\nMulheres com segundo grau: " + mulheresSegundoGrau + "\nHomens com terceiro grau: " + homensTerceiroagrau + "\nPorcentagem dos homens com terceiro grau completo:" + porcentagemHomens + "%" );
	}

}
