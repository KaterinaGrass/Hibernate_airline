package airlineJDBS.model.dao.impl;
import airlineJDBS.DataSource;
import airlineJDBS.model.dao.AirplaneDao;
import airlineJDBS.model.entity.Airplane;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class AirplaneDaoImpl extends DefaultDaoImpl<Airplane> implements AirplaneDao {

    @Override
    public Airplane getByModel(String model) {
            Session session = DataSource.getInstance().getSession();
            Query query = session.createQuery("from Airplane where model = :model");
            query.setParameter("model", model);
            List<Airplane> airplanes = query.getResultList();
            if (!airplanes.isEmpty()) {
                return airplanes.get(0);
            }
            return null;
    }

    @Override
    public List<Airplane> getAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Airplane");
        return query.getResultList();
    }

    @Override
    public Airplane getById(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Airplane.class, id);
    }

}
