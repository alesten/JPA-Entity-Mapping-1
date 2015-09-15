package test;

import entity.Customer;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Entity_Mapping_1PU");
        EntityManager em = emf.createEntityManager();
        
        Customer c1 = new Customer("Ole");
        
        em.getTransaction().begin();
        
        em.persist(c1);
        
        em.getTransaction().commit();
    }
}
