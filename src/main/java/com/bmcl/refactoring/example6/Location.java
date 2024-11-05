package com.bmcl.refactoring.example6;

public class Location {
    public String locationLatitude;
    public String locationLongitude;
    public String locationName;

    public Location(String locationLatitude, String locationLongitude, String locationName) {
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return locationLatitude + "," + locationLongitude + " (" + locationName + ")";
    }
}
