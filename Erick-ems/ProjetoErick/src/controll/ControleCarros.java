package controll;

import model.*;



public class ControleCarros {
	private Carro[] c;
	private int qtdCarros;
	
	
	public ControleCarros(ControleDados d) {
		c = d.getCarros();
		qtdCarros = d.getCarros();
	}
	
	public String[] getNomeCarro() {
		String[] s = new String[qtdCarros];
		for(int i = 0; i < qtdCarros; i++) {
			s[i] = c[i].getNome();
	
		}
		
		return s;
		
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
	public String getAno(int i ) {
		String numAno = String.valueOf(c[i].getAno());
		return numAno;
	}
	
	
}


