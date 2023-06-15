package HospitalBercario;

public class BabyPrematuro extends Mamae {

	private long semanaDeGestacao;

	public BabyPrematuro(long id, String nome, String endereco, String telefone, String dataNascimento) {
		
		super(id, nome, endereco, telefone, dataNascimento);
		this.semanaDeGestacao = semanaDeGestacao;

	}

	public long getSemanaDeGestacao() {
		return semanaDeGestacao;
	}

	public void setSemanaDeGestacao(long semanaDeGestacao) {
		this.semanaDeGestacao = semanaDeGestacao;
	}

	@Override
	public String toString() {
		return "BabyPrematuro: [SemanaDeGestacao: " + semanaDeGestacao + "]";
	}
	

}
