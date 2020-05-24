package hu.unideb.inf.dressmaker.core.service.database.dao;

import hu.unideb.inf.dressmaker.core.service.database.EMFHandler;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.database.entity.Status;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class StatusDao {
    private EntityManager EM = EMFHandler.getEntityManager();

    public List<Status> findAll(){

        TypedQuery<Status> typedQuery = EM.createQuery("SELECT s FROM Status s", Status.class);

        return typedQuery.getResultList();
    }

    public List<String> findStatusNames(){
        TypedQuery<String> typedQuery = EM.createQuery("SELECT s.status FROM Status s", String.class);

        return typedQuery.getResultList();
    }
}
