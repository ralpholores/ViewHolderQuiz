package sidespell.tech.viewholderquiz.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {

    private ListView mListView;
    private ArrayAdapter<String>  listAdapter;

    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listview,container,false);

        mListView.setAdapter(listAdapter);


        return view;
    }

}

