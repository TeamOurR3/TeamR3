package TeamR3.dao.impl;

import java.math.BigInteger;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.CustomerDao;
import TeamR3.entity.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SqlSessionTemplate sst = null;
	
	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}

	@Override
	public List<Customer> getCustomerByCondition(Customer customer) {
		// TODO Auto-generated method stub
		List<Customer> list = sst.selectList("getCustomerByCondition", customer);
		return list;
	}

	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int a = sst.selectOne("seleteCustomer", customer.getCustomer_id());
		if(a == 0){
			int result = sst.insert("addCustomer", customer);
			return result;
		}else return 0;
		
	}

	@Override
	public int deleteCustomer(BigInteger customer_id) {
		// TODO Auto-generated method stub
		int a = sst.selectOne("seleteCustomer", customer_id);
		if(a != 0){
			int result = sst.delete("deleteCustomer", customer_id);
			return result;
		}else
		return 0;
	}

	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int a = sst.selectOne("seleteCustomer", customer.getCustomer_id());
		if(a != 0){
			int result = sst.update("updateCustomer", customer);
			return result;
		}else
		return 0;
	}

}
