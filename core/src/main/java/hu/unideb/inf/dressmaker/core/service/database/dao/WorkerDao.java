package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.database.entity.Worker;

import javax.persistence.EntityManager;
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
        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT w FROM Worker w where w.section = :sectionName", Worker.class);

        return typedQuery.getResultList();
    }

    public List<String> findWorkerNamesBySection(String sectionName){
        TypedQuery<String> typedQuery = EM.createQuery("SELECT w.name FROM Worker w where w.name = :sectionName", String.class);

        return typedQuery.getResultList();
    }

    @Transactional
    public void persist(Worker worker) {
        EM.persist(worker);
    }

    @Transactional
    public void remove(Worker worker) {
        EM.remove(worker);
    }
}
