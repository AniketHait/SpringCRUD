package com.Toy.Restaurent.service;

import com.Toy.Restaurent.dao.UserDao;
import com.Toy.Restaurent.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String saveUsers(List<User> users) {
        userDao.saveAll(users);
        return "User saved "+users.size();
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public Optional<User> getUser(Integer userId) {
        return (Optional<User>) userDao.findById(userId);
    }
    @Override
    public String updateUser(User user) {
        userDao.save(user);
        return "user updated";
    }

    @Override
    public String deleteUser(Integer id) {
        userDao.deleteById(id);
        return "user deleted";
    }
}
