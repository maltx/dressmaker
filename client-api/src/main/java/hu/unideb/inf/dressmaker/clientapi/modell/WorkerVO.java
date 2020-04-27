package hu.unideb.inf.dressmaker.clientapi.modell;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WorkerVO {

    private Long id;

    private String name;

    private SectionVO section;

}
