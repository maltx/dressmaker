package hu.unideb.inf.dressmaker.core.service.impl;

import hu.unideb.inf.dressmaker.clientapi.modell.Section;
import hu.unideb.inf.dressmaker.clientapi.service.SectionService;
import hu.unideb.inf.dressmaker.core.service.database.DatabaseHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SectionServiceImpl implements SectionService {

    @Override
    public List<Section> findAll() {

        Connection connection = DatabaseHelper.createConnection();

        String query = "SELECT * FROM section";

        List<Section> sections = new ArrayList<>();

        Section section = new Section();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
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
    }

}
