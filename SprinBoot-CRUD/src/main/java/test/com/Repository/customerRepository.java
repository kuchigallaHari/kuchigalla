package test.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.com.Entity.customer;

@Repository
public interface customerRepository extends JpaRepository<customer,Integer>
{

}
