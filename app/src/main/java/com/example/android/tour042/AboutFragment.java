package com.example.android.tour042;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate site_itemitem.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.site_view, container, false);

       TextView headerTextView = rootView.findViewById(R.id.header_text_view);
       headerTextView.setText(R.string.about_heading);

       TextView bodyTextView = rootView.findViewById(R.id.body_text_view);
       bodyTextView.setText(R.string.about_body);

        ImageView imageView = rootView.findViewById(R.id.image_view);
        imageView.setImageResource(R.drawable.enugu);

    return rootView;
    }

}
