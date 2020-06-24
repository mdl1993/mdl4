package div.dao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provincia {

	private Integer idProvincia;
	private String descrizione;

	public Provincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}
}