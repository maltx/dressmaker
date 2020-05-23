package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.database.dao.SectionDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.util.ObjectMapperUtils;

import java.util.List;

public class SectionServiceImpl implements SectionService {

    private SectionDao sectionDao = new SectionDao();

    @Override
    public List<SectionVO> findAll() {

        List<Section> sections = sectionDao.findAll();

        return ObjectMapperUtils.mapAll(sections, SectionVO.class);
    }

    @Override
    public List<String> findSectionNames() {
        List<String> sectionNames = sectionDao.findSectionNames();

        return sectionNames;
    }

    /*@Override
    public List<SectionVO> findAll() {

        Connection connection = DatabaseHelper.createConnection();

        String query = "SELECT * FROM section";

        List<SectionVO> sections = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                SectionVO section = new SectionVO();

                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                section.setId(id);
                section.setName(name);

                sections.add(section);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DatabaseHelper.closeConnection(connection);

        System.out.println(sections);

        return sections;
    }*/

}
