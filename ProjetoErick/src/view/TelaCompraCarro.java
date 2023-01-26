package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controll.ControleDados;

public class TelaCompraCarro implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelEstilo = new JLabel("Estilo: ");
	private JTextField valorEstilo;
	private JLabel labelCategoria = new JLabel("Categoria: ");
	private JTextField valorCategoria;
	private JLabel labelAno = new JLabel("Ano: ");
	private JTextField valorAno;
	private JLabel labelQuilometragem = new JLabel("Quilometragem: ");
	private JTextField valorQuilometragem;
	private JLabel labelPreco = new JLabel("Preco: "); 
	private JTextField valorPreco;
	private JButton botaoCompra = new JButton("Comprar");
	public static ControleDados dados;
	private int posicao;

	private String s;

	public void inserirEditar(ControleDados d, TelaListaCarros2 p, int pos) {

		posicao = pos;
		dados = d;

		janela = new JFrame(s);

		// Preenche os dados com o Veiculo clicado

		valorNome = new JTextField(dados.getCarros()[pos].getNome(), 200);
		valorNome.setEditable(false);

		valorAno = new JTextField(String.valueOf(dados.getCarros()[pos].getAno()), 10);
		valorAno.setEditable(false);

		valorMarca = new JTextField(dados.getCarros()[pos].getMarca(), 200);
		valorMarca.setEditable(false);

		valorEstilo = new JTextField(dados.getCarros()[pos].getEstilo(), 200);
		valorEstilo.setEditable(false);

		valorCategoria = new JTextField(dados.getCarros()[pos].getCategoria(), 200);
		valorCategoria.setEditable(false);

		valorQuilometragem = new JTextField(dados.getCarros()[pos].getQuilometragem(), 200);
		valorQuilometragem.setEditable(false);

		valorPreco = new JTextField(dados.getCarros()[pos].getPreco(), 200);
		valorPreco.setEditable(false);

		labelNome.setBounds(90, 20, 150, 25);
		valorNome.setBounds(210, 20, 180, 25);

		labelAno.setBounds(90, 50, 180, 25);
		valorAno.setBounds(210, 50, 180, 25);

		labelMarca.setBounds(90, 80, 150, 25);
		valorMarca.setBounds(210, 80, 180, 25);

		labelEstilo.setBounds(90, 110, 150, 25);
		valorEstilo.setBounds(210, 110, 180, 25);

		labelCategoria.setBounds(90, 140, 150, 25);
		valorCategoria.setBounds(210, 140, 180, 25);

		labelQuilometragem.setBounds(90, 180, 150, 25);
		valorQuilometragem.setBounds(210, 180, 180, 25);

		labelPreco.setBounds(90, 210, 180, 25);
		valorPreco.setBounds(210, 210, 180, 25);

		botaoCompra.setBounds(150, 300, 115, 30);

		this.janela.add(botaoCompra);
		this.janela.add(labelNome);
		this.janela.add(labelMarca);
		this.janela.add(labelEstilo);
		this.janela.add(labelCategoria);
		this.janela.add(labelQuilometragem);
		this.janela.add(labelAno);
		this.janela.add(valorNome);
		this.janela.add(valorMarca);
		this.janela.add(valorEstilo);
		this.janela.add(valorCategoria);
		this.janela.add(valorQuilometragem);
		this.janela.add(valorAno);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		

		this.janela.setLayout(null);
		this.janela.setSize(600, 400);
		this.janela.setVisible(true);

		botaoCompra.addActionListener(this);

		janela.setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoCompra) {
			float preco = Float.parseFloat(valorPreco.getText());
			if (preco > 0) {
				boolean res = false;
				res = dados.removerCarro(posicao);
				if (res) {
					System.out.println("Carro Comprado");
				} else {
					System.out.println("Erro");
				}
			} else {
				System.out.println("Preço inválido");
			}
		}
	}
}
