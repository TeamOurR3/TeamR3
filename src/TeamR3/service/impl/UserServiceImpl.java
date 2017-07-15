package TeamR3.service.impl;

import TeamR3.dao.UserDao;
import TeamR3.entity.User;
import TeamR3.mapper.UserMapper;
import TeamR3.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = null;
	
	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getuser(User user) {
		return userDao.getuser(user);
	}

}
