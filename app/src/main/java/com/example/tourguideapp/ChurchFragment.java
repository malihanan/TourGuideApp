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

public class ChurchFragment extends Fragment {

    ArrayList<Location> locations;

    ChurchFragment() {}

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
        locations.add(new Location(getString(R.string.basilica_of_bom_jesus), getString(R.string.basilica_of_bom_jesus_desc)));
        locations.add(new Location(getString(R.string.se_cathedral), getString(R.string.se_cathedral_desc)));
        locations.add(new Location(getString(R.string.our_lady_of_the_immaculate_conception), getString(R.string.our_lady_of_the_immaculate_conception_desc)));
        locations.add(new Location(getString(R.string.our_lady_of_grace), getString(R.string.our_lady_of_grace_desc)));
        locations.add(new Location(getString(R.string.st_andrews), getString(R.string.st_andrews_desc)));
    }
}
