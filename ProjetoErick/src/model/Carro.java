package model;

public class Carro {

	private String nome;
	private int ano;
	private String marca;
	private String estilo;
	private String categoria;
	private String quilometragem;
	private String preco;

	public Carro(String nome, int ano, String estilo, String categoria, String quilometragem, String preco,
			String marca) {
		this.nome = nome;
		this.ano = ano;
		this.marca = marca;
		this.estilo = estilo;
		this.categoria = categoria;
		this.quilometragem = quilometragem;
		this.preco = preco;

	}

	public void Carro1(String nome, int ano, String estilo, String categoria, String quilometragem, String preco,
			String marca) {
		this.nome = nome;
		this.ano = ano;
		this.marca = marca;
		this.estilo = estilo;
		this.categoria = categoria;
		this.quilometragem = quilometragem;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Carro{" + "nome='" + nome + '\'' + ", ano=" + ano + ", marca='" + marca + '\'' + ", estilo='" + estilo
				+ '\'' + ", categoria='" + categoria + '\'' + ", quilometragem='" + quilometragem + '\'' + ", preco="
				+ preco + "\" " + '}';
	}
}
