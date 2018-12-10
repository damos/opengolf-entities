package ca.dait.opengolf.entities.course;

public class CourseSearchResult {
    private Course results[];

    public CourseSearchResult(Course results[]){
        this.results = results;
    }

    public Course[] getResults(){
       return this.results;
    }
}
