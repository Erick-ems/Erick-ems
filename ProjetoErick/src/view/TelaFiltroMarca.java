package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controll.ControleCarro;
import controll.ControleDados;

public class TelaFiltroMarca implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private static ControleDados dados;
	private JList<String> listaCarrosCadastrados;
	private String[] listaCarros = new String[50];
	private JTextField pesquisa = new JTextField("Buscar Marca");
	private JButton buscar = new JButton("Buscar");

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		listaCarros = new ControleCarro(dados).getMarcaCarro();
		listaCarrosCadastrados = new JList<>(listaCarros);
		janela = new JFrame("MARCAS");
		titulo = new JLabel("MARCAS");

		titulo.setBounds(275, 10, 250, 30);
		listaCarrosCadastrados.setBounds(115, 50, 350, 120);
		listaCarrosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrosCadastrados.setVisibleRowCount(10);

		pesquisa.setBounds(210, 190, 160, 30);

		buscar.setBounds(240, 250, 100, 40);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaCarrosCadastrados);
		janela.add(pesquisa);
		janela.add(buscar);
		janela.setSize(600, 400);
		janela.setVisible(true);

		listaCarrosCadastrados.addListSelectionListener(this);
		listaCarrosCadastrados.setVisible(true);
		buscar.addActionListener(this);

		janela.setLocationRelativeTo(null);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaCarrosCadastrados) {
			new TelaListaCarros().mostrarDados(dados, 1);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == buscar) {
			listaCarrosCadastrados.updateUI();
			listaCarrosCadastrados.setVisible(true);
		}
	}

}
