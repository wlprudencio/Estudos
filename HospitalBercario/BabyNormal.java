package HospitalBercario;

public class BabyNormal extends Mamae{
	
	private boolean vacinado;
	
	public BabyNormal(long id, String nome, String endereco, String telefone, String dataNascimento) {
		
		super(id, nome, endereco, telefone, dataNascimento);
		this.vacinado = vacinado;
		
	}

	public boolean getVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}

	@Override
	public String toString() {
		return "BabyNormal [vacinado=" + vacinado + "]";
	}
	

}
