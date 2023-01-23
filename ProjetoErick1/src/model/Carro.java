package model;



public class Carro {

    private String nome;
    private String marca;
    private int ano;
    private String estilo;
    private String categoria;
    private String quilometragem;

    public Carro(String nome,String marca, int ano, String estilo, String categoria, String quilometragem) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.estilo = estilo;
        this.categoria = categoria;
        this.quilometragem = quilometragem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
    	return marca;
    }
    public void setMarca(String marca) {
    	this.marca = marca;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                ", estilo='" + estilo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", quilometragem='" + quilometragem + '\'' +
                '}';
    }
}