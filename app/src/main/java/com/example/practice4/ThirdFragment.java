package com.example.practice4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.practice4.databinding.FragmentThirdBinding;

import java.util.ArrayList;
public class ThirdFragment extends Fragment implements SelectedItem{
    private ArrayList<Hadrosaurus> hadrosauruses = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentThirdBinding binding = FragmentThirdBinding.inflate(getLayoutInflater());
        downloadData();
        AdapterRecyclerView adapter = new AdapterRecyclerView(getContext(), hadrosauruses, this);
        binding.listViewG.setAdapter(adapter);
        return binding.getRoot();
    }
    public void downloadData(){
        for (int i = 1; i <= 200; ++i)
            hadrosauruses.add(new Hadrosaurus("Гадрозавр номер: " + i));
    }
    @Override
    public void onItemClicked(Hadrosaurus hadrosaurus) {
        Toast.makeText(getContext(), hadrosaurus.toString(), Toast.LENGTH_SHORT).show();
        Log.i("HOnClick", "Вы тыкнули на гадрозавра");
    }
}

