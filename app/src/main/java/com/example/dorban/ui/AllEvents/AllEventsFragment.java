package com.example.dorban.ui.AllEvents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dorban.CustomAdapter;
import com.example.dorban.Event;
import com.example.dorban.MyData;
import com.example.dorban.R;
import com.example.dorban.SearchActivity;

import java.util.ArrayList;

public class AllEventsFragment extends Fragment {

    private AllEventsViewModel homeViewModel;
    private RecyclerView recyclerView;

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static ArrayList<Event> data;
    public static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = ViewModelProviders.of(this).get(AllEventsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_all_events, container, false);
        final CardView searchCardView = root.findViewById(R.id.search_card_view);
        searchCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SearchActivity.class);
                startActivity(intent);
            }
        });
        recyclerView = root.findViewById(R.id.card_list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<Event>();
        for (int i = 0; i < MyData.maxVolunteer.length; i++) {
            data.add(new Event(0,MyData.dates[i],MyData.durations[i],
                            MyData.currentVolunteers[i], MyData.maxVolunteer[i],
                    "", MyData.locations[i], MyData.phones[i], MyData.contactNames[i]
            ));
        }

        removedItems = new ArrayList<Integer>();

        adapter = new CustomAdapter(data);
        recyclerView.setAdapter(adapter);

        return root;
    }



}