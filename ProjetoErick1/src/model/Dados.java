package model;

import java.util.ArrayList;
import java.util.List;

public class Dados {
	private List<Marca> marca = new ArrayList<Marca>();
	private List<Carro> carro = new ArrayList<>();
	private List<List<Carro>> carrosCadastrados = new ArrayList<List<Carro>>();
	
	
	
	
	

	public void cadastrosProntos() {
		
		
		
		
		Carro Audi = new Carro ("A4","Audi", 0, null, null, null);
		
		
		carrosCadastrados.add(carro);
		carrosCadastrados.get(0).add(Audi);
		carro = new ArrayList<>();
		
		
		
				
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
	
	public List<List<Carro>> getCarroCadastrados(){
		return carrosCadastrados;
	}
	public void setCarrosCadastrados(List<List<Carro>> carrosCadastrados) {
		this.carrosCadastrados = carrosCadastrados;
	}
	public List<Carro> getCarro(){
		return carro;
	}
	public void setCarros(List<Carro> carro) {
		this.carro = carro;
	}
}
