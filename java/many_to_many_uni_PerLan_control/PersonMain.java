package many_to_many_uni_PerLan_control;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni_PerLan.Language;
import many_to_many_uni_PerLan.Person;

public class PersonMain {
public static void main(String[] args) {
	Person person=new Person();
	person.setAddress("mdy");
	person.setId(1);
	person.setName("pooji");
	person.setPhone(1111111);
	Person person1=new Person();
	person1.setAddress("mmys");
	person1.setId(2);
	person1.setName("kavya");
	person1.setPhone(2222222);
	Person person2=new Person();
	person2.setAddress("blr");
	person2.setId(3);
	person2.setName("sharth");
	person2.setPhone(3333333);
	Language language=new Language();
	language.setCountry("india");
	language.setId(101);
	language.setName("kannada");
	language.setOrigin("karnataka");
	Language language2=new Language();
	language2.setCountry("kenya");
	language2.setId(102);
	language2.setName("tamil");
	language2.setOrigin("west indies");
	Language language3=new Language();
	language3.setCountry("indonesia");
	language3.setId(103);
	language3.setName("telugu");
	language3.setOrigin("america");
	List< Language> list=new ArrayList<Language>();
	list.add(language);
	list.add(language2);
	List<Language> list1=new ArrayList<Language>();
	list1.add(language3);
	list1.add(language2);
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(language);
	entityManager.persist(language2);
	entityManager.persist(language3);
	entityManager.persist(person);
	entityManager.persist(person1);
	entityManager.persist(person2);
	entityTransaction.commit();
	
}
}
