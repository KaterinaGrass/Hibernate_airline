package airlineJDBS.model.dao;

import airlineJDBS.model.entity.AirplaneRoute;

public interface AirplaneRouteDao extends DefaultDao <AirplaneRoute>{

    AirplaneRoute getByAirplane_id(int airplane_id);

    AirplaneRoute getByRoutes_id(int routes_id);

}
