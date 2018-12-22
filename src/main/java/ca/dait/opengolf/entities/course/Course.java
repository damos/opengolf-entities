package ca.dait.opengolf.entities.course;

public class Course {
    private String id;
    private Double distance;
    private CourseDetails details;

    public Course(String id){
        this.id = id;
    }

    public Course(String id, CourseDetails details) {
        this.id = id;
        this.details = details;
    }

    public Course(String id, Double distance, CourseDetails details) {
        this.id = id;
        this.distance = distance;
        this.details = details;
    }

    public String getId(){
        return this.id;
    }

    public Double getDistance(){
        return this.distance;
    }

    public CourseDetails getDetails(){
        return this.details;
    }

}