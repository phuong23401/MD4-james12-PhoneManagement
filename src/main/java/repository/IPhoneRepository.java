package repository;

import model.Phone;
import org.springframework.data.repository.CrudRepository;

public interface IPhoneRepository extends CrudRepository<Phone, Long> {
}
