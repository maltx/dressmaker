package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;

import java.util.List;

/**
 * Interface declaring the methods for presences.
 */
public interface PresenceService {

    /**
     * Returns all the presences.
     * @return all the presences
     */
    List<PresenceVO> findALl();

    /**
     * Inserts a given presence.
     * @param presenceVO
     */
    void persist(PresenceVO presenceVO);

}
