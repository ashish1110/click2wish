package com.example.pavilion.click2wish;

/**
 * Created by Pavilion on 11-11-2017.
 */

public class food {
    private String foodname;
    private int imageid;


    public food(String foodname, int imageid,int price) {
        this.foodname = foodname;
        this.imageid = imageid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}

