package view;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControleDados;
import controll.*;





public class TelaFiltro implements ActionListener, ListSelectionListener {
	
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCarro;
	private static ControleDados dados;
	private JButton refreshCarro;
	private JList<String> listaCarrosCadastrados;
	private String[] listaCarros = new String[50];
	
	TelaFiltro(){
		
		listaCarros = new ControleCarros(dados).getNomeCarro();
		listaCarrosCadastrados = new Jlist<String>(listaCarros);
		janela = new JFrame("CARROS");
		titulo = new JLabel("Carros");
		cadastroCarro = new JButton("Cadastrar");
		refreshCarro = new JButton("ATUALIZAR");
		
		
		titulo.setBounds(90,10,250,30);
		listaCarrosCadastrados.setBounds(20, 50, 350, 120);
		listaCarrosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrosCadastrados.setVisibleRowCount(10);
		
		
		cadastroCarro.setBounds(70, 177, 100, 30);
		refreshCarro.setBounds(200, 177, 100, 30);
		
		
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(listaCarrosCadastrados);
		janela.add(cadastroCarro);
		janela.add(refreshCarro);
		
		
		janela.setSize(400, 250);
		janela.setVisible(true);
		
		
		
		cadastroCarro.addActionListener(this);
		refreshCarro.addActionListener(this);
		listaCarrosCadastrados.addListSelectionListener(this);
		
		
		
			
	}
	
	public void actionPerfomed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de Carros
		
		if(src == cadastroCarro) {
			new TelaCadastroCarro().inserirEditar(1,dados, this, 0);
		}
		if(src == refreshCarro) {
			listaCarrosCadastrados.setListData(new ControleCarro(dados).getNomeCarro());
		}
	}
	
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listaCarrosCadastrados) {
			new TelaCadastroCarro().inserirEditar(3, dados, this, listaCarrosCadastrados.getSelectedIndex());
		}
	}
	
	
	
	
	
	
	
	
	
}



