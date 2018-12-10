package ca.dait.opengolf.entities.course;

public class Course {
    private String id;
    private CourseDetails details;

    public Course(String id){
        this.id = id;
    }

    public Course(String id, CourseDetails details) {
        this.id = id;
        this.details = details;
    }

    public String getId(){
        return this.id;
    }

    public CourseDetails getDetails(){
        return this.details;
    }
}