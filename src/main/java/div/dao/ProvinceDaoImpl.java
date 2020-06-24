package div.dao;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class ProvinceDaoImpl implements ProvinceDao
{
    @Autowired
    JdbcTemplate jdbcTemplate = null;

    @Override
    public Map<Integer, String> map() throws Exception
    {
    	Map<Integer, String> province = null;

		String query = "SELECT * FROM province a ORDER by a.descrizione";

		try {
			province = jdbcTemplate.query(query,
				new ResultSetExtractor<Map<Integer, String>>() {
					@Override
					public Map<Integer, String> extractData(ResultSet rs) throws SQLException, DataAccessException {
						Map<Integer, String> map = new HashMap<Integer, String>();
						while(rs.next()){
							map.put(rs.getInt("id_provincia"), rs.getString("descrizione"));
				        }
				        return map;
					}
				});
		} catch (Exception e) {
			e.printStackTrace();
            throw e;
		}

		return province;
    }
}