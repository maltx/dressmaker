package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import hu.unideb.inf.dressmaker.clientapi.modell.WorkerVO;
import hu.unideb.inf.dressmaker.clientapi.service.WorkerService;
import hu.unideb.inf.dressmaker.core.service.database.dao.WorkerDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
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
    public List<WorkerVO> findWorkersBySection(String sectionName) {
        List<Worker> workers = workerDao.findWorkersBySection(sectionName);

        return ObjectMapperUtils.mapAll(workers, WorkerVO.class);
    }

    @Override
    public List<String> findWorkerNamesBySection(String sectionName) {
        List<String> workers = workerDao.findWorkerNamesBySection(sectionName);

        return workers;
    }

    @Override
    public void persist(String workerName, SectionVO sectionVO) {
        Worker worker = new Worker();
        worker.setName(workerName);
        worker.setSection(ObjectMapperUtils.map(sectionVO, Section.class));
        workerDao.persist(worker);
    }

    @Override
    public void remove(WorkerVO workerVO) {
        workerDao.remove(ObjectMapperUtils.map(workerVO, Worker.class));
    }
}
