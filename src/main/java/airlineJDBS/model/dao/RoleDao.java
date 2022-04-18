package airlineJDBS.model.dao;

import airlineJDBS.model.entity.Role;

public interface RoleDao extends DefaultDao<Role>{

    Role getByСategoris(String categoris);
}
