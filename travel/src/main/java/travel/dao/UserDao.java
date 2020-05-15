package travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {

    User findUserByUsername(String username);

    void saveUser(User user);

    User findUserByCode(String code);

    void updateStatus(User user);
}
