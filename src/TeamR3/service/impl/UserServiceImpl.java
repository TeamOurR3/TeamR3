package TeamR3.service.impl;

import java.util.List;

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
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userDao.getUser(user);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public int modifyUser(User newUser) {
		// TODO Auto-generated method stub
		return userDao.modifyUser(newUser);
	}

	@Override
	public int delUser(String user_id) {
		// TODO Auto-generated method stub
		return userDao.delUser(user_id);
	}

}
