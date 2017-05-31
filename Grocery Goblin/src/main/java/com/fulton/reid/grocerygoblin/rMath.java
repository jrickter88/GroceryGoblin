package com.fulton.reid.grocerygoblin;

import android.support.annotation.NonNull;
import android.widget.TextView;

/**
 * Created by Reid on 5/31/2017.
 */

public class rMath {

    public static double calculateing(@NonNull TextView v1, @NonNull TextView v2)
    {
        double qty1 = Double.valueOf(v1.getText().toString());
        double price1 = Double.valueOf(v2.getText().toString());

        return round((price1/qty1),2);

    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }




}
