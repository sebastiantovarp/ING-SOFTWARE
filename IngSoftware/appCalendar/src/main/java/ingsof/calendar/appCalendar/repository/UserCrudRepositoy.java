package ingsof.calendar.appCalendar.repository;

import ingsof.calendar.appCalendar.modeller.UserModeller;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepositoy extends CrudRepository<UserModeller, Integer> {

}
