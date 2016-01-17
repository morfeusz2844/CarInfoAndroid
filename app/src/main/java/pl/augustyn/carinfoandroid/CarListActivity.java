package pl.augustyn.carinfoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CarListActivity extends CarsBaseActionbarActivity  implements CarListFragment.OnShowCarActionListener{

    private CarListFragment carListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        carListFragment = new CarListFragment();

        if (isTablet()){
//            addFragment(carDetailsFragment, R.id.details);
        }
        CarListFragment carListFragment = new CarListFragment();
        addFragment(carListFragment,R.id.container);
    }

    @Override
    public void showCar(Car car) {
        if(isTablet()){

        }
    }
}
