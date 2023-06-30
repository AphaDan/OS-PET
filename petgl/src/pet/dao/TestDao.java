package pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import pet.model.Doc;
import pet.model.Pet;
import pet.util.SqlHelper;

public class TestDao {
	public static void main(String[] args){
		Doc doc=new Doc();
		doc.setId("002");
		doc.setName("½ÜÎ÷¿¨");
		doc.setSex("female");
		DocDao docDao=new DocDao();
		docDao.create(doc);
		List<Doc> list=docDao.findDocs("mary", "female");
		for(Doc doc0:list){
			System.out.println(doc0.toString());
		}
		list = docDao.findAll();
		for(Doc doc0:list){
			System.out.println(doc0.toString());
		}
		
	}
}
