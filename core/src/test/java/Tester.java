import hu.unideb.inf.dressmaker.core.service.database.dao.SectionDao;
import hu.unideb.inf.dressmaker.core.service.database.dao.StatusDao;
import hu.unideb.inf.dressmaker.core.service.database.entity.Section;
import hu.unideb.inf.dressmaker.core.service.database.entity.Status;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Tester {

    @Test
    void testSection(){
        SectionDao sectionDao = new SectionDao();

        Section section = new Section();
        section.setId((long) 10);
        section.setSection("test10");

        int all = sectionDao.findAll().size();
        sectionDao.remove(section);
        assertEquals(all, sectionDao.findAll().size());
    }

    @Test
    void testStatus(){
        StatusDao statusDao = new StatusDao();

        List<Status> statuses = statusDao.findAll();
        List<String> statusNames = statusDao.findStatusNames();

        assertEquals(statuses.size(), statusNames.size());
    }
}
