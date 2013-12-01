package project.app.boilermakerplanner;

import java.util.ArrayList;
import java.util.Calendar;


/**
 * Created by tannermcrae on 11/30/13.
 */
public class InfoCenter {
    public static ArrayList<Task> getTasks(Calendar cal) {
        // Query db and get tasks from the day month and year of cal object
        ArrayList<Task> tasks = new ArrayList<Task>();

        // Creating dummy data for now
        Calendar temp_cal;
        for (int i = 0; i < 20; i++) {
            temp_cal = Calendar.getInstance();
            temp_cal.set(2013,11,30,1+i,0);
            tasks.add(new Task(temp_cal, "task "+(1+i) + ": This is a lot of text to test if this array adapter can actually wrap. I really hope it works"));
        }
        return tasks;
    }
}
