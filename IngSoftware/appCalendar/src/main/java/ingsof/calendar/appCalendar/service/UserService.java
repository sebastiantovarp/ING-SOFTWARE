package ingsof.calendar.appCalendar.service;
import java.util.List;
import java.util.Optional;

import ingsof.calendar.appCalendar.modeller.UserModeller;
import ingsof.calendar.appCalendar.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModeller> getAll() {
        return userRepository.getAll();
    }

    public Optional<UserModeller> getUser(int userId) {
        return userRepository.getUser(userId);
    }

    public UserModeller save(UserModeller user) {
        if (user.getId() == null) {
            return userRepository.save(user);
        } else {
            Optional<UserModeller> e = userRepository.getUser(user.getId());
            if (!e.isPresent()) {
                return userRepository.save(user);
            } else {
                return user;
            }
        }
    }

    public boolean deleteUser(int userId) {
        Boolean aBoolean = getUser(userId).map(user -> {
            userRepository.delete(user);
            return true;
        }).orElse(false);
        return aBoolean;
    }

}