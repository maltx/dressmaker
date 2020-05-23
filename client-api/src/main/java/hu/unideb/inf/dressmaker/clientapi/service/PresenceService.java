package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;

import java.util.List;

public interface PresenceService {

    List<PresenceVO> findALl();

    void makePresence(String workerName, String sectionName, String status);

}
