package model;

import java.util.ArrayList;
import java.util.List;

public class Dados {
	private List<Marca> marca = new ArrayList<Marca>();


	public void cadastrosProntos() {
		marca.add(new Marca("AUDI"));
		marca.add(new Marca("BMW"));
		marca.add(new Marca("FIAT"));
		marca.add(new Marca("FORD"));
		marca.add(new Marca("KIA"));
		marca.add(new Marca("NISSAN"));
		marca.add(new Marca("PEUGEOT"));
		marca.add(new Marca("VOLKSWAGEN"));
		marca.add(new Marca("TOYOTA"));
		marca.add(new Marca("TESLA"));
	}
	
	public List<Marca> getMarca(){
		return marca;
	}
	public void setMarca(List<Marca> marca) {
		this.marca = marca;
	}
}
