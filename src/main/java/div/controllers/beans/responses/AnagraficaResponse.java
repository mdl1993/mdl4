package div.controllers.beans.responses;

import lombok.*;
import div.dao.domain.Anagrafica;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class AnagraficaResponse extends GenericResponse {
	private Anagrafica anagrafica = null;
}