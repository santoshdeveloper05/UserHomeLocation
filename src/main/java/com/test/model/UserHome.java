package com.test.model;

public class UserHome {
    private boolean isHomeLocation = false;

    private String latitude;

    private String longitude;

    private long highesTimeSpent;

    public boolean isHomeLocation() {
        return isHomeLocation;
    }

    public void setHomeLocation(boolean isHomeLocation) {
        this.isHomeLocation = isHomeLocation;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public long getHighesTimeSpent() {
        return highesTimeSpent;
    }

    public void setHighesTimeSpent(long highesTimeSpent) {
        this.highesTimeSpent = highesTimeSpent;
    }

    @Override
    public String toString() {
        return "UserHome [isHomeLocation=" + isHomeLocation + ", latitude=" + latitude + ", longitude=" + longitude
                + ", highesTimeSpent=" + highesTimeSpent + "]";
    }

}
