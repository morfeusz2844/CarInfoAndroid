package pl.augustyn.carinfoandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

/**
 * Created by patry on 17.01.2016.
 */
public class CarListFragment extends Fragment {

    private OnShowCarActionListener listener;
    private CarAdapter adapter;
    public interface OnShowCarActionListener {
        void showCar(Car car);
    }

    private ColumnNumberPreferences columnNumberPreferences;
    private GridView grid;

    public CarListFragment() {
        //none
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try{
            listener = (OnShowCarActionListener) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+"must implement OnShowCarActionListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_car_list,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        columnNumberPreferences = new ColumnNumberPreferences(getActivity());

        initializeGrid();
    }

    private void initializeGrid(){
        grid  = (GridView) getView().findViewById(R.id.car_grid);

        adapter = new CarAdapter(getActivity());
        grid.setNumColumns(columnNumberPreferences.getSelectedNumberOfColumns());

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Car car = adapter.getItem(position);
                listener.showCar(car);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
