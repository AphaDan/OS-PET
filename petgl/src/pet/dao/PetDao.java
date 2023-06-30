package pet.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pet.model.Pet;
import pet.util.SqlHelper;

public class PetDao implements IsPetDao{
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	protected static final String FIELDS_INSERT ="id,type,owner,case,isMember,docid";
	protected static String INSERT_SQL="insert into pets ("+FIELDS_INSERT+")"+"values (?,?,?,?,?,?)";
	protected static String SELECT_SQL="select "+FIELDS_INSERT+" from pets where id=?";
	protected static String UPDATE_SQL="update pets set id=?,type=?,owner=?,case=?,isMember=? docid=? where id=?";
	protected static String DELETE_SQL ="delete from pets where id=?";
	@Override
	public int create(Pet pet){
		// TODO Auto-generated method stub
		int n=0;
		try{
			conn=SqlHelper.connect();
			String sql="insert into pets values (?,?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,pet.getId());
			ps.setString(2, pet.getType());
			ps.setString(3, pet.getOwner());
			ps.setString(4, pet.getCases());
			ps.setString(5, pet.getIsMember());
			ps.setString(6, pet.getDocid());
			ps.setInt(7, pet.getAssess());
			ps.setString(8, pet.getPassword());
			n = ps.executeUpdate();
			if(n>0){
				System.out.println("插入成功");
				return n;
			}else{
				System.out.println("删除失败");
			}
		}catch(Exception e){
			
		}finally{
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		
		return n;
	}

	@Override
	public int remove(Pet pet){
		// TODO Auto-generated method stub
		int n=0;
		try{
			conn=SqlHelper.connect();
			String sql="delete from pets where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, pet.getId());
			n=ps.executeUpdate();
			if(n>0){
				System.out.println("删除成功");
				return n;
			}else{
				System.out.println("删除失败");
			}
		}catch(Exception e){
			
		}finally{
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return 0;
	}

	@Override
	public Pet find(String id){
		// TODO Auto-generated method stub
		Pet pet2=null;
		try{
			conn=SqlHelper.connect();
			String sql="select * from pets where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				pet2=new Pet();
				pet2.setId(rs.getString(1));
				pet2.setType(rs.getString(2));
				pet2.setOwner(rs.getString(3));
				pet2.setCases(rs.getString(4));
				pet2.setIsMember(rs.getString(5));
				pet2.setDocid(rs.getString(6));
				pet2.setAssess(rs.getInt(7));
				pet2.setPassword(rs.getString(8));
				System.out.println("查找到了");
			}else{
				System.out.println("没找到");
			}
		}catch(Exception e){
			
		}finally{
		
			//SqlHelper.closeResultSet(rs);
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return pet2;
	}

	@Override
	public List<Pet> findAll(){
		// TODO Auto-generated method stub
		List<Pet> list = new ArrayList<Pet>();
		Pet pet2=null;
		try{
			conn=SqlHelper.connect();
			String sql="select * from pets";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				pet2=new Pet();
				pet2.setId(rs.getString(1));
				pet2.setType(rs.getString(2));
				pet2.setOwner(rs.getString(3));
				pet2.setCases(rs.getString(4));
				pet2.setIsMember(rs.getString(5));
				pet2.setDocid(rs.getString(6));
				pet2.setAssess(rs.getInt(7));
				pet2.setPassword(rs.getString(8));
				list.add(pet2);
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
	public int update(Pet pet){
		// TODO Auto-generated method stub
		int n=0;
		try{
			conn=SqlHelper.connect();
			String sql="update pets set id=?,type=?,owner=?,`case`=?,isMember=?,docid=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(7, pet.getId());
			ps.setString(1,pet.getId());
			ps.setString(2, pet.getType());
			ps.setString(3, pet.getOwner());
			ps.setString(4, pet.getCases());
			ps.setString(5, pet.getIsMember());
			ps.setString(6, pet.getDocid());
			
			n = ps.executeUpdate();
			if(n>0){
				System.out.println("修改成功");
				return n;
				
			}else{
				
			}
		}catch(Exception e){
			
		}finally{
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return n;
	}
	
	public int Assessment(String id,int a){
		int n=0;
		try{
			conn=SqlHelper.connect();
			String sql="update pets set assessment=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, a);
			ps.setString(2, id);
			n = ps.executeUpdate();
			if(n>0){
				System.out.println("评价成功");
				return n;
				
			}else{
				System.out.println("评价失败");
			}
		}catch(Exception e){
			
		}finally{
			SqlHelper.closePreparedStatement(ps);
			SqlHelper.closeConnection(conn);
		}
		return n;
	}
}
