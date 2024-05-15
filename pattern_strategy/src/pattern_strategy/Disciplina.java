package pattern_strategy;

public class Disciplina {
	private ICalcMedia CalcMedia; 
	public double Media;
	private String Nome;
	private double P1;
	private double P2;
	public String Situacao;
	
	public void CalcularMedia() {
		this.Media = this.CalcMedia.CalculaMedia(P1, P2);
	}
	
	public Disciplina(ICalcMedia calculo) {
		this.CalcMedia = calculo;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getNome() {
		return Nome;
	}
	
	public void setP1(double nota) {
		this.P1 = nota;
	}
	public double getP1() {
		return P1;
	}
	
	public void setP2(double nota) {
		this.P2 = nota;
	}
	public double getP2() {
		return P2;
	}
	
	public double getMedia() {
		return Media;
	}
	
	public String getSituacao() {
		this.Situacao = this.CalcMedia.Situacao(Media);
		return Situacao;
	}
	
}
