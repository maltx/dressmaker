package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;
import hu.unideb.inf.dressmaker.clientapi.service.PresenceService;
import hu.unideb.inf.dressmaker.core.service.database.dao.PresenceDao;
import hu.unideb.inf.dressmaker.core.service.database.dao.SectionDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Presence;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.util.ObjectMapperUtils;

import java.util.List;

public class PresenceServiceImpl implements PresenceService {

    private PresenceDao presenceDao = new PresenceDao();

    @Override
    public List<PresenceVO> findALl() {

        List<Presence> presences = presenceDao.findAll();

        return ObjectMapperUtils.mapAll(presences, PresenceVO.class);
    }

    @Override
    public void persist(PresenceVO presenceVO) {
        presenceDao.persist(ObjectMapperUtils.map(presenceVO, Presence.class));
    }


    /*@Override
    public List<PresenceVO> findALl() {

        Connection connection = DatabaseHelper.createConnection();

        String query = "SELECT * FROM presence";

        List<PresenceVO> presences = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                PresenceVO presence = new PresenceVO();
                Long id = resultSet.getLong("id");
                Long workerid = resultSet.getLong("workerid");
                Long sectionid = resultSet.getLong("sectionid");
                Date date = resultSet.getDate("presence_date");

                presence.setId(id);
                presence.setWorkerID(workerid);
                presence.setSectionID(sectionid);
                presence.setDate(date);

                System.out.println(presence);

                presences.add(presence);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        DatabaseHelper.closeConnection(connection);

        System.out.println(presences);

        return presences;
    }*/


}
