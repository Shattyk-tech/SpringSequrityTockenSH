package peaksoft.model;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String firstName;
    private String lastName;
    private String email;
    private String studyFormat;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, String studyFormat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studyFormat = studyFormat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudyFormat() {
        return studyFormat;
    }

    public void setStudyFormat(String studyFormat) {
        this.studyFormat = studyFormat;
    }
}
