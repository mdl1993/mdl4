package div.controllers.handlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.HttpEntity;
import div.controllers.beans.a.Esito;
import div.controllers.beans.responses.GenericResponse;

@RestControllerAdvice
public class ErrorHandler {

	@RequestMapping(produces = "application/json")
	@ExceptionHandler(InvalidFormatException.class)
	public HttpEntity<GenericResponse> handleException(InvalidFormatException ex) {

		HttpEntity<GenericResponse> httpEntity = null;

		GenericResponse genericResponse = new GenericResponse();

		Esito esito = new Esito();

		esito.setCode(-1);
		esito.setTarget("invalid_type");
		esito.setArgs(new String[] {String.valueOf(ex.getValue()), ex.getTargetType().getName()});

		genericResponse.setEsito(esito);

		httpEntity = new HttpEntity<GenericResponse>(genericResponse);

		return httpEntity;
	}
}