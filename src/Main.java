import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual exercício você quer ver? ");
		int exercicio = sc.nextInt();

		switch (exercicio) {
		case 1:
			exercicio01();
			break;
		case 2:
			exercicio02();
			break;
		case 3:
			exercicio03();
			break;
		}

		sc.close();
	}

	public static void exercicio01() {
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		
		sc.close();
	}

	public static void exercicio02() {
		Scanner sc = new Scanner(System.in);

		double valorX = sc.nextDouble();
		double valorY = sc.nextDouble();
		String saida = "";

		while (valorX != 0 && valorY != 0) {
			if (valorX > 0 && valorY > 0) {
				saida = "Q1";
			} else if (valorX < 0 && valorY > 0) {
				saida = "Q2";
			} else if (valorX < 0 && valorY < 0) {
				saida = "Q3";
			} else if (valorX > 0 && valorY < 0) {
				saida = "Q4";
			}

			System.out.println(saida);

			valorX = sc.nextDouble();
			valorY = sc.nextDouble();
		}

		sc.close();
	}

	public static void exercicio03() {
		Scanner sc = new Scanner(System.in);

		int tipoCombustivel = sc.nextInt();
		int qtdeComb1 = 0;
		int qtdeComb2 = 0;
		int qtdeComb3 = 0;

		while (tipoCombustivel != 4) {
			switch (tipoCombustivel) {
			case 1:
				qtdeComb1 += 1;
				break;
			case 2:
				qtdeComb2 += 1;
				break;
			case 3:
				qtdeComb3 += 1;
				break;
			default:
				break;
			}

			tipoCombustivel = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + qtdeComb1);
		System.out.println("Gasolina: " + qtdeComb2);
		System.out.println("Diesel: " + qtdeComb3);

		sc.close();
	}

}
