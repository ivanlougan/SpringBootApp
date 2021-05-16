package pl.rob.springrelationonetoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.rob.springrelationonetoone.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {


}
