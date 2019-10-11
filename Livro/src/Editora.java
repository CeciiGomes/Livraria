import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Editora implements Identificavel{

	@Id
	private String nome_editora;
	private String cidade;
	private Long id;
	
	public String getNome_editora() {
		return nome_editora;
	}
	public void setNome_editora(String nome_editora) {
		this.nome_editora = nome_editora;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
