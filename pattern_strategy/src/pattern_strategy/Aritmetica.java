package pattern_strategy;

public class Aritmetica implements ICalcMedia{
	
	public String Situacao(double media) {
		if(media < 5) {
			return "Reprovado";
		}
		else {
			return "Aprovado";
		}
	}
	
	public double CalculaMedia(double a, double b){
		return (a+b)/2;
	}
}