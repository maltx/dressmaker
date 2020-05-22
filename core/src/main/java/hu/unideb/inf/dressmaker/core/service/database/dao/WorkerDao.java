package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.database.entity.Worker;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class WorkerDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    public List<Worker> findAll(){

        TypedQuery<Worker> typedQuery = EM.createQuery("SELECT s FROM Worker s", Worker.class);

        return typedQuery.getResultList();
    }
}
