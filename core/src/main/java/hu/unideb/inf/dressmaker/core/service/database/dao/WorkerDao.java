package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Worker;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Presence DAO class that provides JPA support for the Worker Entities
 */
public class WorkerDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    /**
     * Returns the whole worker table stored in the database.
     * @return all the worker table
     */
    public List<Worker> findAll(){
        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT w FROM Worker w", Worker.class);

        return typedQuery.getResultList();
    }

    /**
     * Returns the workers under a specific section.
     * @param sectionName name of a section
     * @return the workers under a specific section
     */
    public List<Worker> findWorkersBySection(String sectionName){
        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT w FROM Worker w where w.section.section = :sectionName", Worker.class);
        typedQuery.setParameter("sectionName", sectionName);

        return typedQuery.getResultList();
    }

    /**
     * Returns the names of the workers without id under a specific section.
     * @param sectionName name of a section
     * @return the names of the workers under a specific section
     */
    public List<String> findWorkerNamesBySection(String sectionName){
        TypedQuery<String> typedQuery = EM.createQuery("SELECT w.name FROM Worker w where w.name = :sectionName", String.class);
        typedQuery.setParameter("sectionName", sectionName);

        return typedQuery.getResultList();
    }

    /**
     * Inner method.
     * Returns a worker with a specific id.
     * @param id id
     * @return a worker
     */
    public Worker findById(Long id){
        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT w FROM Worker w where w.id = :id", Worker.class);
        typedQuery.setParameter("id", id);

        return typedQuery.getSingleResult();
    }

    /**
     * Inserts a worker to the worker table.
     * @param worker a worker in the company
     */
    public void persist(Worker worker) {
        EM.getTransaction().begin();
        EM.persist(worker);
        EM.getTransaction().commit();
    }

    /**
     * Deletes a worker from the worker table.
     * @param worker a worker in the company
     */
    public void remove(Worker worker) {
        EM.getTransaction().begin();
        EM.remove(EM.merge(worker));
        EM.getTransaction().commit();
    }
}
