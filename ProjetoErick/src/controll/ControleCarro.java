package controll;

import model.Carro;

public class ControleCarro {
	private Carro[] c;
	private int qtdCarros;

	public ControleCarro(ControleDados d) {
		c = d.getCarros();
		qtdCarros = d.getQtdCarros();
	}

	public String[] getMarcaCarro() {
		String[] s = new String[qtdCarros];
		for (int i = 0; i < qtdCarros; i++) {
			s[i] = c[i].getMarca();

		}

		return s;

	}

	public String[] getNomeCarro() {
		String[] n = new String[qtdCarros];
		for (int i = 0; i < qtdCarros; i++) {
			n[i] = c[i].getNome();
		}

		return n;
	}

	public String[] getValorPreco() {
		String[] v = new String[qtdCarros];
		for (int i = 0; i < qtdCarros; i++) {
			v[i] = c[i].getPreco();
		}

		return v;
	}

	public int getQtd() {
		return qtdCarros;
	}

	public void setQtd(int qtd) {
		this.qtdCarros = qtd;
	}

	public String getNome(int i) {
		return c[i].getNome();
	}

	public String getMarca(int i) {
		return c[i].getMarca();
	}

	public String getEstilo(int i) {
		return c[i].getEstilo();
	}

	public String getCategoria(int i) {
		return c[i].getCategoria();
	}

	public String getQuilometragem(int i) {
		return c[i].getQuilometragem();
	}

	public String getPreco(int i) {
		return c[i].getPreco();
	}

	public String getAno(int i) {
		String numAno = String.valueOf(c[i].getAno());
		return numAno;
	}

	public void setQtdCarros(int qtdCarros) {
		this.qtdCarros = qtdCarros;
	}

}
