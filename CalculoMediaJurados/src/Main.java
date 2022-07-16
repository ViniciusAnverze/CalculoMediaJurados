import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Jurados jurados = new Jurados();
		
		System.out.println("Digite o nome do(a) atleta: ");
		String nome = in.nextLine();
		
		Participante pa = new Participante(nome);
		
		jurados.setNotas();
		pa.calcularMedia(jurados.getNotas(), jurados.notaAlta, jurados.notaBaixa);
		
		System.out.println("a media do(a) atleta "+pa.getNome()+" e igual a "+pa.getMedia());
	}
}
