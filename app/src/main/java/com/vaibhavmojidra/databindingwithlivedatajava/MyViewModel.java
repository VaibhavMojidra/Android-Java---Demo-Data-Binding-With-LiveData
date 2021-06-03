package com.vaibhavmojidra.databindingwithlivedatajava;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public MutableLiveData text= new MutableLiveData<String>("");

    public void updateValue(CharSequence s, int start, int before, int count){
        this.text.setValue(s);
    }
}
