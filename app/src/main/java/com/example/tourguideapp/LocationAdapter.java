package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {

    TextView locationNameTextView;
    TextView locationDescriptionTextView;
    ImageView locationImageView;

    public LocationAdapter(@NonNull Context context, @NonNull ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Location currentLocation = getItem(position);
        locationNameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        locationDescriptionTextView = (TextView) listItemView.findViewById(R.id.location_desc);
        locationImageView = (ImageView) listItemView.findViewById(R.id.image);
        locationNameTextView.setText(currentLocation.getName());
        locationDescriptionTextView.setText(currentLocation.getDescription());
        if (currentLocation.hasImage()) {
            locationImageView.setImageResource(currentLocation.getImageResourceId());
            locationImageView.setVisibility(View.VISIBLE);
        } else {
            locationImageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
