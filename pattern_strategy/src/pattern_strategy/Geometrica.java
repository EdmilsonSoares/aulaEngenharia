package pattern_strategy;

public class Geometrica implements ICalcMedia{
	public String Situacao(double media) {
		if(media < 7) {
			return "Reprovado";
		}
		else {
			return "Aprovado";
		}
	}
	
	public double CalculaMedia(double a, double b){
		return Math.sqrt(a*b);
	}
}
