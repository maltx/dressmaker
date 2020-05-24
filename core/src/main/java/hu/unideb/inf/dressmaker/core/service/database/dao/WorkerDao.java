package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.database.entity.Worker;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

public class WorkerDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    public List<Worker> findAll(){
        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT w FROM Worker w", Worker.class);

        return typedQuery.getResultList();
    }

    public List<Worker> findWorkersBySection(String sectionName){
        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT w FROM Worker w where w.section.section = :sectionName", Worker.class);
        typedQuery.setParameter("sectionName", sectionName);

        return typedQuery.getResultList();
    }

    public List<String> findWorkerNamesBySection(String sectionName){
        TypedQuery<String> typedQuery = EM.createQuery("SELECT w.name FROM Worker w where w.name = :sectionName", String.class);

        return typedQuery.getResultList();
    }

    public Worker findById(Long id){
        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT w FROM Worker w where w.id = :id", Worker.class);
        typedQuery.setParameter("id", id);

        return typedQuery.getSingleResult();
    }

    public void persist(Worker worker) {
        EM.getTransaction().begin();
        EM.persist(worker);
        EM.getTransaction().commit();
    }

    public void remove(Worker worker) {
        EM.getTransaction().begin();
        EM.remove(EM.merge(worker));
        EM.getTransaction().commit();
    }
}
