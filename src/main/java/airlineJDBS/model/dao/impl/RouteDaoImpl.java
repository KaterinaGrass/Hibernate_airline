package airlineJDBS.model.dao.impl;
import airlineJDBS.DataSource;
import airlineJDBS.model.dao.RouteDao;
import airlineJDBS.model.entity.Route;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class RouteDaoImpl extends DefaultDaoImpl<Route> implements RouteDao {

    @Override
    public List<Route> getAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Route");
        return query.getResultList();
    }

    @Override
    public Route getById(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Route.class, id);
    }

    @Override
    public Route getByDeparture(String departure) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Route where departure = :departure");
        query.setParameter("departure", departure);
        List<Route> routes = query.getResultList();
        if (!routes.isEmpty()) {
            return routes.get(0);

        }return null;
    }

    @Override
    public Route getByArrival(String arrival) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Route where arrival = :arrival");
        query.setParameter("arrival", arrival);
        List<Route> routes = query.getResultList();
        if (!routes.isEmpty()) {
            return routes.get(0);

        }return null;

    }
}
