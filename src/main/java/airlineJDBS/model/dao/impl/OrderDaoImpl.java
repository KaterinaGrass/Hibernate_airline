package airlineJDBS.model.dao.impl;
import airlineJDBS.DataSource;
import airlineJDBS.model.dao.OrderDao;
import airlineJDBS.model.entity.Order;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class OrderDaoImpl extends DefaultDaoImpl<Order> implements OrderDao {

    @Override
    public Order getByNumber(int number) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Order where number = :number");
        query.setParameter("number", number);
        List<Order> orders = query.getResultList();
        if (!orders.isEmpty()) {
            return orders.get(0);
        }
        return null;
    }

    @Override
    public Order getByOrder_date(String order_date) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Order where order_data = :order_data");
        query.setParameter("order_data", order_date);
        List<Order> orders = query.getResultList();
        if (!orders.isEmpty()) {
            return orders.get(0);
        }
        return null;
    }

    @Override
    public Order getByUser_id(int user_id) {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Order where user_id = :user_id");
        query.setParameter("user_ig", user_id);
        List<Order> orders = query.getResultList();
        if (!orders.isEmpty()) {
            return orders.get(0);
        } return null;
    }

    @Override
    public List<Order> getAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Order");
        return query.getResultList();
    }

    @Override
    public Order getById(int id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Order.class, id);
    }

}
