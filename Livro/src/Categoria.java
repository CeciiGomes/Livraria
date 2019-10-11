import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Identificavel{
	
	
	@Id
	private String descrição;
	private int codigo_categoria;
	private Long id;
	
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public int getCodigo_categoria() {
		return codigo_categoria;
	}
	public void setCodigo_categoria(int codigo_categoria) {
		this.codigo_categoria = codigo_categoria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
