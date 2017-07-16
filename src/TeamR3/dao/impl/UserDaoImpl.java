package TeamR3.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.UserDao;
import TeamR3.entity.User;
import TeamR3.mapper.UserMapper;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSessionTemplate sst = null;
	
	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}

	
	@Override
	public User getuser(User user) {
		return sst.selectOne("getuser", user);
	}


	@Override
	public int adduser(User user) {
		// TODO Auto-generated method stub
		return sst.insert("adduser", user);
	}


	@Override
	public int modifyuser(String user_id, User newuser) {
		// TODO Auto-generated method stub
		return sst.update("modifyuser", newuser);
	}



	@Override
	public int deluser(String user_id) {
		// TODO Auto-generated method stub
		return sst.delete("deluser", user_id);
	}
}
