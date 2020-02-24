package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.database.DatabaseHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SectionServiceImpl implements SectionService {



    @Override
    public List<SectionVO> findAll() {

        Connection connection = DatabaseHelper.createConnection();

        String query = "SELECT * FROM section";

        List<SectionVO> sections = new ArrayList<>();

        SectionVO sectionVO = new SectionVO();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                sectionVO.setId(id);
                sectionVO.setName(name);

                sections.add(sectionVO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DatabaseHelper.closeConnection(connection);

        System.out.println(sections);

        return sections;
    }

}
