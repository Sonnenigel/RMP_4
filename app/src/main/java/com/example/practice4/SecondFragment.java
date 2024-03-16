package com.example.practice4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.practice4.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private ArrayList<Velociraptor> velociraptors = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentSecondBinding binding = FragmentSecondBinding.inflate(getLayoutInflater());
        downloadData();
        AdapterListView adapter = new AdapterListView(getContext(), R.layout.item, velociraptors);
        binding.listViewV.setAdapter(adapter);
        binding.listViewV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), velociraptors.get(position).toString(), Toast.LENGTH_SHORT).show();
                Log.i("VOnClick", "Вы тыкнули на велоцираптора");
            }
        });
        return binding.getRoot();
    }
    public void downloadData(){
        for (int i = 1; i <= 200; ++i)
            velociraptors.add(new Velociraptor("Велоцираптор номер: " + i));
    }
}
