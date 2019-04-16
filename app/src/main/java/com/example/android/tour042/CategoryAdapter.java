package com.example.android.tour042;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by IKENNA on 7/9/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     *
     * @param fm is the Fragment manager that will keep each fragment's state in the adapter across
     *           swipes.
     */

    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }


    /**
     * Return the{@linl Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else if (position == 3) {
            return new ChurchesFragment();
        } else {
            return new MallsFragment();
        }
    }

    /**
     * Return total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_about);
        } else if (position == 1) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 3) {
            return mContext.getString(R.string.category_churches);
        } else {
            return mContext.getString(R.string.category_malls);
        }
    }
}
