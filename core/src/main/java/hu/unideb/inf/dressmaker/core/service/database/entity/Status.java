package hu.unideb.inf.dressmaker.core.service.database.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Status {

    @Id
    @GeneratedValue
    private Long id;

    private String status;

}