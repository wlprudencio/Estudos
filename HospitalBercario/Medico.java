package HospitalBercario;

public class Medico extends Unidade {
	
	
	private long id;
	private String CRM;
	private String nome;
	private String celular;
	private Especialidade especialidade;
	
	public Medico(long id, String nome, long codigo, String CRM,String celular) {
		super(id, nome, codigo);
		this.id = id;
		this.CRM = CRM;
		this.nome = nome;
		this.celular = celular;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Medico [id=" + id + ", CRM=" + CRM + ", nome=" + nome + ", celular=" + celular + "]";
	}
	
	

}
