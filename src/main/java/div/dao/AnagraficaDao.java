package div.dao;

import java.util.List;
import div.dao.domain.Anagrafica;

public interface AnagraficaDao {
    public List<Anagrafica> getListaAnagrafica() throws Exception;
    public Anagrafica getAnagrafica(Integer id) throws Exception;
    public Integer insert(Anagrafica anagrafica) throws Exception;
    public void update(Anagrafica anagrafica) throws Exception;
    public void delete(Integer id) throws Exception;
}