package controll;

import java.util.List;

import model.Marca;



public class ControleMarcas {
	
	private List<Marca> marcas;
	
	
	public ControleMarcas(ControleDados d) {
		marcas = d.getMarca();
	}
	
	
	
	
	
	public String[] getListaMarcas() {
		String[] listaMarcas = new String[marcas.size()];
		for(int i = 0; i<marcas.size(); i++) {
			listaMarcas[i] = (" " + marcas.get(i).getMarca());
		}
		return listaMarcas;
	}
	 


}
