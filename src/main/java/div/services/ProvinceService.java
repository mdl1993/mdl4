package div.services;

import java.util.*;
import div.services.exceptions.ServiceException;

public interface ProvinceService {
    public Map<Integer, String> map() throws ServiceException;
}