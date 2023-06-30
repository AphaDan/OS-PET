package pet.dao;

import java.util.List;

import pet.model.Doc;

public interface IsDocDao {
	public abstract int create(Doc doc);//���ҽ��
	public abstract int remove(Doc doc);	//ɾ����¼�ķ��� 
	public abstract Doc find(String id);		 //��ѯ��¼�ķ��� 
	public abstract List<Doc> findAll();		//�г�ȫ����¼�ķ���
	public abstract int update(Doc doc);	//�޸ļ�¼�ķ���
}
