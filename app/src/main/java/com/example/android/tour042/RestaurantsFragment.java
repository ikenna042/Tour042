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
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate site_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Creating an ArrayList of Restaurants
        final ArrayList<String> sites = new ArrayList<>();
        sites.add("Dolphin");
        sites.add("Ntachi Osa");
        sites.add("Kilimanjaro");
        sites.add("Crunchies");
        sites.add("Roots");

        //Creating Array list of Restaurant info
        final  ArrayList<GenericModel> locationList = new ArrayList<>();

        locationList.add(new GenericModel("Dolphin Restaurant", R.drawable.res_dolphin, "Dolphin Restaurant is an African Restaurant and bar in the \n" +
                "        heart of the Coal City. They have been serving customers since more than 30 years. \n" +
                "        Initially, they started the restaurant services under the name of Madam Volvo. The \n" +
                "        Restaurant is a perfect place for lunch, dinner or for having any kind of party. Dolphin\n" +
                "        principles are to combine the highest quality and authentic African food with excellent \n" +
                "        customer service at great value for money, all served in a comfortable ambience.\n" +
                "        For more information visit http://www.dolphinrestaurantng.com"));

        locationList.add(new GenericModel("Ntachi Osa", R.drawable.res_ntachi,
                "Passing by the Coal city or looking for a place to enjoy good\n" +
                        "        homely delicacies, relax and blow off some steam?. Then walk into this first grade\n" +
                        "        restaurant that offers the best varieties of quality African and continental meals, drinks\n" +
                        "        and first class services.\n" +
                        "        Ntachi Osa sells delicious African and continental dishes. We are one of Enugu state\n" +
                        "        standard restaurant with good food management, well prepared and neatly served food for\n" +
                        "        your delight."));

        locationList.add(new GenericModel("Kilimanjaro", R.drawable.res_kilimanjaro,
                "Kilimanjaro is one of Sundry Foods’ restaurant brands,\n" +
                        "        operating in the Quick Service Restaurant (QSR) segment, the brand has established itself\n" +
                        "        as a market leader and one of the fastest growing restaurant brands in the country with\n" +
                        "        currently 27 stores across Nigeria and more to come.\n" +
                        "        Kilimanjaro caters to the unique preference of the general populace in this part of sub-Saharan\n" +
                        "        Africa for their local dishes. Our unique menu consists of select popular contemporary and\n" +
                        "        Nigerian offerings. Items on our menu can also be found on dining tables in other African\n" +
                        "        countries. The Kilimanjaro brand was born out the quest to satisfy both local and\n" +
                        "        continental food cravings of our people. We deliver fresh, hot and mouth-watering meals,\n" +
                        "        pastries, sandwiches and beverages to thousands of customers in the finest environment each\n" +
                        "        day. Our restaurants stand out for their bright colours and lovely ambience inviting you to\n" +
                        "        dine-in or grab-and-go with the best quality meals. In Enugu we located at\n" +
                        "        -Polopark Mall\n" +
                        "        POLOPARK MALL, ABAKAILIKI ROAD, OLD GRA, ENUGU.\n" +
                        "        070054543663.\n" +
                        "        callcenter@sundryfood.com\n" +
                        "        -Enugu Mall\n" +
                        "        Enugu Mall, Independence Layout. Enugu\n" +
                        "        callcenter@sundryfood.com"));

        locationList.add(new GenericModel("Crunchies", R.drawable.res_crunches,
                "CRUNCHIES FRIED CHICKEN is a first grade quick service\n" +
                        "        restaurant that offers the best varieties of quality fast food products and first class\n" +
                        "        services. We are currently spread across the South-South and South-East Cities of Nigeria,\n" +
                        "        with over thirteen years’ experience. We have carved a niche of excellence in the fast food\n" +
                        "        delivery market with a service per excellence acquired from our daily interaction from our\n" +
                        "        valued Customers.\n" +
                        "        Crunchies Fried Chicken, Enugu is located at 4/5 Rangers Avenue, Enugu, Enugu."));

        locationList.add(new GenericModel("Roots Restaurant", R.drawable.res_roots,
                "Roots Restaurant and Cafe is one of the most celebrated African\n" +
                        "        cuisine restaurants in Nigeria, bringing in rich African culture and heritage in an\n" +
                        "        environment that is welcoming, clean and comforting.The Roots restaurant and Cafe is\n" +
                        "        powered by Crunchies Fried Chicken. Over many years of customer service experience and\n" +
                        "        careful study of healthy eating habits, we have opened new doors to a larger variety of\n" +
                        "        menus to provide a list of African diets with a mix of other foreign influences such as\n" +
                        "        All-day breakfast, Chinese Cuisines, Continental Dishes and Cafe. Using the best natural\n" +
                        "        cooking ingredients, our kitchen produces the most nourishing local and continental dishes\n" +
                        "        for healthy living. In Enugu we are located at Plot M 23c Independence Layout, Opposite\n" +
                        "        Okpara Square, Beside SPAR. For more information call +234 9063930915 or visit\n" +
                        "        https://www.roots.com.ng"));/**/

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
