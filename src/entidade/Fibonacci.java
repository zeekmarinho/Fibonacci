package entidade;

public class Fibonacci {
		
	public static boolean sequencia(int n) {
		int n1 = 0;//Anterior
		int n2 = 1;//Atual
		int n3 = 0;//Pr�ximo
		while(n > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}if(n == 0) {
			System.out.println("Sucesso: O numero "+n+" est� na sequ�ncia de Fibonacci. O pr�ximo n�mero �: 1");
			return true;
		}else if(n == n3) {
			System.out.println("Sucesso: O numero "+n+" est� na sequ�ncia de Fibonacci. O pr�ximo n�mero �: "+(n1+n));
			return true;
		}else {
			System.out.println("Falha: O numero informado n�o pertence a sequ�ncia de Fibonacci");
			return false;
		}
		
		
		
		      
    }
}
