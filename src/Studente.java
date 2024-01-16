public class Studente {

    private String firstName;

    private String lastName;

    private String id;

    public java.lang.String getFirstName() {     // metodo getters
        return firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public java.lang.String getId() {
        return id;
    }

    public void setFirstName(java.lang.String firstName) {   // metodo setters
        this.firstName = firstName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }


    public Studente(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Studente{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
