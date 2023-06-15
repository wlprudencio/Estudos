package HospitalBercario;

import java.util.ArrayList;
import java.util.Collection;

public class Mamae {
	
	private long id;
	private String nome;
	private String endereco;
	private String telefone;
	private String dataNascimento;
	private Collection<Baby> babys;
	
	public Mamae(long id, String nome, String endereco, String telefone, String dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		babys = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void addBaby(Baby babys) {
		if(this.babys.add(babys));
	}

	@Override
	public String toString() {
		return "Mamae [ID: " + id + ", NOME: " + nome + ", ENDEREÇO: " + endereco + ", TELEFONE: " + telefone
				+ ", DATA NASCIMENTO: " + dataNascimento + "]";
	}

	public void addBaby(String string) {
		
	}
	

}
