package controll;


import java.util.List;

import model.*;

public class ControleDados {
	private Dados d = new Dados();
	public ControleDados() {
		d.cadastrosProntos();
	}
	
	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}
	
	public List<Marca> getMarca() {
		return this.d.getMarca();
	}
}