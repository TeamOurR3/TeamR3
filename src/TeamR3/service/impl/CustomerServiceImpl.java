package TeamR3.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TeamR3.dao.CustomerDao;
import TeamR3.entity.Customer;
import TeamR3.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao = null;
	
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> getCustomerByCondition(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByCondition(customer);
	}

	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	@Override
	public int deleteCustomer(BigInteger customer_id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(customer_id);
	}

	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

}
