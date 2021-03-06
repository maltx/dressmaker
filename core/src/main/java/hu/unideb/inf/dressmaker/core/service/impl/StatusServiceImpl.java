package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.StatusVO;
import hu.unideb.inf.dressmaker.clientapi.service.StatusService;
import hu.unideb.inf.dressmaker.core.service.database.dao.StatusDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Status;
import hu.unideb.inf.dressmaker.core.service.util.ObjectMapperUtils;

import java.util.List;

/**
 * Class implementing the methods listed in the StatusService interface.
 */
public class StatusServiceImpl implements StatusService {
    private StatusDao statusDao = new StatusDao();


    @Override
    public List<StatusVO> findAll() {
        List<Status> statuses = statusDao.findAll();

        return ObjectMapperUtils.mapAll(statuses, StatusVO.class);
    }

    @Override
    public List<String> findStatusNames() {
        List<String> statusNames = statusDao.findStatusNames();

        return statusNames;
    }
}