package ca.dait.opengolf.entities.course;

public class CourseDetails {
    private String name;
    private String country;
    private CourseDetails.Hole holes[];

    public static class Hole{
        private double lat;
        private double lon;
    }

}
