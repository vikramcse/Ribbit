package com.vikram.ribbit.app;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "1zNIBOpVLd0Wdc1Ay5cBrAJAE1N5y28d765tsjRd", "Vl3d8UrrVVIXWvUvUQA3ejCD6oiUecFPYPC0mGZw");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
