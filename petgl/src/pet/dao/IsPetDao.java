package pet.dao;

import java.util.List;
import pet.model.Pet;

public interface IsPetDao{
	public abstract int create(Pet pet);//添加宠物
	public abstract int remove(Pet pet);	//删除记录的方法 
	public abstract Pet find(String id);		 //查询记录的方法 
	public abstract List<Pet> findAll();		//列出全部记录的方法
	public abstract int update(Pet pet);	//修改记录的方法
}
