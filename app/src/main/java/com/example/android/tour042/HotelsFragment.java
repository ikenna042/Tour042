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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate site_list.xml layout for this fragment
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Creating an ArrayList of Hotels
        final ArrayList<String> sites = new ArrayList<>();
        sites.add("Golden Royal");
        sites.add("Cordial Hotel");
        sites.add("The Gate Hotel");
        sites.add("Adig Suites");
        sites.add("Oaklands Hotel");

        //Creating Array list of Hotel info
        final  ArrayList<GenericModel> locationList = new ArrayList<>();
        /*locationList.add(new GenericModel(R.string.hotel_golden_title, R.drawable.hotel_golden,
                R.string.hotel_golden_info));*/
        locationList.add(new GenericModel("Golden Royal", R.drawable.hotel_golden, "Golden Royale Hotel has a sound management team with\n" +
                "        professionalism and a spirit of innovation when it comes to meeting and exceeding customer\n" +
                "        expectations. This hotel is located at 10 Bissala Road, Independence Layout, Enugu, Nigeria.\n" +
                "With 88 exquisitely furnished rooms and suite on 3 floors, Golden Royale provides the solution to\n" +
                "        all your accommodation and conference requirements.  These rooms are categorised into\n" +
                "        Classic, Royal Suites and the Penthouse. Each room is furnished and equipped with\n" +
                "        air-conditioning units, framed paintings, satellite connected flat screen TV, refrigerator,\n" +
                "        telephone, bedside lamp and an en-suite bathroom that feature a power shower. Complimentary\n" +
                "        breakfast is served daily.\n" +
                "Golden Royale has a couple of facilities put in place for its guests. These facilities include bars\n" +
                "        and restaurant offering Mediterranean and local cuisine, WI-FI internet facility, fully\n" +
                "        equipped gym, a sauna where guests can enjoy a steam bath with an outdoor adult and\n" +
                "        children swimming pool; the conference centre has ultra-modern state-of-the-art facilities.\n" +
                "        This hotel boasts 24hrs police patrol and in-house security presence as well as CCTV cameras.\n" +
                "Additional services rendered by the hotel include 24hrs room service, airport shuttle, car hire,\n" +
                "        laundry/dry cleaning and business services.For more information and reservation visit\n" +
                "        https://www.goldenroyalehotels.com"));

        locationList.add(new GenericModel("Hotel Cordial", R.drawable.hotel_codial,
                "Constructed in a stylish fashion and equipped with modern\n" +
                        "        facilities, Hotel Codial is a boutique hotel located at 151 Chime Avenue, New Haven,\n" +
                        "        Enugu, Nigeria. It is in the low-density area of New Haven, Enugu State.\n" +
                        "The fenced hotel premises has well-furnished rooms that are of varying categories. These categories\n" +
                        "        are Super Single, Super Double, Executive Single and Executive Double Rooms. Each room is\n" +
                        "        designated as non-smoking areas and feature full air-conditioning, a king-sized bed, cable\n" +
                        "        enabled flat screen TV, safety deposit box and an en-suite bathroom.\n" +
                        "Hotel Codial boasts facilities such as free Wi-Fi, swimming pool, a fitness centre/gym, 24 hours\n" +
                        "        facilities, free adequate parking space, 24 hours front desk service, a restaurant that\n" +
                        "        serves from a wide list of local, Chinese and other continental cuisines, and a\n" +
                        "        cocktail/public/open sky bar where guests can get access to assorted snacks and a variety\n" +
                        "        of both alcoholic and non-alcoholic drinks. Hotel Codial has security personnel that ensure\n" +
                        "        the safety of guests and their properties.\n" +
                        "Additional services offered on request by Hotel Codial include contract catering services, a\n" +
                        "        conference hall with a 500 person capacity, a gift shop, laundry/dry cleaning, car hire,\n" +
                        "        ironing and 24 hours room service. For more information on reservation and booking visit\n" +
                        "        https://hotels.ng/hotel/92787-hotel-codial-enugu"));

        locationList.add(new GenericModel("The Gate Hotel", R.drawable.hotel_gate,
                "At The Gates Luxury Apartment we are proud to serve and create\n" +
                        "        an ambiance that will make you feel calm and relaxed. We provide the best personalized\n" +
                        "        service from professional staff to exceed the need of our esteemed guests. Together with\n" +
                        "        tastefully furnished Apartments we pride ourselves in providing you with excellent service\n" +
                        "        at competitive price.\n" +
                        "The Gates is an American franchise under Zivama Hospitality Ltd. The Gates Apartment is located in\n" +
                        "        the popular Zoo Estate by Ogui Junction, in Enugu North LGA of Enugu State; about 10 minute\n" +
                        "        drive from Enugu International Airport. The Gates is within a serene environment; is the\n" +
                        "        ideal place for lodging, banquets, and executive meetings. The elegant garden bar of the\n" +
                        "        gates can provide natural scenery, beauty and relaxation. The Gates has a conference room\n" +
                        "        that is fully equipped and furnished to taste.\n" +
                        "Breakfast, lunch or dinner is available on request where delicious buffets are served, enjoy exotic\n" +
                        "        cocktails at our bars and feel totally relaxed.\n" +
                        "The Apartment hosts outstanding facilities together with a friendly and professional staff to serve\n" +
                        "        you better.\n" +
                        "- See more at: http://thegates.com.ng/about-us/#sthash.Bp7npOrS.dpuf "));

        locationList.add(new GenericModel("Adig Suites", R.drawable.hotel_adig,
                "Adig Suites is a top class 4-star hotel situated at 2 Nwafor\n" +
                        "        Orizu Street, Independence Layout, Enugu, Nigeria. It’s a tourist favourite due to its\n" +
                        "        proximity to the Ngwo Pine Forest.\n" +
                        "Adig Suites has rooms with classy and home feel with designs incorporating modern furnishing.\n" +
                        "        Room categories include Superior Room, Executive Room, Junior Suite and Executive Suite.\n" +
                        "        Some rooms have a view overlooking the city. Each room features a spacious bathroom,\n" +
                        "        king-sized beds, cable connected LCD TV sets, refrigerators and air conditioners.\n" +
                        "At the Adig Suites, rooms contain a desk. All rooms are equipped with an electric tea pot, while\n" +
                        "        some rooms also feature a kitchenette with a fridge. All rooms feature a closet.\n" +
                        "A number of facilities are available Adig Suites Hotel. These include free WiFi, a swimming pool,\n" +
                        "        a body spa, a restaurant and a bar. Guests at this hotel will have more time to enjoy their\n" +
                        "        stay at the hotel.\n" +
                        "The hotel offers additional services on request such as 24-hour front desk, shuttle service,\n" +
                        "Concierge service, Luggage storage, Express check-in/check-out, Cleaning services,\n" +
                        "Room service, Event Hall, Free Parking Space, Ironing service, Designated Smoking Area,\n" +
                        "Hypoallergenic Room Available, Convenience Store, Car Rental, Souvenir/Gift Shop, Safe,\n" +
                        "Elevator, Honeymoon Suite, VIP Room Facilities, Family Rooms, Dry cleaning/Laundry service\n" +
                        "and business centre."));

        locationList.add(new GenericModel("Oakland Hotel", R.drawable.hotel_oaklands,
                "Oakland Hotels and Amusement Park is a top-class hotel\n" +
                        "located at Tunnel Crossing, Ogui Link Road, Beside Elim Plaza, Enugu, Nigeria. The hotel\n" +
                        "offers affordable accommodation to guests.\n" +
                        "Guests will enjoy a complimentary breakfast.\n" +
                        "Each room at Oakland Hotels and Amusement Park has a study desk, an air conditioner, free WiFi, and\n" +
                        "king-sized beds.\n" +
                        "Also available at the hotel are a restaurant and a bar.\n" +
                        "Guests can enjoy different meals at the restaurant on site.\n" +
                        "Services available include Room service, Cleaning services.\n" +
                        "In addition, guests can also enjoy Luggage storage on request.\n" +
                        "For more information or reservation visit\n" +
                        "https://hotels.ng/hotel/1391127-oakland-hotels-and-amusement-park"));


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


