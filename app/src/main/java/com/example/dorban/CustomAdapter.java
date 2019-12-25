package com.example.dorban;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dorban.ui.AllEvents.AllEventsFragment;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<Event> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewNumOfVolunteer;
        TextView textViewMaxVolunteer;
        TextView textViewLocation;
        TextView textViewDuration;
        TextView textViewDate;
        TextView textViewInfo;
        TextView textViewPhone;
        TextView textViewContactName;
        TextView textViewEventName;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewNumOfVolunteer =  itemView.findViewById(R.id.text_view_num_of_volunteers);
            this.textViewMaxVolunteer =  itemView.findViewById(R.id.text_view_max_volunteers);
            this.textViewLocation =  itemView.findViewById(R.id.text_view_location);
            this.textViewDuration =  itemView.findViewById(R.id.text_view_duration);
            this.textViewDate =  itemView.findViewById(R.id.text_view_date);
            this.textViewInfo = itemView.findViewById(R.id.text_view_info);
            this.textViewPhone = itemView.findViewById(R.id.text_view_phone_number);
            this.textViewContactName = itemView.findViewById(R.id.text_view_contact_name);
            this.textViewEventName = itemView.findViewById(R.id.text_view_event_name);
        }
    }

    public CustomAdapter(ArrayList<Event> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card, parent, false);
        view.setOnClickListener(AllEventsFragment.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewDate = holder.textViewDate;
        TextView textViewDuration = holder.textViewDuration;
        TextView textViewLocation = holder.textViewLocation;
        TextView textViewMaxVolunteer = holder.textViewMaxVolunteer;
        TextView textViewNumOfVolunteer = holder.textViewNumOfVolunteer;
        TextView textViewInfo = holder.textViewInfo;
        TextView textViewPhone = holder.textViewPhone;
        TextView textViewEventName = holder.textViewEventName;
        TextView textViewContactName = holder.textViewContactName;


        textViewDate.setText(dataSet.get(listPosition).getDate());
        textViewDuration.setText(dataSet.get(listPosition).getDuration() + "");
        textViewLocation.setText(dataSet.get(listPosition).getLocation());
        textViewMaxVolunteer.setText(dataSet.get(listPosition).getNumberOfMaxUsers() + "");
        textViewNumOfVolunteer.setText(dataSet.get(listPosition).getNumberOfCurrentUsers() + "");
        textViewInfo.setText(dataSet.get(listPosition).getInfo());
        textViewPhone.setText(dataSet.get(listPosition).getContactPhoneNumber());
        textViewEventName.setText(dataSet.get(listPosition).getNameEvent());
        textViewContactName.setText(dataSet.get(listPosition).getContactName());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}