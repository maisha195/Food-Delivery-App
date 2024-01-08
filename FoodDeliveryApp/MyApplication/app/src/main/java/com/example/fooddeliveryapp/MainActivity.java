package com.example.fooddeliveryapp;

import static com.example.fooddeliveryapp.R.id.orders;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fooddeliveryapp.Adapters.MainAdapter;
import com.example.fooddeliveryapp.Models.MainModel;
import com.example.fooddeliveryapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger2,"Juicy Burger","50","Juicy, big, loaded with toppings of my choice"));
        list.add(new MainModel(R.drawable.burger3,"Fat Burger","0","High quality chicken medium to well with cheese  on a multigrain bun."));
        list.add(new MainModel(R.drawable.pizza1,"Neapolitan pizza","5","A classic Italian pizza with thin crust, fresh tomato sauce, and mozzarella cheese"));
        list.add(new MainModel(R.drawable.pizza3,"Deep dish pizza","10","a thick, hearty pizza with a deep dish crust and gooey cheese."));
        list.add(new MainModel(R.drawable.fries3,"French fries","20","crispy on the outside, soft and fluffy on the inside"));
        list.add(new MainModel(R.drawable.fries4,"Steak fries","10","thick and chunky, with a crispy exterior and a soft interior."));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


  /*   @Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this, OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/
}