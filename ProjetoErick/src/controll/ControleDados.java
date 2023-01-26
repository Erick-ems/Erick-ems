package controll;

import model.Carro;
import model.Dados;

public class ControleDados {
	private Dados d = new Dados();

	public ControleDados() {
		d.fillWithSomeData();

	}

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public Carro[] getCarros() {
		return this.d.getCarros();
	}

	public int getQtdCarros() {
		return this.d.getQtdCarros();
	}

	public boolean inserirEditarCarro(String[] dadosCarros) {
			Carro c = new Carro(dadosCarros[1], Integer.parseInt(dadosCarros[2]), dadosCarros[3], dadosCarros[4], dadosCarros[5],
				dadosCarros[6],dadosCarros[7]);
			d.inserirEditarCarro(c, Integer.parseInt(dadosCarros[0]));
			return true;

	}

	public boolean removerCarro(int i) {

		String carroRemovido = d.getCarros()[i].getNome();

		if (i == (d.getQtdCarros() - 1)) {
			d.setQtdCarros(d.getQtdCarros() - 1);
			d.getCarros()[d.getQtdCarros()] = null;
			return true;
		} else {
			int cont = 0;
			while (d.getCarros()[cont].getNome().compareTo(carroRemovido) != 0) {
				cont++;
			}

			for (int j = cont; j < d.getQtdCarros() - 1; j++) {
				d.getCarros()[j] = null;
				d.getCarros()[j] = d.getCarros()[j + 1];
			}
			d.getCarros()[d.getQtdCarros()] = null;
			d.setQtdCarros(d.getQtdCarros() - 1);
			return true;

		}
	}

}
