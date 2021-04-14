package entidade;

public class Fibonacci {
		
	public static boolean sequencia(int n) {
		int n1 = 0;//Anterior
		int n2 = 1;//Atual
		int n3 = 0;//Próximo
		while(n > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}if(n == 0) {
			System.out.println("Sucesso: O numero "+n+" está na sequência de Fibonacci. O próximo número é: 1");
			return true;
		}else if(n == n3) {
			System.out.println("Sucesso: O numero "+n+" está na sequência de Fibonacci. O próximo número é: "+(n1+n));
			return true;
		}else {
			System.out.println("Falha: O numero informado não pertence a sequência de Fibonacci");
			return false;
		}
		
		
		
		      
    }
}
