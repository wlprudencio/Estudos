package HospitalBercario;

public class Baby  {
	

	private long id;
	private String nome;
	private String dataNascimento;
	private double peso;
	private double altura;
	private Mamae mamae;
	
	public Baby(long id, String nome,  String dataNascimento, double peso,double altura) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
		
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Baby [ID: " + id + ", NOME:" + nome + ", DATA NASCIMENTO: " + dataNascimento + ", PESO:" + peso
				+ ", ALTURA: " + altura + ", MAMAE:" + this.mamae + "]";
	}
	

}
