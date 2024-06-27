package com.example.reservasiapk.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.reservasiapk.R;
import com.example.reservasiapk.ui.DataResto;
import com.example.reservasiapk.RestaurantAdapter;
import com.example.reservasiapk.databinding.FragmentHomeBinding;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private RecyclerView recyclerView;
    private RestaurantAdapter restaurantAdapter;
    private List<DataResto> restaurantList;
    Button pindah;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Initialize RecyclerView
        recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        // Add sample data
        restaurantList = new ArrayList<>();
        restaurantList.add(new DataResto(R.drawable.meatguy,"meatguy"));
        restaurantList.add(new DataResto(R.drawable.sushitei, "SushiTei"));
        restaurantList.add(new DataResto(R.drawable.omakase, "OmniLounge"));
        restaurantList.add(new DataResto(R.drawable.mastros, "mastroy"));

        // Set Adapter
        restaurantAdapter = new RestaurantAdapter(restaurantList);
        recyclerView.setAdapter(restaurantAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }
}