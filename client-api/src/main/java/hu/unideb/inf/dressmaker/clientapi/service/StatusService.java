package hu.unideb.inf.dressmaker.clientapi.service;

import hu.unideb.inf.dressmaker.clientapi.modell.StatusVO;

import java.util.List;

public interface StatusService {

    List<StatusVO> findAll();
}
