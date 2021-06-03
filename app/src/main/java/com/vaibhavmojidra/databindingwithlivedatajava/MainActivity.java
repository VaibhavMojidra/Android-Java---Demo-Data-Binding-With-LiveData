package com.vaibhavmojidra.databindingwithlivedatajava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.vaibhavmojidra.databindingwithlivedatajava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MyViewModel myViewModel;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
       myViewModel=new  ViewModelProvider(this).get(MyViewModel.class);
       binding.setMyvm(myViewModel);
       binding.setLifecycleOwner(this);
    }
}