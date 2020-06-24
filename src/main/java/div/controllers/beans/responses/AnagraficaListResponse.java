package div.controllers.beans.responses;

import java.util.*;
import div.dao.domain.Anagrafica;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class AnagraficaListResponse extends GenericResponse {
	private List<Anagrafica> list = null;
}