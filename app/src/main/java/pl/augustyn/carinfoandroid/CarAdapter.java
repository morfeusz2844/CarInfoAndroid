package pl.augustyn.carinfoandroid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
    public Object getItem(int position) {
        return carProvider.getCar(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
