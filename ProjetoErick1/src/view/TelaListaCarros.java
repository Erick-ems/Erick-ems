package view;

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

import controll.*;
import view.*;

public class TelaListaCarros implements  ActionListener, ListSelectionListener {
	
	private static ControleDados d;
	private JFrame janela;
	private JLabel titulo;
	private JButton adicionarCarro = new JButton("Carro+");
	private JList<String> carros;	
	
	
	
	
	public TelaListaCarros (ControleDados d) {
		this.d=d;
		
		
		
		janela = new JFrame("Carros");
		titulo = new JLabel("Carros");
		
		
		carros = new JList<String>(new ControleCarros(d, 0, 0). getCarros());
		carros.setBounds(20, 65, 250, 300);
		carros.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		carros.setVisibleRowCount(10);
		carros.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		
		
		
		titulo.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		titulo.setBounds(20, 15, 140, 35);
		
		adicionarCarro.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		adicionarCarro.setBounds(280, 70, 105, 30);
		adicionarCarro.addActionListener(this);
		
		
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(carros);
		janela.add(adicionarCarro);
		
		
		janela.setSize(410, 450);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		
		
	}
	
	
	


	public TelaListaCarros(ControleDados d2, String string) {
		// TODO Auto-generated constructor stub
	}





	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == adicionarCarro) {
			new TelaFiltroMarca(d);
			janela.dispose();
		}
	

	
	}





	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
