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

public class BeachFragment extends Fragment {

    ArrayList<Location> locations;

    BeachFragment() {}

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
        locations.add(new Location(getString(R.string.palolem), getString(R.string.palolem_desc), R.drawable.palolembeach));
        locations.add(new Location(getString(R.string.dona_paula), getString(R.string.dona_paula_desc), R.drawable.donapaulabeach));
        locations.add(new Location(getString(R.string.arambol), getString(R.string.arambol_desc), R.drawable.arambolbeach));
        locations.add(new Location(getString(R.string.vagator), getString(R.string.vagator_desc), R.drawable.vagatorbeach));
        locations.add(new Location(getString(R.string.mobor), getString(R.string.mobor_desc), R.drawable.moborbeach));
    }
}
