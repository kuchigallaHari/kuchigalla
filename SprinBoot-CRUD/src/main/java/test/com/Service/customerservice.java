package test.com.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.com.Entity.customer;
import test.com.Repository.customerRepository;
@Service
public class customerservice 
{
@Autowired
private customerRepository  cstRepo;
public customer create(customer cst)
{
	return cstRepo.save(cst);
}
}
