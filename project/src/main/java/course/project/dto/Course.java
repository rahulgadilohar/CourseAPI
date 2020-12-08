package course.project.dto;

//This is our POJO class.
//his course class is for creating variables and dto stands on "data transfer object".

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity   //Entity creates it as a table.
public class Course {

    @Id //Here we set a primary key for ID.
    @GeneratedValue  //This will generated ID by sequence.
    private int crsId;
    private String crsName;
    private String crsContent;

//This is default constructor with no arguments.
public Course(){

}

//Here we are using constructor for initialisation.
    public Course(int crsId, String crsName, String crsContent) {
        this.crsId = crsId;
        this.crsName = crsName;
        this.crsContent = crsContent;
    }

    //this are getters and setters.
    public int getCrsId() {
        return crsId;
    }

    public void setCrsId(int crsId) {
        this.crsId = crsId;
    }

    public String getCrsName() {
        return crsName;
    }

    public void setCrsName(String crsName) {
        this.crsName = crsName;
    }

    public String getCrsContent() {
        return crsContent;
    }

    public void setCrsContent(String crsContent) {
        this.crsContent = crsContent;
    }
}
