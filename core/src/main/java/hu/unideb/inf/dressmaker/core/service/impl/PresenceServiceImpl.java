package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.Presence;
import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.database.DatabaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PresenceServiceImpl implements PresenceService {

    @Override
    public List<Presence> findALl() {

        Connection connection = DatabaseHelper.createConnection();

        String query = "SELECT * FROM presence";

        List<Presence> presences = new ArrayList<>();

        Presence presence = new Presence();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                Long workerid = resultSet.getLong("workerid");
                Long sectionid = resultSet.getLong("sectionid");
                Date date = resultSet.getDate("date");

                presence.setId(id);
                presence.setWorkerID(workerid);
                presence.setSectionID(sectionid);
                presence.setDate(date);

                presences.add(presence);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        DatabaseHelper.closeConnection(connection);

        System.out.println(presences);

        return presences;
    }
}
