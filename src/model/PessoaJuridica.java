package model;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String inscricaoEstadual;
	private Double salario;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual,
			Double salario) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.salario = salario;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setPessoaJuridica() {
		super.setPessoa();
		setCnpj(JOptionPane.showInputDialog("Informe o cnpj"));
		setInscricaoEstadual(JOptionPane.showInputDialog("Informe o I.E"));
		setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário")));
	}
	
	public void mostrarDados() {
	    JOptionPane.showMessageDialog(null, this.toString(), "Pessoa Jurídica", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public String toString() {
	    return String.format(
	        "PessoaJuridica\n" +
	        "  Nome: \"%s\",\n" +
	        "  Endereço: \"%s\",\n" +
	        "  Telefone: \"%s\",\n" +
	        "  CNPJ: \"%s\",\n" +
	        "  Inscrição Estadual: \"%s\",\n" +
	        "  Salário: R$ %.2f\n",
	        super.getNome(),
	        super.getEndereco(),
	        super.getTelefone(),
	        getCnpj(),
	        getInscricaoEstadual(),
	        getSalario()
	    );
	}

}
