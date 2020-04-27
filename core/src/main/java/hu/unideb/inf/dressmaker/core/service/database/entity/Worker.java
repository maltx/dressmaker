package hu.unideb.inf.dressmaker.core.service.database.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@ToString
@Entity
public class Worker {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Section section;

}
