package model;

public class Marca{
	protected String marca;
	
	
	
	public Marca(String marca) {
		super();
		this.marca = marca;
	}
	
	
	@Override
	public String toString() {
		return marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setNome(String marca) {
		this.marca = marca;
	}

	
	
}
