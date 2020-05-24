package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Presence;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Presence DAO class that provides JPA support for the Presence Entities
 */
public class PresenceDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    /**
     * Returns the whole presence table stored in the database.
     * @return all the presence table
     */
    public List<Presence> findAll(){
        TypedQuery<Presence> typedQuery = EM.createQuery("SELECT s FROM Presence s", Presence.class);

        return typedQuery.getResultList();
    }

    /**
     * Inserts a row to the presence table.
     * @param presence
     */
    public void persist(Presence presence){
        EM.getTransaction().begin();
        EM.persist(presence);
        EM.getTransaction().commit();
    }
}
