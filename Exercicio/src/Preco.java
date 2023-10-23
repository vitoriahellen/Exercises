import java.util.Scanner;

public class Preco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		
		
		System.out.println("Digite o codigo: \n");
		codigo = sc.nextInt();
		
		System.out.println("Quantidade: \n");
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			double soma;
			soma = quantidade * 4;
			System.out.printf("Total: %.2f",soma);
		} else if (codigo == 2) {
			double soma;
			soma = quantidade * 4.50;
			System.out.printf("Total: %.2f",soma);
		} else if(codigo == 3) {
			double soma;
			soma = quantidade * 5;
			System.out.printf("Total: %.2f",soma);
		}else if (codigo == 4) {
			double soma;
			soma = quantidade * 2;
			System.out.printf("Total: %.2f",soma);
		}else if(codigo == 5) {
			double soma;
			soma = quantidade * 1.5;
			System.out.printf("Total: %.2f",soma);
		}else {
			System.out.printf("Digite um codigo valido");
		}
		
		
		
		sc.close();
	}

}
