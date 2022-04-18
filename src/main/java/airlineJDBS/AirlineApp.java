package airlineJDBS;
import airlineJDBS.model.dao.AircompanyDao;
import airlineJDBS.model.dao.AirplaneDao;
import airlineJDBS.model.dao.impl.AircompanyDaoImpl;
import airlineJDBS.model.dao.impl.AirplaneDaoImpl;
import airlineJDBS.model.entity.Aircompany;
import airlineJDBS.model.entity.Airplane;
import java.util.List;


public class AirlineApp {
    public static void main(String[] args) {

        AircompanyDao aircompanyDao = new AircompanyDaoImpl();

        Aircompany aircompany = new Aircompany();
       // aircompany.setName("DubaiAvia");
       // aircompanyDao.createOrUpdate(aircompany);

         Aircompany getIdAircompany =  aircompanyDao.getById(61);

         List<Aircompany> aircompanies = aircompanyDao.getAll();

         aircompany.setName("avia");
         AirplaneDao airplaneDao = new AirplaneDaoImpl();
         Airplane airplane = new Airplane();
         airplane.setModel("Mi123");
         airplane.setAircompany(aircompany);
         airplaneDao.createOrUpdate(airplane);
          }


    }

