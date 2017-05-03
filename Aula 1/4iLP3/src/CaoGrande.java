import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CAO_GRANDE");
public class CaoGrande extends Cao{
	private String pesoCoco;

	public String getPesoCoco() {
		return pesoCoco;
	}

	public void setPesoCoco(String pesoCoco) {
		this.pesoCoco = pesoCoco;
	}

}
