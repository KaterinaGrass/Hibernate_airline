package airlineJDBS.model.dao;

import airlineJDBS.model.entity.Airplane;

public interface AirplaneDao extends DefaultDao<Airplane>{

    Airplane getByModel(String model);
}
