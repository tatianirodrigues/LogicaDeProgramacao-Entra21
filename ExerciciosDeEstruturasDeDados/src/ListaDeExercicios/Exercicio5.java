/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. Após isto, calcule a
//média anual das temperaturas e mostre todas as temperaturas acima da média anual, e em que mês elas
//ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
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
		
		float somaAnual = 0, mediaAnual;
		
		float [] temperaturaMes = new float [12];
		
		String [] nomeMes = new String [12];
		
		nomeMes [0] = "Janeiro";
		nomeMes [1]= "Fevereiro";
		nomeMes [2]= "Marco";
		nomeMes [3]= "Abril";
		nomeMes [4]= "Maio";
		nomeMes [5]= "Junho";
		nomeMes [6]= "Julho";
		nomeMes [7]= "Agosto";
		nomeMes [8]= "Setembro";
		nomeMes [9]= "Outubro";
		nomeMes [10]= "Novembro";
		nomeMes [11]= "Dezembro";
		
		for (int i = 0; i < temperaturaMes.length; i ++) {
			System.out.print("Insira a media de temperatura do mes " + (i+1) + ":");
			temperaturaMes[i] = entrada.nextFloat();
			somaAnual += temperaturaMes[i];
		}
		mediaAnual = (somaAnual)/12;
		
		System.out.println("\nMedia anual: " + mediaAnual + " oC");
		
		System.out.println("\nMeses com a temperatuta acima da media Anual:");
		
		for (int i = 0; i < temperaturaMes.length; i ++) {
			if (mediaAnual < temperaturaMes[i]) {
				System.out.print( (i+1) + "-" + nomeMes [i] + " ");
			}
		}
		
	}

}
