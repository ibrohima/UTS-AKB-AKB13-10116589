package com.yusup.uts_akb_if13_10116589;
/**
 * 22 - 05 - 2019
 * 10116589
 * YUSUP MAULANA IBROHIM
 * IF13/ AKB13
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {
    View myview;
    ViewPager viewPager;

    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         myview = inflater.inflate(R.layout.fragment_beranda, container, false);
         viewPager =(ViewPager) myview.findViewById(R.id.viewpager1);
        viewPager.setAdapter(new CustomPagerAdapter(getActivity()));
        return myview;
    }

}
