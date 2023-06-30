package pet.model;

import pet.dao.DocDao;

public class Pet {
	private String id;
	private String type;
	private String owner;
	private String cases;
	private String isMember; 
	private Doc doc;
	private String docid;
	private int assess=5;
	private String password="123456";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCases() {
		return cases;
	}
	public void setCases(String cases) {
		this.cases = cases;
	}
	public String getIsMember() {
		return isMember;
	}
	public void setIsMember(String isMember) {
		this.isMember = isMember;
	}
	public Doc getDoc() {
		DocDao dd=new DocDao();
		try {
			doc=dd.find(docid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
	public void setDoc(Doc doc) {
		this.doc = doc;
	}
	
	public String getDocid() {
		return docid;
	}
	public void setDocid(String docid) {
		this.docid = docid;
	}
	
	public int getAssess() {
		return assess;
	}
	public void setAssess(int assess) {
		this.assess = assess;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", type=" + type + ", owner=" + owner
				+ ", cases=" + cases + ", isMember=" + isMember + ", doc="
				+ doc.toString() + "]";
	}
	
	
}
