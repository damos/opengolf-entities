package ca.dait.opengolf.entities.course;

public class Course {
    private Long id;
    private String remoteId;
    private Double distance;
    private String facilityName;
    private String nickName;
    private String municipality;
    private String state;
    private String country;
    private String googlePlaceId;
    private Hole holes[];

    public Course(){}
    public Course(String remoteId){
        this.remoteId = remoteId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemoteId() {
        return remoteId;
    }

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFullName(){
        return (this.nickName == null) ? this.facilityName : this.facilityName + ": " + this.nickName;
    }

    public String getGooglePlaceId(){
        return this.googlePlaceId;
    }
    public void setGooglePlaceId(String googlePlaceId){
        this.googlePlaceId = googlePlaceId;
    }
    public Hole[] getHoles(){
        return this.holes;
    }
    public void setHoles(Hole holes[]){
        this.holes = holes;
    }

    public static class Hole{
        private double lat;
        private double lon;

        public Hole(double lat, double lon){
            this.lat = lat;
            this.lon = lon;
        }
        public double getLat(){
            return this.lat;
        }

        public double getLon(){
            return this.lon;
        }
    }
}