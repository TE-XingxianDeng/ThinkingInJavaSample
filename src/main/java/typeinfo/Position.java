package typeinfo;

/**
 * @author Dylan
 * @version 1.00 6/25/2016 11:34
 */
public class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null)
            person = Person.NULL;
    }

    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person newPerson) {
        this.person = newPerson;
        if (person == null)
            person = Person.NULL;
    }

    @Override
    public String toString() {
        return "Position: " + title + ' ' + person;
    }
}
