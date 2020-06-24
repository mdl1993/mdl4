package div.services;

import java.util.List;
import div.dao.domain.Anagrafica;
import div.services.exceptions.ServiceException;
import div.services.exceptions.ValidationServiceException;

public interface AnagraficaService {
    public List<Anagrafica> getListaAnagrafica() throws ServiceException;
    public Anagrafica getAnagrafica(Integer id) throws ServiceException;
    public Integer insert(Anagrafica anagrafica) throws ServiceException, ValidationServiceException;
    public void update(Anagrafica anagrafica) throws ServiceException, ValidationServiceException;
    public void delete(Integer id) throws ServiceException;
}