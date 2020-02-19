package hu.unideb.inf.dressmaker.clientapi.modell;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PresenceVO {

    private Integer id;

    private WorkerVO workerID;

    private SectionVO sectionID;

    private Date date;

}
