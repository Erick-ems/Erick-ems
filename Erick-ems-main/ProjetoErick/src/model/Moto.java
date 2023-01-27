package model;

public class Moto extends Veiculo{

	private String marca;
	private String estilo;
	private String cilindrada;

	
	
	public Moto(){
		super();
	}
	
	
	public Moto(String nome, int ano, String marca, String estilo, String cilindrada, String quilometragem,
			String preco) {
		this.nome = nome;
		this.ano = ano;
		this.marca = marca;
		this.estilo = estilo;
		this.cilindrada = cilindrada;
		this.quilometragem = quilometragem;
		this.preco = preco;

	}

	public void Moto1(String nome, int ano, String marca, String estilo, String cilindrada, String quilometragem,
			String preco) {
		this.nome = nome;
		this.ano = ano;
		this.marca = marca;
		this.estilo = estilo;
		this.cilindrada = cilindrada;
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

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
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
				+ '\'' + ", categoria='" + cilindrada + '\'' + ", quilometragem='" + quilometragem + '\'' + ", preco="
				+ preco + "\" " + '}';
	}
}
