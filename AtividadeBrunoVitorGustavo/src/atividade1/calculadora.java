package atividade1;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Digite um número: ");
				String numS = sc.next();
				num = Integer.parseInt(numS);
				break;
			} catch (Exception e) {
				System.out.println("Digite somente numeros!!");
			}
		}

		System.out.println("O numero é : " + num);
		sc.close();

	}

}
