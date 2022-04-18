package airlineJDBS.model.dao.impl;
import airlineJDBS.DataSource;
import airlineJDBS.model.dao.RoleDao;
import airlineJDBS.model.entity.Role;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class RoleDaoImpl extends DefaultDaoImpl<Role> implements RoleDao {

    @Override
    public List<Role> getAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Role");
        return query.getResultList();
    }

    @Override
    public Role getById(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Role.class, id);
    }

    @Override
    public Role getByСategoris(String categoris) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Role where  categoris = :categoris");
        query.setParameter("categoris", categoris);
        List<Role> roles = query.getResultList();
        if (!roles.isEmpty()) {
            return roles.get(0);
        }
        return null;
    }
}
