package div.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import div.dao.AnagraficaDao;
import div.dao.domain.Anagrafica;
import div.services.exceptions.ServiceException;
import div.services.exceptions.ValidationServiceException;

@Service
public class AnagraficaServiceImpl implements AnagraficaService
{
    @Autowired
	private AnagraficaDao anagraficaDao = null;

	@Override
	public List<Anagrafica> getListaAnagrafica() throws ServiceException
    {
		List<Anagrafica> anagrafiche = null;

		try {
			anagrafiche = anagraficaDao.getListaAnagrafica();
        } catch(Exception e) {
        	throw new ServiceException(e);
        }

		return anagrafiche;
    }

    @Override
	public Anagrafica getAnagrafica(Integer id) throws ServiceException
    {
		Anagrafica anagrafica = null;

		try {
			anagrafica = anagraficaDao.getAnagrafica(id);
        } catch(Exception e) {
        	throw new ServiceException(e);
        }

		return anagrafica;
    }

	@Override
	@Transactional(rollbackFor = ServiceException.class)
	public Integer insert(Anagrafica anagrafica) throws ServiceException, ValidationServiceException {

		Integer id = null;

		if(anagrafica.getEta() < 18) {
			throw new ValidationServiceException("errore_minore_eta");
		}

		try {
			id = anagraficaDao.insert(anagrafica);
        } catch(Exception e) {
        	throw new ServiceException(e);
        }

		return id;
    }

	@Override
	@Transactional(rollbackFor = ServiceException.class)
	public void update(Anagrafica anagrafica) throws ServiceException, ValidationServiceException {

		if(anagrafica.getEta() < 18) {
			throw new ValidationServiceException("errore_minore_eta");
		}

		try {
			anagraficaDao.update(anagrafica);
        } catch(Exception e) {
        	throw new ServiceException(e);
        }
	}

	@Override
	@Transactional(rollbackFor = ServiceException.class)
	public void delete(Integer id) throws ServiceException {

		try {
			anagraficaDao.delete(id);
        } catch(Exception e) {
        	throw new ServiceException(e);
        }
	}
}