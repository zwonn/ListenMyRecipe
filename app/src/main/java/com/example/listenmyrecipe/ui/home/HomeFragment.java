package com.example.listenmyrecipe.ui.home;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.listenmyrecipe.MainActivity;
import com.example.listenmyrecipe.R;
import com.example.listenmyrecipe.ui.gallery.GalleryFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ImageButton recipebutton;
    //private FragmentManager fragementManager;
    private GalleryFragment galleryFragment;
    FragmentManager fm;
    FragmentTransaction tran;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {

        galleryFragment = new GalleryFragment();
        //fragementManager = view.getSupportFragmentManager();
       // homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        View g = inflater.inflate(R.layout.fragment_gallery, container, false);

        recipebutton=  (ImageButton) root.findViewById(R.id.recipebutton);
        fm = getFragmentManager();
        tran = fm.beginTransaction();


        recipebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
              // activity.onFragmentChanged(0);
                Log.d("one","djid");
              activity.getSupportFragmentManager().beginTransaction().replace(R.id.con,galleryFragment).commit();
               // tran.replace(R.id.container, galleryFragment).commit();


            }
        });
        return root;
    }
}