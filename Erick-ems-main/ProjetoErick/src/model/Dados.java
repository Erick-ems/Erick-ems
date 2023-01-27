package model;

public class Dados {

	private Carro[] carros = new Carro[9999];
	private int qtdCarros = 0;

	public void fillWithSomeData() {

		for (int i = 0; i < 5; i++) {
			carros[i] = new Carro("A"+(i+3), 2008,"Audi", "esportivo", "seda", "9000000", (2 * (i+1) )+"0000");
		}
		


		qtdCarros = 5;

	}

	public Carro[] getCarros() {
		return carros;
	}

	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}

	public void inserirEditarCarro(Carro c, int pos) {
		this.carros[pos] = c;
		if (pos == qtdCarros)
			qtdCarros++;
	}

	public int getQtdCarros() {
		return qtdCarros;
	}

	public void setQtdCarros(int qtdCarros) {
		this.qtdCarros = qtdCarros;
	}

}