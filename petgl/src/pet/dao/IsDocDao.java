package pet.dao;

import java.util.List;

import pet.model.Doc;

public interface IsDocDao {
	public abstract int create(Doc doc);//添加医生
	public abstract int remove(Doc doc);	//删除记录的方法 
	public abstract Doc find(String id);		 //查询记录的方法 
	public abstract List<Doc> findAll();		//列出全部记录的方法
	public abstract int update(Doc doc);	//修改记录的方法
}
