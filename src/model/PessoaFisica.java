package model;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private String rg;
	private Double salario;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String endereco, String telefone, String cpf, String rg, Double salario) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.rg = rg;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void setPessoaFisica() {
		super.setPessoa();
		setCpf(JOptionPane.showInputDialog("Informe o cpf"));
		setRg(JOptionPane.showInputDialog("Informe o Rg"));
		 setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário")));
	}
	
	public void mostrarDados() {
	    JOptionPane.showMessageDialog(null, this.toString(), "Pessoa Física", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
	public String toString() {
	    return String.format(
	        "PessoaFisica\n" +
	        "  Nome: \"%s\",\n" +
	        "  Endereço: \"%s\",\n" +
	        "  Telefone: \"%s\",\n" +
	        "  CPF: \"%s\",\n" +
	        "  RG: \"%s\",\n" +
	        "  Salário: R$ %.2f\n",
	        super.getNome(),
	        super.getEndereco(),
	        super.getTelefone(),
	        getCpf(),
	        getRg(),
	        getSalario()
	    );
	}

}
