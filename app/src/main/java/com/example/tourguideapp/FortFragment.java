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

public class FortFragment extends Fragment {

    ArrayList<Location> locations;

    FortFragment() {}

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
        locations.add(new Location(getString(R.string.aguanda), getString(R.string.aguanda_desc), R.drawable.aguadafort));
        locations.add(new Location(getString(R.string.chapora), getString(R.string.chapora_desc), R.drawable.chaporafort));
        locations.add(new Location(getString(R.string.mormugao), getString(R.string.mormugao_desc), R.drawable.mormugaofort));
        locations.add(new Location(getString(R.string.corjuem), getString(R.string.corjuem_desc), R.drawable.corjuemfort));
        locations.add(new Location(getString(R.string.sinquerim), getString(R.string.sinquerim_desc), R.drawable.sinquerimfort));
    }
}
