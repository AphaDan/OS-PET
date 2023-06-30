package pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pet.model.Doc;
import pet.util.SqlHelper;

public class DocDao implements IsDocDao{
	
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	@Override
	public Doc find(String docid){
		// TODO Auto-generated method stub
		Doc doc=null;
		try{
			conn=SqlHelper.connect();
			String sql="select * from doc where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, docid);
			rs=ps.executeQuery();
			if(rs.next()){
				doc=new Doc();
				doc.setId(rs.getString(1));
				doc.setName(rs.getString(2));
				doc.setSex(rs.getString(3));
				doc.setPassword(rs.getString(4));
				doc.setPhone(rs.getString(5));
			}
			
			
		}catch(Exception e){
			
		}finally{
			SqlHelper.closeResultSet(rs);
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return doc;
	}

	@Override
	public int create(Doc doc) {
		// TODO Auto-generated method stub
		int n=0;
		try{
			conn=SqlHelper.connect();
			String sql="insert into doc values (?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,doc.getId());
			ps.setString(2,doc.getName());
			ps.setString(3,doc.getSex());
			ps.setString(4, doc.getPassword());
			ps.setString(5, doc.getPhone());
			n = ps.executeUpdate();
			if(n>0){
				System.out.println("²åÈë³É¹¦");
				return n;
			}else{
				System.out.println("É¾³ýÊ§°Ü");
			}
		}catch(Exception e){
			
		}finally{
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		
		return n;
		
	}

	@Override
	public int remove(Doc doc) {
		// TODO Auto-generated method stub
		int n=0;
		try{
			conn=SqlHelper.connect();
			String sql="delete from doc where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, doc.getId());
			n=ps.executeUpdate();
			if(n>0){
				System.out.println("É¾³ý³É¹¦");
				return n;
			}else{
				System.out.println("É¾³ýÊ§°Ü");
			}
		}catch(Exception e){
			
		}finally{
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return 0;

	}

	@Override
	public List<Doc> findAll() {
		// TODO Auto-generated method stub
		List<Doc> list = new ArrayList<Doc>();
		Doc doc2=null;
		try{
			conn=SqlHelper.connect();
			String sql="select * from doc";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				doc2=new Doc();
				doc2.setId(rs.getString(1));
				doc2.setName(rs.getString(2));
				doc2.setSex(rs.getString(3));
				doc2.setPassword(rs.getString(4));
				doc2.setPhone(rs.getString(5));
				list.add(doc2);
			}
		}catch(Exception e){
			
		}finally{
		
			SqlHelper.closeResultSet(rs);
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		
		return list;
	}

	@Override
	public int update(Doc doc) {
		// TODO Auto-generated method stub
		int n=0;
		try{
			conn=SqlHelper.connect();
			String sql="update doc set id=?,`name`=?,sex=?,phone=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(5, doc.getId());
			ps.setString(1,doc.getId());
			ps.setString(2,doc.getName());
			ps.setString(3,doc.getSex());
			ps.setString(4, doc.getPhone());
			n = ps.executeUpdate();
			if(n>0){
				System.out.println("ÐÞ¸Ä³É¹¦");
				return n;
			}else{
				System.out.println("ÐÞ¸ÄÊ§°Ü");
			}
		}catch(Exception e){
			
		}finally{
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return 0;
	}
	
	public List<Doc> findDocs(String name,String sex){
		List<Doc> list = new ArrayList<Doc>();
		Doc doc2=null;
		try{
			conn=SqlHelper.connect();
			String sql="select * from doc where `name`=? and `sex`=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, sex);
			rs=ps.executeQuery();
			while(rs.next()){
				doc2=new Doc();
				doc2.setId(rs.getString(1));
				doc2.setName(rs.getString(2));
				doc2.setSex(rs.getString(3));
				list.add(doc2);
			}
			
		}catch(Exception e){
			
		}finally{
		
			//SqlHelper.closeResultSet(rs);
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return list;
	}
	
	public boolean signin(String id,String password){
		boolean ss = true;
		try{
			conn=SqlHelper.connect();
			String sql="select password from doc where `id`=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				String s=rs.getString(1);
				//System.out.println(s);
				//System.out.println(password);
				if(s.equals(password)){
					ss= true;
				}else
					ss= false;
			}
			
		}catch(Exception e){
			
		}finally{
			//SqlHelper.closeResultSet(rs);
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return ss;
	}
	
	public double FindAssessment(String id){
		double assess = 0;
		try{
			conn=SqlHelper.connect();
			String sql="select avg(assessment) from pets where docid=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				assess=rs.getDouble(1);
			}
		}catch(Exception e){
			
		}finally{
		
			SqlHelper.closeResultSet(rs);
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return assess;
	}
}
