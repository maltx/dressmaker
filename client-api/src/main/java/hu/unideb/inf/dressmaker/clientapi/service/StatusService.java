package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.StatusVO;

import java.util.List;

/**
 * Interface declaring the methods for statuses.
 */
public interface StatusService {

    /**
     * Returns all the statuses.
     * @return all the statuses
     */
    List<StatusVO> findAll();

    /**
     * Returns the names of the statuses without id.
     * @return only the names of the statuses
     */
    List<String> findStatusNames();
}
