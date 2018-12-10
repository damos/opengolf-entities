package ca.dait.opengolf.entities;

import com.google.gson.Gson;

/**
 * Created by darinamos on 2018-12-09.
 */

public class GsonFactory {
    private static final Gson gson = new Gson();

    public static Gson instance(){
        return gson;
    }
}
