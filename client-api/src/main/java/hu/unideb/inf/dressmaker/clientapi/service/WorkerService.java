package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.WorkerVO;

import java.util.List;

public interface WorkerService {

    List<WorkerVO> findAll();

    List<WorkerVO> findWorkersBySection(String sectionName);

    List<String> findWorkerNamesBySection(String sectionName);

    void persist(WorkerVO workerVO);

    void remove(WorkerVO workerVO);
}
