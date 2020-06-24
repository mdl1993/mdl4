package div.controllers.beans.requests;

import div.dao.domain.Anagrafica;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class AnagraficaRequest extends GenericRequest {
	private Anagrafica anagrafica = null;
}