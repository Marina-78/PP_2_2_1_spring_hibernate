package hiber.service;

import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    @Autowired
    void add(User user);
    List<User> listUsers();
    @Autowired
    User getByCar(String model, Integer series);
}
