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
public class ChurchesFragment extends Fragment {


    public ChurchesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate site_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Creating an ArrayList of Churches
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Catholic Church");
        sites.add("Anglican Church");
        sites.add("Assemblies of God");
        sites.add("Winners Chapel");
        sites.add("House On The Rock");

        //Creating Array list of Churches info
        final  ArrayList<GenericModel> locationList = new ArrayList<>();

        locationList.add(new GenericModel("The Roman Catholic Church", R.drawable.church_catholic, "The Roman Catholic Diocese of Enugu is a diocese located in\n" +
                "        the city of Enugu in the Ecclesiastical province of Onitsha in Nigeria. On November 12,\n" +
                "        1962, the Diocese of Enugu was erected from ecclesiastical territory gained from the\n" +
                "        Metropolitan Archdiocese of Onitsha. The Cathedral is Holy Ghost Cathedral in Enugu. There\n" +
                "        are about 53 Catholic parishes in Enugu, we have\n" +
                "        -New Haven (St. Mulumba)\n" +
                "        -Ekulu, G.R.A. (Christ the King)\n" +
                "        -Golf Estate (Holy Spirit)\n" +
                "        -Ind. Layout (Blessed Sacrament)\n" +
                "        -Uwani (Sacred Heart)\n" +
                "        Visit http://catholicdioceseenugu.org for more information."));

        locationList.add(new GenericModel("The Anglican Communion",
                R.drawable.church_anglican, "Welcome to the diocese of Enugu. Anglican communion is a\n" +
                "        reputable church in the heart of Enugu well positioned at major places around the city.\n" +
                "        The Anglican Province of Enugu is one of the 14 ecclesiastical provinces of the Church of\n" +
                "        Nigeria. The province comprises 12 dioceses. The Archbishop of the Province of Enugu is\n" +
                "        Emmanuel Chukwuma, who succeeded Amos Madu in 2014. The has it's state province located at\n" +
                "        Archbishop's Court, No 40 Nawfia Street, Independence Layout, Enugu, Nigeria."));

        locationList.add(new GenericModel("Assemblies of God", R.drawable.a3,
                "Assemblies of God is widely known as the mother of\n" +
                        "    pentecostalism in Nigeria. The church in Enugu is headed by the Rev. Dr. Emmanuel Ngene as the\n" +
                        "    district superintendent of Enugu. The church has more than 20 branches across the city but the\n" +
                        "    head church is located at No. 66 Chime Avenue New Haven, Enugu. The church has other branches\n" +
                        "    at Abakpa, Trans-ekulu, emene, G.R.A, Independence Layout, Uwani and so on."));

        locationList.add(new GenericModel("Winners Chapel", R.drawable.a4,
                "Winners Roots Restaurant and Cafe is one of the most\n" +
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

        locationList.add(new GenericModel("House On the Rock", R.drawable.a5,
               "House On The Rock Roots Restaurant and Cafe is one of the most\n" +
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
