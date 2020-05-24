package hu.unideb.inf.dressmaker.clientapi.modell;


import java.util.Date;

public class PresenceVO {

    private Long id;

    private WorkerVO worker;

    private SectionVO section;

    private StatusVO status;

    private Date datum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WorkerVO getWorker() {
        return worker;
    }

    public void setWorker(WorkerVO worker) {
        this.worker = worker;
    }

    public SectionVO getSection() {
        return section;
    }

    public void setSection(SectionVO section) {
        this.section = section;
    }

    public StatusVO getStatus() {
        return status;
    }

    public void setStatus(StatusVO status) {
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
        return "PresenceVO{" +
                "id=" + id +
                ", worker=" + worker +
                ", section=" + section +
                ", status=" + status +
                ", datum=" + datum +
                '}';
    }
}
