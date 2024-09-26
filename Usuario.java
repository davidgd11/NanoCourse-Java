package br.com.fiap.main;



public class Usuario {
	
	//Atributos para dados pessoais do usuario (Nome, CPF, Endereço e outras infos)
	
	private String nome;
	private String cpf;
	private String endereco;
	
	public Usuario(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Usuario{nome: " + getNome() + ", cpf: " + getCpf() + ", endereço: " + getEndereco() + "}";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		//Verifica se é o mesmo objeto
		if (this == obj) {
			return true;
		}
		//Verifica se o parametro recebido é nulo ou se sao de classes diferentes
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Usuario usuario = (Usuario) obj;
		return cpf.equals(usuario.getCpf());
	}
	
	
}
