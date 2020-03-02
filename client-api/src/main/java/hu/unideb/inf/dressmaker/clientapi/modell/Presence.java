package hu.unideb.inf.dressmaker.clientapi.modell;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Presence {

    private Long id;

    private Long workerID;

    private Long sectionID;

    private Date date;

}
