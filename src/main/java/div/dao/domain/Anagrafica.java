package div.dao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anagrafica {

	private Integer id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private Provincia provinciaNascita;
	private Integer eta;
	private String sesso;
	private Boolean categoriaProtetta;
	private String curriculum;
}