/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasintest.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import magasin.entity.Categorie;
import magasin.entity.Client;
import magasin.entity.Commande;
import magasin.entity.Produit;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class MagasinTest {

//    @Test
//    public void MagasinTest() {
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        em.getTransaction().begin();
//        //blabla, opés sur la base
//        Categorie c1 = new Categorie();
//        c1.setNom("Baskets");
//        em.persist(c1);
//        Categorie c2 = new Categorie();
//        c2.setNom("Lunettes");
//        em.persist(c2);
//        Produit rayban = new Produit();
//        rayban.setNom("Lunettes Rayban de ouf");
//        rayban.setCategorie(c2);
//        em.persist(rayban);
//        em.getTransaction().commit();
//    }
    @Test
    public void TestCategorie() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Categorie cat = em.find(Categorie.class, (long) 4);
        for(Produit p : cat.getProduits()){//itération obligatoire pour les listes
            System.out.println(p.getNom());
        }
    }
    
    @Test
    public void TestClient() {
        EntityManager em2 = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        em2.getTransaction().begin();
//        //blabla, opés sur la base
//        Client cli1 = new Client();
//        cli1.setNom("Dudule");
//        em2.persist(cli1);
//        Commande lot = new Commande();
//        lot.setPrixTotal(19.99);
//        lot.setClient(cli1);
//        em2.persist(lot);
//        em2.getTransaction().commit();
        Client cli = em2.find(Client.class, (long) 1);
        for(Commande c : cli.getCommandes()){//itération obligatoire pour les listes
            System.out.println(c.getId());
        }
    }

}
