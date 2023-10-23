import java.util.Scanner; // BIBLIOTECA PARA O BJETO SCANNER

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // PRECISAR CRIAR O OBJETO QUE FARÁ A CAPTURA DOS DADOS
		
		double peso;
		double altura;
		double imc;
		
		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble(); // SCANEA O VALOR DIGITADO DO TIPO DOUBLE
		
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		
				
		imc = peso/(altura*altura); // CALCULO IMC
		
		System.out.println("RESULTADO: \n ");
		
           // IF PARA VERIFICAR OBESIDADE
			
		if(imc <= 24.9) {
			System.out.println("Peso Ideal");
			System.out.printf("IMC = %.2f", imc);
		} else if (imc <= 29.9) {
			System.out.println("Levemente acima do peso");
			System.out.printf("IMC = %.2f", imc);
		} else {
			System.out.println("Obesidade");
			System.out.printf("IMC = %.2f", imc);
		}
		
		sc.close(); // FUNÇÃO QUE FINALIZA O OBJETO SCANNER
		
	}
		
}
