import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] v = new int[5];
		// metodo
		preencher(v);
		int maior = maiorValor(v);
		int menor = menorValor(v);
		System.out.println("Maior valor --> " + maior);
		System.out.println("Menor valor --> " + menor);
		System.out.println("Fechando o projeto");
	}
	
	public static void preencher(int[] v) {
		Scanner teclado = new Scanner(System.in);
		
		for(int i =0;i<v.length;i++) {
			System.out.print("Valor: ");
			v[i] = teclado.nextInt();
		}
		teclado.close();
		
	}
	
	public static int maiorValor(int[] v) {
		int maior = v[0];
		for(int i =0;i<v.length;i++) {
			if(v[i] > maior) {
				maior = v[i];
			}
				
		}
		return maior;
	}
	
	
	public static int menorValor(int[] v) {
		int menor = v[0];
		for(int i =0;i<v.length;i++) {
			if(v[i] < menor) {
				menor = v[i];
			}
		}
		return menor;
	}
	
	

}
