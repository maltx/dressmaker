package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class SectionDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    public List<Section> findAll(){

        TypedQuery<Section> typedQuery = EM.createQuery("SELECT s FROM Section s", Section.class);

        return typedQuery.getResultList();
    }


    // insert : EM.persist
    // update : em.merge
    // delete : em.delete
    // WHERE s.id = 'fasz'
}
