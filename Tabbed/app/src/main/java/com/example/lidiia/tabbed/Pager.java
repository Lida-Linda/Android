package com.example.lidiia.tabbed;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.TextView;


public class Pager extends FragmentPagerAdapter {

    int tabCount;
    TextView textView;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                UnCheckedFragment1 tab1 = new UnCheckedFragment1();
                return tab1;
            case 1:
                CheckedFragment2 tab2 = new CheckedFragment2();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Unchecked";
            case 1:
                return "Checked";
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
