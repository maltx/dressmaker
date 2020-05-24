package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;
import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.database.dao.PresenceDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Presence;
import hu.unideb.inf.dressmaker.core.service.util.ObjectMapperUtils;

import java.util.List;

/**
 * Class implementing the methods listed in the PresenceService interface.
 */
public class PresenceServiceImpl implements PresenceService {
    private PresenceDao presenceDao = new PresenceDao();

    @Override
    public List<PresenceVO> findALl() {
        List<Presence> presences = presenceDao.findAll();

        return ObjectMapperUtils.mapAll(presences, PresenceVO.class);
    }

    @Override
    public void persist(PresenceVO presenceVO) {
        presenceDao.persist(ObjectMapperUtils.map(presenceVO, Presence.class));
    }
}
