package HospitalBercario;

//Se tem é Herança
// Se é e Composição 

import java.util.ArrayList;
import java.util.Collection;

public class Hospital {
	
	private long id;
	private String nome;
	private Collection<Unidade> Unidades;
	
	
	public Hospital(long id, String nome) {
		this.id = id;
		this.nome = nome;
		this.Unidades = new ArrayList<>();
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
	
	public void addUnidade(Unidade unidades) {
		if(this.Unidades.add(unidades));
		
	}

	@Override
	public String toString() {
		return "Hospital: [ID: " + id + ", NOME DA UNIDADE: " + nome + "]";
	}
	
	

}
