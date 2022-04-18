package airlineJDBS.model.dao;

import airlineJDBS.model.entity.User;

public interface UserDao extends DefaultDao<User>{

    User getByName(String name);
}
