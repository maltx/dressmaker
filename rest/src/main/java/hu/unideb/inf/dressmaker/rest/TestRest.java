package hu.unideb.inf.dressmaker.rest;

import hu.unideb.inf.dressmaker.clientapi.modell.PresenceVO;
import hu.unideb.inf.dressmaker.clientapi.modell.SectionVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("test")
public class TestRest {

    @GetMapping("another_test")
    public PresenceVO hello(){
        PresenceVO presenceVO = new PresenceVO();

        presenceVO.setId(1L);
        presenceVO.setDatum(new Date());
        presenceVO.setSection(new SectionVO());

        return presenceVO;
    }

}
