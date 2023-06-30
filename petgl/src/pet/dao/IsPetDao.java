package pet.dao;

import java.util.List;
import pet.model.Pet;

public interface IsPetDao{
	public abstract int create(Pet pet);//��ӳ���
	public abstract int remove(Pet pet);	//ɾ����¼�ķ��� 
	public abstract Pet find(String id);		 //��ѯ��¼�ķ��� 
	public abstract List<Pet> findAll();		//�г�ȫ����¼�ķ���
	public abstract int update(Pet pet);	//�޸ļ�¼�ķ���
}
