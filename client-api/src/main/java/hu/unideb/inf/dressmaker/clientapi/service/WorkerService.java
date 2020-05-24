package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import hu.unideb.inf.dressmaker.clientapi.modell.WorkerVO;

import java.util.List;

/**
 * Interface declaring the methods for workers
 */
public interface WorkerService {

    /**
     * Returns all the workers.
     * @return all the workers
     */
    List<WorkerVO> findAll();

    /**
     * Returns workers under a specific section.
     * @param sectionName name of a section
     * @return workers under a specific section
     */
    List<WorkerVO> findWorkersBySection(String sectionName);

    /**
     * Return only the names of the workers under a spicific section.
     * @param sectionName name of a section
     * @return only the names of the workers under a spicific section
     */
    List<String> findWorkerNamesBySection(String sectionName);

    /**
     * Inserts a worker.
     * @param workerName name of a worker
     * @param sectionVO a section
     */
    void persist(String workerName, SectionVO sectionVO);

    /**
     * Deletes a worker.
     * @param workerVO a worker
     */
    void remove(WorkerVO workerVO);
}
