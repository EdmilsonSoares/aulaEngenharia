package lanchonete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tipo;

		System.out.print("Selecione seu combo\n" + "1. Combo Master\n" + "2. Super Combo\n" + "Sua escolha: ");
		tipo = input.nextInt();

		Combo combo = new Combo();
		combo.CriarCombo(tipo);
		System.out.println(combo.combo());
		input.close();
	}

}
