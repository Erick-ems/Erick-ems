package model;

import java.util.ArrayList;
import java.util.List;

import model.Carro;

public class Dados {

	private  Carro[] carros = new Carro[50];
	private int qtdCarros = 0;


	public void fillWithSomeData() {
		
		for(int i = 0; i < 5; i++) {
			carros[i] = new Carro("A4"+i, "Audi"+i, "seda"+i, "esportivo"+i, "180000"+i, "2008"+i, i);
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
		if(pos == qtdCarros) qtdCarros++;
	}
	
	public int getQtdCarros() {
		return qtdCarros;
	}
	public void setQtdCarros(int qtdCarros) {
		this.qtdCarros = qtdCarros;
	}



}