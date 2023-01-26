package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import controll.ControleDados;

public class TelaTipoDeFiltro implements ActionListener {

	private JFrame janela;
	private JLabel labelTitulo = new JLabel("SELECIONE UM DOS FILTROS ");

	private JButton botaoMarca = new JButton("Marcas");
	private JButton botaoPreco = new JButton("PREÇO");
	public static ControleDados dados = new ControleDados();

	public TelaTipoDeFiltro() {
		janela = new JFrame("FILTRO DE PESQUISA");
		janela.setLayout(null);

		janela.add(labelTitulo);
		labelTitulo.setBounds(200, 10, 300, 25);

		janela.add(botaoMarca);
		botaoMarca.setBounds(150, 150, 100, 25);
		botaoMarca.addActionListener(this);

		janela.add(botaoPreco);
		botaoPreco.setBounds(350, 150, 100, 25);
		botaoPreco.addActionListener(this);

		// Define as configurações da janela
		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoMarca) {
			new TelaFiltroMarca().mostrarDados(dados);
			janela.dispose();
		}
		if (e.getSource() == botaoPreco) {
			new TelaFiltroPreco().mostrarDados(dados, 1);
			janela.dispose();

		}
	}

}