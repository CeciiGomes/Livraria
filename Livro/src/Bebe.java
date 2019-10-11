import java.sql.Date;

public class Bebe {

	private Long id;
	private String nome;
	private Date data_nascimento;
	private double peso_nascimento;
	private double altura;
	private String mae_bebe;
	private String medico_parto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public double getPeso_nascimento() {
		return peso_nascimento;
	}
	public void setPeso_nascimento(double peso_nascimento) {
		this.peso_nascimento = peso_nascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getMae_bebe() {
		return mae_bebe;
	}
	public void setMae_bebe(String mae_bebe) {
		this.mae_bebe = mae_bebe;
	}
	public String getMedico_parto() {
		return medico_parto;
	}
	public void setMedico_parto(String medico_parto) {
		this.medico_parto = medico_parto;
	}
}
