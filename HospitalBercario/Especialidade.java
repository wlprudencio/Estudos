package HospitalBercario;

import java.util.ArrayList;
import java.util.Collection;

public class Especialidade extends Medico {

	private long id;
	private String nome;
	private Collection<Medico> medicos;

	public Especialidade(long id, String nome, long codigo, String CRM, String celular) {
		super(id, nome, codigo, CRM, celular);
		this.id = id;
		this.nome = nome;
		this.medicos = new ArrayList<>();
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
	
	public void addMedico(Medico medicos) {
		this.addMedico(medicos);
	}

	@Override
	public String toString() {
		return "Especialidade [id=" + id + ", nome=" + nome + "]";
	}

}
