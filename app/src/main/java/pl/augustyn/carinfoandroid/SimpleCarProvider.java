package pl.augustyn.carinfoandroid;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by patry on 16.01.2016.
 */
public class SimpleCarProvider implements CarProvider {

    private List<Car> cars = new ArrayList<>();

    public SimpleCarProvider(Context context) {
        cars.add(new Car("Fiat","Seicento",new Date(2003,04,15),new Date(2016,02,15),new Date(2006,01,30)));
    }

    @Override
    public Car getCar(int position) {
        return cars.get(position);
    }

    @Override
    public int getCarNumber() {
        return cars.size();
    }
}
