package airlineJDBS.model.dao.impl;
import airlineJDBS.DataSource;
import airlineJDBS.model.dao.TicketDao;
import airlineJDBS.model.entity.Ticket;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class TicketDaoImpl extends DefaultDaoImpl<Ticket> implements TicketDao {

    @Override
    public Ticket getByRoute_id(int route_id) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Ticket where route_id = :route_id");
        query.setParameter("route_id", route_id);
        List<Ticket> tickets = query.getResultList();
        if (!tickets.isEmpty()) {
            return tickets.get(0);
        } return null;
    }

    @Override
    public Ticket getByOrder_id(int order_id) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Ticket where order_id = :order_id");
        query.setParameter("order_id", order_id);
        List<Ticket> tickets = query.getResultList();
        if (!tickets.isEmpty()) {
            return tickets.get(0);
        } return null;
    }

    @Override
    public Ticket getByPassport_data(String passport_data) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Ticket where passport_data = :passport_data");
        query.setParameter("passport_data", passport_data);
        List<Ticket> tickets = query.getResultList();
        if (!tickets.isEmpty()) {
            return tickets.get(0);
        } return null;
    }

    @Override
    public List<Ticket> getAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Ticket");
        return query.getResultList();
    }

    @Override
    public Ticket getById(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Ticket.class, id);
    }

}
