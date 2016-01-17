package pl.augustyn.carinfoandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by patry on 16.01.2016.
 */
public class CarAdapter extends BaseAdapter {

    private CarProvider carProvider;
    private Context context;

    public CarAdapter(Context context) {
        this.context = context;
        this.carProvider = new SimpleCarProvider(context);
    }

    @Override
    public int getCount() {
        return carProvider.getCarNumber();
    }

    @Override
    public Car getItem(int position) {
        return carProvider.getCar(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View carView;

        if (convertView == null){
            carView = LayoutInflater.from(context).inflate(R.layout.car_row,parent,false);
        } else {
            carView = convertView;
        }
        bindCarToView(getItem(position),carView,position);

        return carView;
    }
    private void bindCarToView(Car car,View carView, int position)
    {
        ImageView carPhoto = (ImageView) carView.findViewById(R.id.car_photo);
        TextView carLabel = (TextView) carView.findViewById(R.id.car_label);

        carPhoto.setImageResource(getImageForPosition(position));
        carLabel.setText(car.getManufacturer()+" "+car.getModel());

    }
    private int getImageForPosition(int position){
        return R.drawable.car1;
    }
}
