package ca.dait.opengolf.entities.course;

public class CourseDetails {
    private String name;
    private String country;
    private CourseDetails.Hole holes[];

    public static class Hole{
        private double lat;
        private double lon;

        public double getLat(){
            return this.lat;
        }

        public double getLon(){
            return this.lon;
        }
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }
    public Hole[] getHoles(){
        return this.holes;
    }

}
