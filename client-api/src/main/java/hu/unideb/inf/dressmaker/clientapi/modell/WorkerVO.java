package hu.unideb.inf.dressmaker.clientapi.modell;


public class WorkerVO {

    private Long id;

    private String name;

    private SectionVO section;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SectionVO getSection() {
        return section;
    }

    public void setSection(SectionVO section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name;
    }
}
