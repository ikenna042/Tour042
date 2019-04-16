package com.example.android.tour042;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate site_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Creating an ArrayList of Malls
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Polo Mall");
        sites.add("Enugu Mall");
        sites.add("Roban Stores");
        sites.add("Eastern Shop");
        sites.add("Best Choice");

        //Creating Array list of Malls info
        final  ArrayList<GenericModel> locationList = new ArrayList<>();

        locationList.add(new GenericModel("Polo Mall", R.drawable.a1,
                "Polo Roots Restaurant and Cafe is one of the most\n" +
                "celebrated African cuisine restaurants in Nigeria, bringing in rich African culture and\n" +
                "heritage in an environment that is welcoming, clean and comforting.The Roots restaurant\n" +
                "and Cafe ispowered by Crunchies Fried Chicken.\n" +
                "Over many years of customer service experience and careful study of healthy eating habits,\n" +
                " we have opened new doors to a larger variety of menus to provide a list of African diets\n" +
                " with a mix of other foreign influences such as\n" +
                " All-day breakfast, Chinese Cuisines, Continental Dishes and Cafe. Using the best natural\n" +
                "cooking ingredients, our kitchen produces the most nourishing local and continental dishes\n" +
                "for healthy living. In Enugu we are located at Plot M 23c Independence Layout, Opposite\n" +
                "Okpara Square, Beside SPAR. For more information call +234 9063930915 or visit\n" +
                " https://www.roots.com.ng"));

        locationList.add(new GenericModel("Enugu Mall", R.drawable.a2,
                "Enugu Mall Restaurant and Cafe is one of the most\n" +
                        "celebrated African cuisine restaurants in Nigeria, bringing in rich African culture and\n" +
                        "heritage in an environment that is welcoming, clean and comforting.The Roots restaurant\n" +
                        "        and Cafe ispowered by Crunchies Fried Chicken.\n" +
                        "        Over many years of customer service experience and careful study of healthy eating habits,\n" +
                        "        we have opened new doors to a larger variety of menus to provide a list of African diets\n" +
                        "        with a mix of other foreign influences such as\n" +
                        "        All-day breakfast, Chinese Cuisines, Continental Dishes and Cafe. Using the best natural\n" +
                        "        cooking ingredients, our kitchen produces the most nourishing local and continental dishes\n" +
                        "        for healthy living. In Enugu we are located at Plot M 23c Independence Layout, Opposite\n" +
                        "        Okpara Square, Beside SPAR. For more information call +234 9063930915 or visit\n" +
                        "        https://www.roots.com.ng"));

        locationList.add(new GenericModel("Roban Stores", R.drawable.a3,
                "Roban Stores is one of the most\n" +
                        "        celebrated African cuisine restaurants in Nigeria, bringing in rich African culture and\n" +
                        "        heritage in an environment that is welcoming, clean and comforting.The Roots restaurant\n" +
                        "        and Cafe ispowered by Crunchies Fried Chicken.\n" +
                        "        Over many years of customer service experience and careful study of healthy eating habits,\n" +
                        "        we have opened new doors to a larger variety of menus to provide a list of African diets\n" +
                        "        with a mix of other foreign influences such as\n" +
                        "        All-day breakfast, Chinese Cuisines, Continental Dishes and Cafe. Using the best natural\n" +
                        "        cooking ingredients, our kitchen produces the most nourishing local and continental dishes\n" +
                        "        for healthy living. In Enugu we are located at Plot M 23c Independence Layout, Opposite\n" +
                        "        Okpara Square, Beside SPAR. For more information call +234 9063930915 or visit\n" +
                        "        https://www.roots.com.ng"));

        locationList.add(new GenericModel("Eastern Shop", R.drawable.res_crunches,
                "Eastern shop Restaurant and Cafe is one of the most\n" +
                        "        celebrated African cuisine restaurants in Nigeria, bringing in rich African culture and\n" +
                        "        heritage in an environment that is welcoming, clean and comforting.The Roots restaurant\n" +
                        "        and Cafe ispowered by Crunchies Fried Chicken.\n" +
                        "        Over many years of customer service experience and careful study of healthy eating habits,\n" +
                        "        we have opened new doors to a larger variety of menus to provide a list of African diets\n" +
                        "        with a mix of other foreign influences such as\n" +
                        "        All-day breakfast, Chinese Cuisines, Continental Dishes and Cafe. Using the best natural\n" +
                        "        cooking ingredients, our kitchen produces the most nourishing local and continental dishes\n" +
                        "        for healthy living. In Enugu we are located at Plot M 23c Independence Layout, Opposite\n" +
                        "        Okpara Square, Beside SPAR. For more information call +234 9063930915 or visit\n" +
                        "        https://www.roots.com.ng"));

        locationList.add(new GenericModel("Best Choice", R.drawable.res_roots,
                "Best Choice is one of the most\n" +
                        "        celebrated African cuisine restaurants in Nigeria, bringing in rich African culture and\n" +
                        "        heritage in an environment that is welcoming, clean and comforting.The Roots restaurant\n" +
                        "        and Cafe is powered by Crunchies Fried Chicken.\n" +
                        "        Over many years of customer service experience and careful study of healthy eating habits,\n" +
                        "        we have opened new doors to a larger variety of menus to provide a list of African diets\n" +
                        "        with a mix of other foreign influences such as\n" +
                        "        All-day breakfast, Chinese Cuisines, Continental Dishes and Cafe. Using the best natural\n" +
                        "        cooking ingredients, our kitchen produces the most nourishing local and continental dishes\n" +
                        "        for healthy living. In Enugu we are located at Plot M 23c Independence Layout, Opposite\n" +
                        "        Okpara Square, Beside SPAR. For more information call +234 9063930915 or visit\n" +
                        "        https://www.roots.com.ng"));

        final ArrayAdapter<String> sitesAdapter =
                new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, sites);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(sitesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3)
            {
                Intent intent = new Intent(getContext(), DetailsActivity.class);

                String title, desc;
                int imgId;

                title = locationList.get(position).getLocationTitle();
                desc = locationList.get(position).getPlaceDesc();
                imgId = locationList.get(position).getImageResId();


                intent.putExtra("keyTitle",title);
                intent.putExtra("keyDesc",desc);
                intent.putExtra("keyImageResId",imgId);

                startActivity(intent);
            }
        });
        return rootView;
    }

}
