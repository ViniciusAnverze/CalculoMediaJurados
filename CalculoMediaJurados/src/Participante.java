
public class Participante extends Jurados{
	
	public float media;
	public String nome;
	
	public Participante(String nome) {
		this.nome = nome;
	}
	
	public void calcularMedia(float[] notas, float notaAlta, float notaBaixa) {
		
		super.notas = notas;
		
		for(int a = 0; a <= 6; a++) {
			media += notas[a];
		}
		media = media - notaAlta;
		media = media - notaBaixa;
		media = media/5;
	}
	
	public float getMedia() {
		return media;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
