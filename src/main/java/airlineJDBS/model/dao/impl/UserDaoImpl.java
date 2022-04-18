package airlineJDBS.model.dao.impl;
import airlineJDBS.DataSource;
import airlineJDBS.model.dao.UserDao;
import airlineJDBS.model.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class UserDaoImpl extends DefaultDaoImpl<User> implements UserDao {

    @Override
    public List<User> getAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from User");
        return query.getResultList();
    }

    @Override
    public User getById(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(User.class, id);
    }

    @Override
    public User getByName(String name) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from User where name = :name");
        query.setParameter("name", name);
        List<User> users = query.getResultList();
        if (!users.isEmpty()) {
            return users.get(0);
        } return null;
    }
}
