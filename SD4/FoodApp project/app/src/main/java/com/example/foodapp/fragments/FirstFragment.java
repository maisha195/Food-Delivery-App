package com.example.foodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;
import com.example.foodapp.adapters.FeaturedAdapter;
import com.example.foodapp.adapters.FeaturedVerAdapter;
import com.example.foodapp.models.FeaturedModel;
import com.example.foodapp.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {

//////////////////Featured Hor Recyclerview
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;


    //////////////////Featured Hor Recyclerview

    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);




        //////////////////Featured Hor Recyclerview

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelList = new ArrayList<>();

        featuredModelList.add(new FeaturedModel(R.drawable.fav1,"Featured 1","Description 1"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav2,"Featured 2","Description 2"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav3,"Featured 3","Description 3"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);


        //////////////////Featured ver Recyclerview

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Feature 1","Description 1","4.0","10:00am - 10:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver2,"Feature 2","Description 2","4.0","10:00am - 10:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver3,"Feature 3","Description 3","4.0","10:00am - 10:00pm"));
        
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Feature 1","Description 1","4.0","10:00am - 10:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver2,"Feature 2","Description 2","4.0","10:00am - 10:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver3,"Feature 3","Description 3","4.0","10:00am - 10:00pm"));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}