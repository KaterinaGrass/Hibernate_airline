package airlineJDBS.model.dao.impl;
import airlineJDBS.DataSource;
import airlineJDBS.model.dao.AircompanyDao;
import airlineJDBS.model.entity.Aircompany;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;


public class AircompanyDaoImpl extends DefaultDaoImpl<Aircompany> implements AircompanyDao {
    @Override
    public Aircompany getByName(String name) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Aircompany where name = :name");
        query.setParameter("name", name);
        List<Aircompany> aircompanies = query.getResultList();
        if (!aircompanies.isEmpty()) {
            return aircompanies.get(0);
        }
        return null;
    }

    @Override
    public List<Aircompany> getAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Aircompany");

        return query.getResultList();
    }

    @Override
    public Aircompany getById(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Aircompany.class, id);
    }

}
