import java.util.Scanner;

public class Jurados {
	
	Scanner in = new Scanner(System.in);

	public float notaAlta = 0, notaBaixa = 0, nota;
	public float notas[] = new float[7];
	
	public void setNotas() {
		
		for(int a = 0; a <= 6; a++) {
			System.out.println("Digite a nota do jurado "+(a+1));
			nota = in.nextFloat();
			
			if(a == 0) {
				notaAlta = nota;
				notaBaixa = nota;
			}
			else {
				if(notaAlta < nota) {
					notaAlta = nota;
				}
				if(notaBaixa > nota) {
					notaBaixa = nota;
				}
			}		
			notas[a] = nota;		
		}	
	}
	
	public void exibirNotas() {
		
		for(int a = 0; a <= 6; a++) {
			System.out.println(notas[a]);
		}
	}
	
	public float[] getNotas() {
		return notas;
	}
}
