package TeamR3.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.Room_typeDao;
import TeamR3.entity.Room_type;

@Repository("room_typeDao")
public class Room_typeDaoImpl implements Room_typeDao {

	@Autowired
	private SqlSessionTemplate sst = null;

	public SqlSessionTemplate getSst() {
		return sst;
	}

	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}

	@Override
	public List<Room_type> getAllRoom_type() {
		// TODO Auto-generated method stub
		List<Room_type> list = sst.selectList("getAllRoom_type");
		return list;
	}

	@Override
	public int addRoom_type(Room_type room_type) {
		// TODO Auto-generated method stub
		//变量a是为了检查数据库是否有该数据，以下同理。
		int a = sst.selectOne("selectRoom_type_id", room_type.getRoom_type_id());
		if(a == 0){
			int result = sst.insert("addRoom_type", room_type);
			sst.commit();
			return result;
		}else return 0;
	}

	@Override
	public int delectRoom_type(int room_type_id) {
		// TODO Auto-generated method stub
		int a = sst.selectOne("selectRoom_type_id", room_type_id);
		if(a != 0){
			int result = sst.delete("deleteRoom_type", room_type_id);
			sst.commit();
			return result;
		}else return 0;
	}

	@Override
	public int updateRoom_type(Room_type room_type) {
		// TODO Auto-generated method stub
		int a = sst.selectOne("selectRoom_type_id", room_type.getRoom_type_id());
		if(a != 0){
			int result = sst.update("updateRoom_type", room_type);
			sst.commit();
			return result;
		}else return 0;
	}

}
