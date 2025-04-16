package model;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
	}

	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setPessoa() {
		setNome(JOptionPane.showInputDialog("Informe o nome"));
		setEndereco(JOptionPane.showInputDialog("Informe o endereço"));
		setTelefone(JOptionPane.showInputDialog("Informe o telefone"));
	}
	
	@Override
	public String toString() {
	    return "Pessoa {\n" +
	           "  Nome: \"" + getNome() + "\",\n" +
	           "  Endereço: \"" + getEndereco() + "\",\n" +
	           "  Telefone: \"" + getTelefone() + "\"\n" +
	           "}";
	}
}
