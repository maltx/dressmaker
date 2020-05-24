package hu.unideb.inf.dressmaker.core.service.database.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Section {

    @Id
    @GeneratedValue
    private Long id;

    private String section;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", section='" + section + '\'' +
                '}';
    }
}
