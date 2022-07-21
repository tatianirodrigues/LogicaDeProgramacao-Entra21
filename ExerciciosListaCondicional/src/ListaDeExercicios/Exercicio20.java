package ListaDeExercicios;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double horasTrabalhadas, horasExtras, salarioLiqui, salarioBruto, salHoraExtra, INSS, impostoRenda;
		String nome;

		System.out.println("Nome:");
		nome = entrada.nextLine();

		System.out.println("Horas trabalhadas:");
		horasTrabalhadas = entrada.nextDouble();

		System.out.println("Horas extras:");
		horasExtras = entrada.nextDouble();

		salHoraExtra = horasExtras * 10;

		salarioBruto = (3*1025) + salHoraExtra;

		if (salarioBruto > 2000) {
			INSS = 2000 * 0.12;
		}
		else {
			INSS = 0;
		}

		if (salarioBruto > 1500  &&  salarioBruto <= 2500) {
			impostoRenda = salarioBruto * 0.15;
		}
		else if (salarioBruto > 2500  &&  salarioBruto <= 4000) {
			impostoRenda = salarioBruto * 0.275;
		}
		else {
			impostoRenda = salarioBruto * 0.35;
		}

		salarioLiqui = salarioBruto - impostoRenda - INSS;

		System.out.println("Salario Bruto = R$ " + salarioBruto + "\nSalario Liquido = R$ " + 	salarioLiqui +"\nINSS = R$ " + INSS + "\nImposto de Renda + R$ " + impostoRenda);

	}
}
