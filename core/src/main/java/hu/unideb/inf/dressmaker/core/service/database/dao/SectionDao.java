package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Presence DAO class that provides JPA support for the Section Entities
 */
public class SectionDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    /**
     * Returns the whole section table stored in the database.
     * @return all the presence table
     */
    public List<Section> findAll(){
        TypedQuery<Section> typedQuery = EM.createQuery("SELECT s FROM Section s", Section.class);

        Logger.info("Selected all section from the database");
        return typedQuery.getResultList();
    }

    public void persist(Section section){
        EM.getTransaction().begin();
        EM.persist(section);
        EM.getTransaction().commit();
        Logger.info("Inserted a section to the database");
    }

    public void remove(Section section){
        EM.getTransaction().begin();
        EM.remove(EM.merge(section));
        EM.getTransaction().commit();
        Logger.info("Deleted a section from the database");
    }
}
