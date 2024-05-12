package lanchonete;

public class Combo {
	Burger burger = new Burger();
	Bebida bebida = new Bebida();
	Sobremesa sobremesa = new Sobremesa();
	private String tipo;
	private double total;
	
	public void CriarCombo(int tipo) {
		switch (tipo) {
		case 1:
			this.tipo = "Combo Master";
			burger.setDescricao("Double Cheeseburger");
			burger.setPreco(15.99);
			burger.setGramas(200);
			bebida.setDescricao("Coca-Cola");
			bebida.setPreco(5.99);
			bebida.setMl(500);
			sobremesa.setDescricao("Sundae");
			sobremesa.setPreco(7.99);
			sobremesa.setTamanho("Grande");
			this.total = burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
			break;
		case 2:
			this.tipo = "Super Combo";
			burger.setDescricao("Big Mac");
			burger.setPreco(17.99);
			burger.setGramas(250);
			bebida.setDescricao("Fanta Laranja");
			bebida.setPreco(4.99);
			bebida.setMl(400);
			sobremesa.setDescricao("Casquinha");
			sobremesa.setPreco(3.99);
			sobremesa.setTamanho("Pequeno");
			this.total = burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
			break;
		default:
			System.out.println("Não selecionado");
			break;
		}
	}
	
	public String combo() {
		return tipo + "\n"
				+ burger.getDescricao()	+ " " + burger.getGramas() + " gramas\n"
				+ bebida.getDescricao() + " " + bebida.getMl() + " Ml\n"
				+ sobremesa.getDescricao() + " " + sobremesa.getTamanho() + "\n"
				+ "R$ " + total;
	}

}
