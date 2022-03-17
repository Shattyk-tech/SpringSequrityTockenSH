package peaksoft.model;

import javax.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String courseName;
    private String durationMonth;

    public Course() {

    }

    public Course(String courseName, String durationMonth) {
        this.courseName = courseName;
        this.durationMonth = durationMonth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDurationMonth() {
        return durationMonth;
    }

    public void setDurationMonth(String durationMonth) {
        this.durationMonth = durationMonth;
    }
}
