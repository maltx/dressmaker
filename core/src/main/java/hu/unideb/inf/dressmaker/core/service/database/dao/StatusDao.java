package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Status;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Presence DAO class that provides JPA support for the Status Entities
 */
public class StatusDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    /**
     * Returns the whole status table stored in the database.
     * @return all the status table
     */
    public List<Status> findAll(){
        TypedQuery<Status> typedQuery = EM.createQuery("SELECT s FROM Status s", Status.class);

        return typedQuery.getResultList();
    }

    /**
     * Returns the names of the statuses without id.
     * @return the names of the statuses
     */
    public List<String> findStatusNames(){
        TypedQuery<String> typedQuery = EM.createQuery("SELECT s.status FROM Status s", String.class);

        return typedQuery.getResultList();
    }
}
