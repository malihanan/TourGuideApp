package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CityFragment extends Fragment {

    ArrayList<Location> locations;

    CityFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        setLocationList();

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

    private void setLocationList() {
        locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.goa_velha), getString(R.string.goa_velha_desc), R.drawable.goavelha));
        locations.add(new Location(getString(R.string.panaji), getString(R.string.panji_desc), R.drawable.panaji));
        locations.add(new Location(getString(R.string.calangute), getString(R.string.calangute_desc), R.drawable.calangute));
        locations.add(new Location(getString(R.string.candolim), getString(R.string.candolim_desc), R.drawable.candolim));
        locations.add(new Location(getString(R.string.anjuna), getString(R.string.anjuna_desc), R.drawable.anjuna));
        locations.add(new Location(getString(R.string.baga), getString(R.string.baga_desc), R.drawable.baga));
        locations.add(new Location(getString(R.string.margao), getString(R.string.margao_desc), R.drawable.margao));
    }
}
