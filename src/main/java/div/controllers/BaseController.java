package div.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseController {

	@Autowired
	protected HttpServletRequest request = null;

	@Autowired
	protected HttpServletResponse response = null;
}