package pl.rob.springrelationonetoone.repository;

import org.springframework.data.repository.CrudRepository;
import pl.rob.springrelationonetoone.model.User;

public interface UserRepository extends CrudRepository<User, Long> {


}
