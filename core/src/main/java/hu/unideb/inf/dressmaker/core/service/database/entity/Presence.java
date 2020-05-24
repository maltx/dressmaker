package hu.unideb.inf.dressmaker.core.service.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Class representing a Presence Entity.
 */
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

    private Date datum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Presence{" +
                "id=" + id +
                ", worker=" + worker +
                ", section=" + section +
                ", status=" + status +
                ", datum=" + datum +
                '}';
    }
}