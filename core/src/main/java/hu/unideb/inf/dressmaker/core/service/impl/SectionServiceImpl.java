package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.database.dao.SectionDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.util.ObjectMapperUtils;

import java.util.List;

/**
 * Class implementing the methods listed in the SectionService interface.
 */
public class SectionServiceImpl implements SectionService {
    private SectionDao sectionDao = new SectionDao();

    @Override
    public List<SectionVO> findAll() {
        List<Section> sections = sectionDao.findAll();

        return ObjectMapperUtils.mapAll(sections, SectionVO.class);
    }
}
