package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controll.ControleCarro;
import controll.ControleDados;

public class TelaFiltroPreco implements ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private static ControleDados dados;
	private JList<String> listaCarrosCadastrados;
	private String[] listaCarros = new String[50];

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		listaCarros = new ControleCarro(dados).getValorPreco();
		listaCarrosCadastrados = new JList<>(listaCarros);
		janela = new JFrame("PREÇO");
		titulo = new JLabel("INTERVALO DE PREÇO");

		titulo.setBounds(230, 10, 250, 30);
		listaCarrosCadastrados.setBounds(115, 50, 350, 120);
		listaCarrosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrosCadastrados.setVisibleRowCount(10);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaCarrosCadastrados);
		janela.setSize(600, 400);
		janela.setVisible(true);

		listaCarrosCadastrados.addListSelectionListener(this);

		janela.setLocationRelativeTo(null);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaCarrosCadastrados) {
			new TelaListaCarros().mostrarDados(dados, 1);
		}
	}

}
