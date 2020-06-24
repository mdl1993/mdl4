package div.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import div.dao.ProvinceDao;
import div.services.exceptions.ServiceException;

@Service
public class ProvinceServiceImpl implements ProvinceService
{
    @Autowired
	private ProvinceDao provinceDao = null;

	@Override
	public Map<Integer, String> map() throws ServiceException
    {
		 Map<Integer, String> province = null;

		try {
			province = provinceDao.map();
        } catch(Exception e) {
        	throw new ServiceException(e);
        }

		return province;
    }
}