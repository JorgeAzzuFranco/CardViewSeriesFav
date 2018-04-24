package com.jorgeazzufranco.cardviewseriesfav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Jorge Azzu Franco on 24/4/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount () {
        return numTabs;
    }
}
