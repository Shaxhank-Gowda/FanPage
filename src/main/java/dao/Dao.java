package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dto.Dto;

public class Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(Dto d1) {
		et.begin();
		em.persist(d1);
		et.commit();
		return "Added";
	}

	public String delete(int x) {
		Dto q1 = em.find(Dto.class, x);
		if (q1 != null) {
			et.begin();
			em.remove(q1);
			et.commit();
			return "deleted!!!";
		} else {
			return "sikkilla guru";
		}
	}

	public String update(int x,Dto d1) {
		Dto q1 = em.find(Dto.class, x);

		et.begin();
		em.merge(d1);
		et.commit();
		
		return "Updated";
	}
	
	
	public Dto find(int x){
		Dto q1 = em.find(Dto.class, x);

		return q1;
	}
	public List<Dto> fetchAll() {
		Query q=em.createQuery("select data from Dto data");
		List<Dto> l=q.getResultList();
		return l;
	}
}
