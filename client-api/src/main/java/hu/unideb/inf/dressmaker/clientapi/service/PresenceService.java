package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;
import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;

import java.util.List;

public interface PresenceService {

    List<PresenceVO> findALl();

    void persist(PresenceVO presenceVO);

}
