package TeamR3.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import TeamR3.dao.UserDao;
import TeamR3.entity.User;
import TeamR3.mapper.UserMapper;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSessionTemplate sst = null;
	
	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}

	
	@Override
	public User getuser(User user) {
		User user1 = sst.selectOne("getuser", user);
		return user1;
	}
}
