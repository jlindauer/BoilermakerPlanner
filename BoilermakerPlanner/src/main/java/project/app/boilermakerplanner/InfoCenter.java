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
        for (int i = 0; i < 10; i++) {
            temp_cal = Calendar.getInstance();
            temp_cal.set(2013,11,30,1+i,0);
            tasks.add(new Task(temp_cal,"task "+(i+1)));
        }
        return tasks;
    }
}
