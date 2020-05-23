package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;

import java.util.List;

public interface SectionService {

    List<SectionVO> findAll();

    List<String> findSectionNames();

}
