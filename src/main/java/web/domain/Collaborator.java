package web.domain;

import java.time.LocalDate;

public class Collaborator {

    private final String firstName;
    private final String surname;
    private LocalDate dateOfBirth;

    public Collaborator(String firstName, String surname, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
