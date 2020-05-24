package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;

import java.util.List;

/**
 * Interface declaring the methods for sections
 */
public interface SectionService {

    /**
     * Returns all the sections
     * @return all the sections
     */
    List<SectionVO> findAll();

}
