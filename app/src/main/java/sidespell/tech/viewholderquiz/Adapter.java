package sidespell.tech.viewholderquiz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by raprap on 1/14/2016.
 */
public class Adapter extends ArrayAdapter<Movie>{


    private final int resources;
    Viewholder holder = null;

    String[] movie = getContext().getResources().getStringArray(R.array.movName);
    public Adapter(Context context, int resources, List<Movie> movie)
    {
        super(context,resources,movie);
        this.resources = resources;

    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {

        if(convertView == null)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.list_view,null);
            holder = new Viewholder();
            holder.mName = (TextView)convertView.findViewById(R.id.movieName);
            holder.mGender= (TextView)convertView.findViewById(R.id.movieGenre);
            holder.mImage= (TextView)convertView.findViewById(R.id.mImage);
            convertView.setTag(holder);
        }
        else {
            holder = (Viewholder)convertView.getTag();
        }

        return convertView;
    }

    
}
