package TeamR3.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import TeamR3.entity.Customer;

@Service
public interface CustomerService {

	public List<Customer> getCustomerByCondition(Customer customer);
	public int addCustomer(Customer customer);
	public int deleteCustomer(BigInteger customer_id);
	public int updateCustomer(Customer customer);
	
}
