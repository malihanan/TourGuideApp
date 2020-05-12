package com.example.tourguideapp;

public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Location(String name, String description) {
        this.mName = name;
        this.mDescription = description;
    }

    public Location(String name, String description, int imageResourceId) {
        this.mName = name;
        this.mDescription = description;
        this.mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    @Override
    public String toString() {
        return "Location{" +
                "mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
