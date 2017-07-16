package TeamR3.dao;

import java.math.BigInteger;
import java.util.List;

import TeamR3.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomerByCondition(Customer customer);
	public int addCustomer(Customer customer);
	public int deleteCustomer(BigInteger customer_id);
	public int updateCustomer(Customer customer);
	
	
}
