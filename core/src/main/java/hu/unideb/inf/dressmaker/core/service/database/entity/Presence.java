package hu.unideb.inf.dressmaker.core.service.database.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Presence {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Worker worker;

    @ManyToOne
    private Section section;

    @ManyToOne
    private Status status;

    private Date date;

}