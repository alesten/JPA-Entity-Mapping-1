package test;

import entity.Customer;
import enums.CustomerType;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Entity_Mapping_1PU");
        EntityManager em = emf.createEntityManager();
        
        Customer c1 = new Customer("Ole Erik", CustomerType.GOLD);
        c1.addHobbby("Håndbold");
        c1.addHobbby("Fodbold");
        c1.addHobbby("PC");
        c1.addPhone("12345678", "Dette er min telefon");
        c1.addPhone("87654321", "Ikke min telefon");
        
        em.getTransaction().begin();
        
        em.persist(c1);
        
        em.getTransaction().commit();
    }
}


/*
    4. Tablet bliver udfyldt med data der bliver indtastet i addcustomers.sql 
    før den kalder min egen kode. Dette resultere i at min kode ikke kan tilføjes 
    da ID 1 allerede er brugt.

    5.1. Der kommer Customertype ind i tablets og enumens værdig bliver sat ind.
    5.2. Nu bliver enumens navn sat ind i stedet.

    6.1. Uden annotations indsætter den ulæslig blob.
    6.2. Med annotations indsætter den en ny tabel som kæder hobby med customer

    7.1. Uden annotations indsætter den ulæslig blob
    7.2. Med annotations indsætter den en ny tabel som kæder phone med customer
*/