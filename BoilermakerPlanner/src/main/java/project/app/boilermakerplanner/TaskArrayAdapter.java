package project.app.boilermakerplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by jared on 11/30/13.
 */
public class TaskArrayAdapter extends ArrayAdapter<Task> {
    private final Context context;
    private final ArrayList<Task> tasks;

    public TaskArrayAdapter(Context context, ArrayList<Task> tasks) {
        super(context, R.layout.rowlayout, tasks);
        this.context = context;
        this.tasks = tasks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(tasks.get(position).getDescription());
        imageView.setImageResource(R.drawable.checkmark);

        return rowView;
    }
}
