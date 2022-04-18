package airlineJDBS;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DataSource {
    private static DataSource instance = new DataSource();
    private static EntityManagerFactory managerFactory;

    private DataSource (){
        managerFactory = Persistence.createEntityManagerFactory("by.jdbc_airline");
    }

    public static DataSource getInstance() {
        return instance;
    }

    public EntityManager getEntityManager() {
        return managerFactory.createEntityManager();
    }

    public Session getSession() {
        return getEntityManager().unwrap(Session.class);
    }





}
