package com.example.reservasiapk.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.reservasiapk.R;
import com.example.reservasiapk.databinding.FragmentProfileBinding;
import com.example.reservasiapk.ui.profile.ProfileViewModel;

public class ProfileFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, null);
    }

}