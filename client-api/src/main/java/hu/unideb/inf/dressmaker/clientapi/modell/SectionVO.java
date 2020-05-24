package hu.unideb.inf.dressmaker.clientapi.modell;

/**
 * Class representing a section on the view side
 */
public class SectionVO {

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
        return section;
    }
}
