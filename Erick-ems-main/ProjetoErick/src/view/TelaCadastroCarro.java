package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controll.ControleDados;

public class TelaCadastroCarro implements ActionListener {

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
	private JLabel labelPreco = new JLabel("Preço:");
	private JTextField valorPreco;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	public static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, TelaListaCarros p, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Veiculo";
		if (op == 3)
			s = "Detalhe do Veiculo";

		janela = new JFrame(s);

		// Preenche os dados com o Veiculo clicado

		if (op == 3) {
			valorNome = new JTextField(dados.getCarros()[pos].getNome(), 200);
			valorAno = new JTextField(String.valueOf(dados.getCarros()[pos].getAno()), 10);
			valorMarca = new JTextField(dados.getCarros()[pos].getMarca(), 200);
			valorEstilo = new JTextField(dados.getCarros()[pos].getEstilo(), 200);
			valorCategoria = new JTextField(dados.getCarros()[pos].getCategoria(), 200);
			valorQuilometragem = new JTextField(dados.getCarros()[pos].getQuilometragem(), 200);
			valorPreco = new JTextField(dados.getCarros()[pos].getPreco(), 200);

		}else {
			valorNome = new JTextField(200);
			valorAno = new JTextField(10);
			valorMarca = new JTextField(200);
			valorEstilo = new JTextField(200);
			valorCategoria = new JTextField(200);
			valorQuilometragem = new JTextField(200);
			valorPreco = new JTextField(200);

			botaoSalvar.setBounds(245, 175, 115, 30);

		}

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

		botaoSalvar.setBounds(150, 300, 115, 30);
		botaoExcluir.setBounds(280, 300, 115, 30);

		this.janela.add(botaoSalvar);
		this.janela.add(botaoExcluir);
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

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);

		janela.setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			boolean res = true;
			if (opcao == 1)
				novoDado[0] = Integer.toString(dados.getQtdCarros());
			else
				novoDado[0] = Integer.toString(posicao);

			novoDado[1] = valorNome.getText();
			novoDado[2] = valorAno.getText();
			novoDado[3] = valorMarca.getText();
			novoDado[4] = valorEstilo.getText();
			novoDado[5] = valorCategoria.getText();
			novoDado[6] = valorQuilometragem.getText();
			novoDado[7] = valorPreco.getText();

			if (opcao == 1 || opcao == 3) {
				res = dados.inserirEditarCarro(novoDado);
			}

			System.out.println(novoDado[1]);
			System.out.println(novoDado[2]);
			System.out.println(novoDado[3]);
			System.out.println(novoDado[4]);
			System.out.println(novoDado[5]);
			System.out.println(novoDado[6]);
			System.out.println(novoDado[7]);

			if (res) {
				mensagemSucessoCadastro();
			} else
				mensagemErroCadastro();

		}

		if (src == botaoExcluir) {
			boolean res = false;
			if (opcao == 3) {
				res = dados.removerCarro(posicao);
				if (res) {
					System.out.println("Carro Apagado");
				} else {
					System.out.println("Erro");
				}
			}
		}

	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. CPF, identidade, DDD e telefone n�o cont�m apenas n�meros",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoCarro() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o aluno est� matriculado\n"
						+ "em alguma disciplina. Se sim, cancele\n " + "a matricula e tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}
