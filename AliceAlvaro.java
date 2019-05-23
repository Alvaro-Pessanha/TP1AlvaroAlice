import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a;
		System.out.print("Digite o numero do mes que deseja saber: 1 a 12\n--> ");
		a = STDIN_SCANNER.nextInt();
		switch(a) {
		case 1:
			System.out.print("\nJaneiro");
			break;
		case 2:
			System.out.print("\nFevereiro");
			break;
		case 3:
			System.out.print("\nMarço");
			break;
		case 4:
			System.out.print("\nAbril");
			break;
		case 5:
			System.out.print("\nMaio");
			break;
		case 6:
			System.out.print("\nJunho");
			break;
		case 7:
			System.out.print("\nJulho");
			break;
		case 8:
			System.out.print("\nAgosto");
			break;
		case 9:
			System.out.print("\nSetembro");
			break;
		case 10:
			System.out.print("\nOutubro");
			break;
		case 11:
			System.out.print("\nNovembro");
			break;
		case 12:
			System.out.print("\nDezembro");
			break;
		default:
			System.out.print("Não existe.");
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
