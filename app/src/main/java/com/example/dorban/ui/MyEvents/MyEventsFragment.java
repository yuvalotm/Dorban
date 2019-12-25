package com.example.dorban.ui.MyEvents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dorban.R;

public class MyEventsFragment extends Fragment {

    private MyEventsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(MyEventsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_events, container, false);
        final TextView textView = root.findViewById(R.id.text_my_events);

        return root;
    }
}