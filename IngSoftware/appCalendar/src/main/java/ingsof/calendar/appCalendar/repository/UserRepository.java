package ingsof.calendar.appCalendar.repository;

import java.util.List;
import java.util.Optional;

import ingsof.calendar.appCalendar.modeller.UserModeller;
import ingsof.calendar.appCalendar.repository.UserCrudRepositoy;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepositoy userCrudRepository;

    public List<UserModeller> getAll(){
        return (List<UserModeller>) userCrudRepository.findAll();
    }
    public Optional<UserModeller> getUser(int id){
        return userCrudRepository.findById(id);
    }
    public UserModeller save(UserModeller user){
        return userCrudRepository.save(user);
    }
    public void delete(UserModeller user){
        userCrudRepository.delete(user);

    }

}