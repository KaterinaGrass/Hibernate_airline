package airlineJDBS.model.dao;

import airlineJDBS.model.entity.Aircompany;

public interface AircompanyDao extends DefaultDao<Aircompany> {

    Aircompany getByName(String name);
}
