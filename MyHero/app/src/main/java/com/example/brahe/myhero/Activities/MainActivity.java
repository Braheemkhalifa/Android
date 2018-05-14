package com.example.brahe.myhero.Activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brahe.myhero.Fragments.HeroFragment;
import com.example.brahe.myhero.Fragments.MainFragment;
import com.example.brahe.myhero.Fragments.PickPowerFragment;
import com.example.brahe.myhero.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener ,PickPowerFragment.PickPowerInteractionListener , HeroFragment.HeroFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null){

            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment).commit();

        }
    }

    public  void  LoadPickPowerScreen(){


         PickPowerFragment pickPowerFragment = new PickPowerFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment ).addToBackStack(null).commit();

    }

    public void  LoadYourHero(){

        HeroFragment heroFragment = new HeroFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,heroFragment).addToBackStack(null).commit();

    }

    @Override
    public void onMainFragmentInteractionListener(Uri uri) {

    }

    @Override
    public void onPickPowerInteraction(Uri uri) {

    }

    @Override
    public void onHeroFragmentInteractionListener(Uri uri) {

    }
}