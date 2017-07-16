package TeamR3.dao.impl;

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
	public User getuser(User user) {
		return sst.selectOne("getuser", user);
	}
}
