package app;

import java.util.*;
import org.springframework.data.repository.*;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

}
