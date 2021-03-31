package com.example.tp4re.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.tp4re.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return NatureFragment.newInstance(0, mContext.getString(R.string.titre_section0));
            case 1:
                return NatureFragment.newInstance(1, mContext.getString(R.string.titre_section1));
            case 2:
                return NatureFragment.newInstance(2, mContext.getString(R.string.titre_section2));
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.titre_section0).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.titre_section1).toUpperCase(l);
            case 2:
                return mContext.getString(R.string.titre_section2).toUpperCase(l);
        }
        return null;
    }


    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}