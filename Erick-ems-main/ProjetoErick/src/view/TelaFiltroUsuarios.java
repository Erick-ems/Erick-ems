package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controll.ControleDados;




public class TelaFiltroUsuarios implements ActionListener {
	private static ControleDados dados = new ControleDados();
	private JFrame janela;
	private JLabel labelTitulo = new JLabel("Escolha seu tipo de Usuario");
	private JButton botaoPessoaFisica = new JButton("Pessoa Fisica");
	private JButton botaoPessoaJuridica = new JButton("Pessoa Juridica");
	
	public TelaFiltroUsuarios() {
		
		janela = new JFrame("Escolha de Usuario");
        janela.setLayout(null);
        
        
        // Adiciona o Titulo na tela
        janela.add(labelTitulo);
        labelTitulo.setBounds(220, 10, 400, 25);       
        
        
        
        // Adiciona o botao de Pessoa Fisica  
        janela.add(botaoPessoaFisica);
        botaoPessoaFisica.setBounds(50, 150, 200, 25);
        botaoPessoaFisica.addActionListener(this);
        
        
        
        
        // Adiciona o botao de Pessoa Juridica
        janela.add(botaoPessoaJuridica);
        botaoPessoaJuridica.setBounds(350, 150, 200, 25);
        botaoPessoaJuridica.addActionListener(this);
        
        
        
        // Define as configurações da janela
        janela.setSize(600, 400);
        janela.setVisible(true);
        janela.setLocale(null);
    	janela.setLocationRelativeTo(null);
        
    	janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
	@Override
	 public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botaoPessoaFisica) {
			new TelaListaCarros().mostrarDados(dados);
			janela.dispose();
		}
		if(e.getSource() == botaoPessoaJuridica) {
			new TelaTipoDeFiltro();
		}
	 }
	 
	 public static void main(String[] args) {
		 new TelaFiltroUsuarios();
	 }
	
	
	
}