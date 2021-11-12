package com.discitex.nurtaniomobile.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.discitex.nurtaniomobile.InfoSplash2Activity;
import com.discitex.nurtaniomobile.InfoSplash3Activity;
import com.discitex.nurtaniomobile.LoginActivity;
import com.discitex.nurtaniomobile.R;
import com.discitex.nurtaniomobile.ViewActivity;
import com.discitex.nurtaniomobile.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }
}