package errorHandler;

import java.util.ArrayList;

/**
 * Created by Alireza on 6/28/2015.
 */
public class ErrorHandler {
    public static boolean hasError = false;
    public static ArrayList<String> errors = new ArrayList<>();
    public static void printError(String msg) {
        hasError = true;
        errors.add(msg);
    }
}
