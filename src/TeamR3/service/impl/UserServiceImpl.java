package TeamR3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import TeamR3.dao.UserDao;
import TeamR3.entity.User;
import TeamR3.mapper.UserMapper;
import TeamR3.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao = null;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getuser(User user) {
		return userDao.getuser(user);
	}

	@Override
	public int adduser(User user) {
		// TODO Auto-generated method stub
		return userDao.adduser(user);
	}

	@Override
	public int modifyuser(String user_id, User newuser) {
		// TODO Auto-generated method stub
		return userDao.modifyuser(user_id, newuser);
	}

	@Override
	public int deluser(String user_id) {
		// TODO Auto-generated method stub
		return userDao.deluser(user_id);
	}

}
