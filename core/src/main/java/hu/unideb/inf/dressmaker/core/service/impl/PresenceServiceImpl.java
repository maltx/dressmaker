package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;
import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.database.DatabaseHelper;

import java.sql.Connection;
import java.util.List;

public class PresenceServiceImpl implements PresenceService {


    @Override
    public List<PresenceVO> findALl() {

        Connection connection = DatabaseHelper.createConnection();

        return null;
    }
}
