package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.WorkerVO;
import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.database.dao.WorkerDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Status;
import hu.unideb.inf.dressmaker.core.service.database.entity.Worker;
import hu.unideb.inf.dressmaker.core.service.util.ObjectMapperUtils;

import java.util.List;

public class WorkerServiceImpl implements WorkerService {
    private WorkerDao workerDao = new WorkerDao();

    @Override
    public List<WorkerVO> findAll() {
        List<Worker> workers = workerDao.findAll();

        return ObjectMapperUtils.mapAll(workers, WorkerVO.class);
    }

    @Override
    public List<String> findWorkersBySection(String sectionName) {
        List<String> workers = workerDao.findWorkersBySection(sectionName);

        return workers;
    }
}
