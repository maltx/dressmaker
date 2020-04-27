package hu.unideb.inf.dressmaker.clientapi.modell;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PresenceVO {

    private Long id;

    private WorkerVO worker;

    private SectionVO section;

    private StatusVO status;

    private Date date;

}
