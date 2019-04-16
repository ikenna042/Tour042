package com.example.android.tour042;


public class GenericModel {
    private String locationTitle;
    private int imageResId;
    private String placeDesc;


   public GenericModel(String locTitle, int imgId, String placeDesc){
       this.locationTitle = locTitle;
       this.imageResId = imgId;
       this.placeDesc = placeDesc;
   }

    public String getLocationTitle() {
        return locationTitle;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getPlaceDesc() {
        return placeDesc;
    }
}
