package airlineJDBS.model.dao;

import airlineJDBS.model.entity.Route;

public interface RouteDao extends DefaultDao<Route>{

    Route getByDeparture(String departure);

    Route getByArrival(String arrival);
}
