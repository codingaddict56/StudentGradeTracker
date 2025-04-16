public class NamesFL {

    @Id
    private String FirstName;
    private String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "NamesFL{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}