package div.controllers;

import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import div.controllers.beans.a.Esito;
import div.controllers.beans.requests.AnagraficaRequest;
import div.controllers.beans.responses.AnagraficaListResponse;
import div.controllers.beans.responses.AnagraficaResponse;
import div.controllers.beans.responses.GenericResponse;
import div.dao.domain.Anagrafica;
import div.services.AnagraficaService;
import div.services.exceptions.ServiceException;

@Slf4j
@RestController
public class AnagraficaController extends BaseController {

	@Autowired
	private AnagraficaService anagraficaService = null;

	/**
	 * @return HttpEntity
	 */
	@RequestMapping(value = "/anagrafica", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<AnagraficaListResponse> getAll() {

		HttpEntity<AnagraficaListResponse> httpEntity = null;

		AnagraficaListResponse anagraficaListResponse = new AnagraficaListResponse();

		try {
			log.info("START invocation getAll() of controller layer");

			List<Anagrafica> anagrafiche = anagraficaService.getListaAnagrafica();

			anagraficaListResponse.setList(anagrafiche);
			anagraficaListResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<AnagraficaListResponse>(anagraficaListResponse);

			log.info("END invocation getAll() of controller layer");

		} catch(ServiceException e) {
			anagraficaListResponse.setEsito(new Esito(e.getMessage()));
			httpEntity = new HttpEntity<AnagraficaListResponse>(anagraficaListResponse);
		}

		return httpEntity;
	}

	/**
	 * @param ID
	 * @return HttpEntity
	 */
	@RequestMapping(value = "/anagrafica/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<AnagraficaResponse> get(@PathVariable("id") Integer ID) {

		HttpEntity<AnagraficaResponse> httpEntity = null;

		AnagraficaResponse anagraficaResponse = new AnagraficaResponse();

		try {
			log.info("START invocation get() of controller layer");

			Anagrafica anagrafica = anagraficaService.getAnagrafica(ID);

			anagraficaResponse.setAnagrafica(anagrafica);
			anagraficaResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<AnagraficaResponse>(anagraficaResponse);

			log.info("END invocation get() of controller layer");

		} catch(ServiceException e) {
			anagraficaResponse.setEsito(new Esito(e.getMessage()));
			httpEntity = new HttpEntity<AnagraficaResponse>(anagraficaResponse);
		}

		return httpEntity;
	}

	/**
	 * @param anagraficaRequest
	 * @return HttpEntity
	 *
	 * {"anagrafica": {"nome": "Paolo", "cognome": "Giardina", "codiceFiscale": "MTORMD70H65H501Z", "provinciaNascita": {"idProvincia": 1}, "eta": 34, "sesso": "M", "categoriaProtetta": true, "curriculum": "Competente"}}
	 */
	@RequestMapping(value = "/anagrafica", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody HttpEntity<GenericResponse> insert(@RequestBody AnagraficaRequest anagraficaRequest) {

		HttpEntity<GenericResponse> httpEntity = null;

		GenericResponse genericResponse = new GenericResponse();

		try {
			log.info("START invocation insert() of controller layer");

			anagraficaService.insert(anagraficaRequest.getAnagrafica());

			genericResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<GenericResponse>(genericResponse);

			log.info("END invocation insert() of controller layer");

		} catch(Exception e) {
			genericResponse.setEsito(new Esito(e.getMessage()));
			httpEntity = new HttpEntity<GenericResponse>(genericResponse);
		}

		return httpEntity;
	}

	/**
	 * @param anagraficaRequest
	 * @return HttpEntity
	 *
	 * {"anagrafica": {"id": 132, "nome": "Paolo", "cognome": "Giardina", "codiceFiscale": "MTORMD70H65H501Z", "provinciaNascita": {"idProvincia": 1}, "eta": 34, "sesso": "M", "categoriaProtetta": true, "curriculum": "Competente"}}
	 */
	@RequestMapping(value = "/anagrafica", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody HttpEntity<GenericResponse> update(@RequestBody AnagraficaRequest anagraficaRequest) {

		HttpEntity<GenericResponse> httpEntity = null;

		GenericResponse genericResponse = new GenericResponse();

		try {
			log.info("START invocation update() of controller layer");

			anagraficaService.update(anagraficaRequest.getAnagrafica());

			genericResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<GenericResponse>(genericResponse);

			log.info("END invocation update() of controller layer");

		} catch(Exception e) {
			genericResponse.setEsito(new Esito(e.getMessage()));
			httpEntity = new HttpEntity<GenericResponse>(genericResponse);
		}

		return httpEntity;
	}

	/**
	 * @param ID
	 * @return HttpEntity
	 */
	@RequestMapping(value = "/anagrafica/{id}", method = RequestMethod.DELETE, consumes = "application/json")
	public @ResponseBody HttpEntity<GenericResponse> delete(@PathVariable("id") Integer ID) {

		HttpEntity<GenericResponse> httpEntity = null;

		GenericResponse genericResponse = new GenericResponse();

		try {
			log.info("START invocation delete() of controller layer");

			anagraficaService.delete(ID);

			genericResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<GenericResponse>(genericResponse);

			log.info("END invocation delete() of controller layer");

		} catch(ServiceException e) {
			genericResponse.setEsito(new Esito(e.getMessage()));
			httpEntity = new HttpEntity<GenericResponse>(genericResponse);
		}

		return httpEntity;
	}
}