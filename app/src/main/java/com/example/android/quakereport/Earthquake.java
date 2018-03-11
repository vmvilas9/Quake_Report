package com.example.android.quakereport;

/**
 * Created by Admin on 06-03-2018.
 */

public class Earthquake {

    private final double mMagnitude;

    private final String mLocation;

    private final long mTimeInMilliseconds;

    private final String mUrl;

    public Earthquake(double magnitude,String location,long timeInMilliseconds,String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){return mMagnitude;}

    public String getLocation(){return mLocation;}

    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}

    public String getUrl(){return mUrl;}
}
