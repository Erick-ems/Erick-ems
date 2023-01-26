package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controll.ControleCarro;
import controll.ControleDados;

public class TelaListaCarros2 implements ActionListener, ListSelectionListener{
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCarro;
	private static ControleDados dados;
	private JButton refreshCarro;
	private JList<String> listaCarrosCadastrados;
	private String[] listaCarros = new String[50];

	public void mostrarDados(ControleDados d) {
		dados = d;
		
		listaCarros = new ControleCarro(dados).getNomeCarro();
		listaCarrosCadastrados = new JList<String>(listaCarros);
		janela = new JFrame("CARROS");
		titulo = new JLabel("Carros");
		cadastroCarro = new JButton("Cadastrar");
		refreshCarro = new JButton("ATUALIZAR");

		titulo.setBounds(275, 10, 250, 30);
		listaCarrosCadastrados.setBounds(115, 50, 350, 120);
		listaCarrosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrosCadastrados.setVisibleRowCount(10);

		cadastroCarro.setBounds(100, 320, 125, 30);
		refreshCarro.setBounds(350, 320, 125, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaCarrosCadastrados);
		janela.add(cadastroCarro);
		janela.add(refreshCarro);

		janela.setSize(600, 400);
		janela.setVisible(true);

		cadastroCarro.addActionListener(this);
		refreshCarro.addActionListener(this);
		listaCarrosCadastrados.addListSelectionListener(this);

		janela.setLocationRelativeTo(null);
		janela.dispose();
	}

	public void valueChanged(ListSelectionEvent e) {
		
		
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaCarrosCadastrados) {
			new TelaCompraCarro().inserirEditar(dados, this, listaCarrosCadastrados.getSelectedIndex());
		}
	}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		// Cadastro de Carros

		if (src == refreshCarro) {
			listaCarrosCadastrados.setListData(new ControleCarro(dados).getNomeCarro());
			listaCarrosCadastrados.updateUI();
		}

	}

}
