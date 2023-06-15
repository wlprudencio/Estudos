package HospitalBercario;

import java.util.ArrayList;
import java.util.Collection;

public class Unidade {

	private long id;
	private long codigo;
	private String nome;
	private Collection<Hospital> hospitais;

	public Unidade(long id, String nome, long codigo) {
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		hospitais = new ArrayList<>();

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addHospital(Hospital hospitais) {
		this.hospitais.add(hospitais);
		}

	@Override
	public String toString() {
		return "Unidade: [ID: " + id + ", CODIGO :" + codigo + ", NOME: " + nome + "]";
	}

}
