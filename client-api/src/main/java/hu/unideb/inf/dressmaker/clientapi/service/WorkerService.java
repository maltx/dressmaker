package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import hu.unideb.inf.dressmaker.clientapi.modell.WorkerVO;

import java.util.List;

/**
 * Interface declaring the methods for workers
 */
public interface WorkerService {

    /**
     * Returns all the workers
     * @return all the workers
     */
    List<WorkerVO> findAll();

    /**
     * Returns workers under a specific section
     * @param sectionName
     * @return workers under a specific section
     */
    List<WorkerVO> findWorkersBySection(String sectionName);

    List<String> findWorkerNamesBySection(String sectionName);

    void persist(String workerName, SectionVO sectionVO);

    void remove(WorkerVO workerVO);
}
