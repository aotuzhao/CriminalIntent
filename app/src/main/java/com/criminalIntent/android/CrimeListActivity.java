package com.criminalIntent.android;

import android.support.v4.app.Fragment;

import com.criminalIntent.android.view.SingleFragmentActivity;

/**
 * Created by aotu on 2017/10/15.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
