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

import controll.*;





public class TelaFiltroMarca implements ActionListener, ListSelectionListener {

	public static Color c1 = new Color(245,245,220), c2 = new Color(139,0,0); 
	private static ControleDados d = new ControleDados();
	private JFrame janela = new JFrame("MARCAS");
	private JLabel titulo = new JLabel("MARCAS");
	private JButton telaInicial = new JButton("Voltar");
	private JList<String> marcas;

		
	
	TelaFiltroMarca(ControleDados d){
		this.d=d;
		
		
	    marcas = new JList<String>(new ControleDados(d).getMarca());
		marcas.setBounds(100, 50, 250, 250);
		marcas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		marcas.setVisibleRowCount(10);
		marcas.addListSelectionListener(this);
		marcas.setFont(new Font("Calibri Light", Font.PLAIN, 20));

		
		
		
		
		
		telaInicial.setBounds(180, 320, 90, 30);
		telaInicial.addActionListener(this);
		
		titulo.setBounds(180, 20, 200, 30);
		titulo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		
		
		
		
		janela.setLayout(null);
		janela.add(telaInicial);
		janela.add(marcas);
		janela.add(titulo);
		janela.setSize(500, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.getContentPane().setBackground(c1);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == telaInicial) {
			new TelaInicial();
			janela.dispose();
		}
			
		
	}
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == marcas) {
			new TelaListaCarros(d);
			janela.dispose();
		}
	
}
}
