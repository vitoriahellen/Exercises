import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Digite um numero inteiro: \n");
		n = sc.nextInt();
		
		if (n%2==0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");
		}
		
		
		
		sc.close(); // FUNÇÃO QUE FINALIZA O OBJETO SCANNER
	}

}
