package pl.augustyn.carinfoandroid;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by patry on 17.01.2016.
 */
public class CarsBaseActionbarActivity extends ActionBarActivity {

    protected void addFragment(Fragment fragment, int container) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(container,fragment);
        fragmentTransaction.commit();

    }

    protected boolean isTablet() {
        return getResources().getBoolean(R.bool.isTablet);
    }
}
