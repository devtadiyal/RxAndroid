package com.example.reactiveprogramming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;

import io.reactivex.disposables.Disposable;

public class ObserverActivity extends AppCompatActivity {


    private static final String TAG = "ObserverActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        Observer<String> animalsObserver = getAnimalsObserver();




    }

    private Observer<String> getAnimalsObserver() {
        return new Observer<String>() {
            @Override
            public void onChanged(String s) {

                System.out.println("String "+s);
            }
        };
    }

}
