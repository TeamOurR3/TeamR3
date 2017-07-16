package TeamR3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TeamR3.dao.UserDao;
import TeamR3.entity.User;
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

}
