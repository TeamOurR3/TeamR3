package TeamR3.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.UserDao;
import TeamR3.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSessionTemplate sst = null;
	
	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}

	
	@Override
	public User getUser(User user) {
		return sst.selectOne("getuser", user);
	}


	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return sst.insert("adduser", user);
	}


	@Override
	public int modifyUser(User newUser) {
		// TODO Auto-generated method stub
		return sst.update("modifyuser", newUser);
	}



	@Override
	public int delUser(String user_id) {
		// TODO Auto-generated method stub
		return sst.delete("deluser", user_id);
	}


	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return sst.selectList("getalluser");
	}

}
