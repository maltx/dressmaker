package hu.unideb.inf.dressmaker.core.service.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFHandler {

    private static EntityManagerFactory EMF;

    static {
        EMF = Persistence.createEntityManagerFactory("persistence");
    }

    public static EntityManager getEntityManager(){

        return EMF.createEntityManager();
    }

}
