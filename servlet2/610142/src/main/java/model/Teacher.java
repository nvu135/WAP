package model;

public class Teacher {
    private String firstName;
    private String lastName;

    public Teacher(String userName, String password) {
        this.firstName = userName;
        this.lastName = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
