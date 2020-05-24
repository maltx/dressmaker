package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Presence;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class PresenceDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    public List<Presence> findAll(){

        TypedQuery<Presence> typedQuery = EM.createQuery("SELECT s FROM Presence s", Presence.class);

        return typedQuery.getResultList();
    }

    public void persist(Presence presence){
        EM.getTransaction().begin();
        EM.persist(presence);
        EM.getTransaction().commit();
    }
}
