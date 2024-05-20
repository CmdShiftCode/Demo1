package OOPSConcepts.Association;

public class StudentAssociation {

    private String name;

    public StudentAssociation(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentAssociation [name=" + name + "]";
    }

    
}
