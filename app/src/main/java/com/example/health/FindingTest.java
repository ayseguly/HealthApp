package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.health.FindingTestPackage.Findinglv2;
import com.example.health.FindingTestPackage.Findinglv3;
import com.example.health.FindingTestPackage.Findinglv4;
import com.example.health.FindingTestPackage.Findinglv5;
import com.example.health.FindingTestPackage.Findinglv6;
import com.example.health.FindingTestPackage.Findinglv7;
import com.google.firebase.firestore.FirebaseFirestore;

public class FindingTest extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finding_test);


    }
    public void findingBack(View view){
        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();
    }

    public void Right1(View view){

        Functions Question1 = new Functions();
        Question1.VeriGonder("Finding Test Question 1", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question1.FragmentDegistir(fragmentManager, Findinglv2.class);

    }

    public void Left1(View view){

        Functions Question1 = new Functions();
        Question1.VeriGonder("Finding Test Question 1", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question1.FragmentDegistir(fragmentManager, Findinglv2.class);
    }

    public void Right2(View view){

        Functions Question2 = new Functions();
        Question2.VeriGonder("Finding Test Question 2", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question2.FragmentDegistir(fragmentManager, Findinglv3.class);

    }

    public void Left2(View view){

        Functions Question2 = new Functions();
        Question2.VeriGonder("Finding Test Question 2", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question2.FragmentDegistir(fragmentManager, Findinglv3.class);
    }


    public void Right3(View view){

        Functions Question3 = new Functions();
        Question3.VeriGonder("Finding Test Question 3", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question3.FragmentDegistir(fragmentManager, Findinglv4.class);

    }

    public void Left3(View view){

        Functions Question3 = new Functions();
        Question3.VeriGonder("Finding Test Question 3", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question3.FragmentDegistir(fragmentManager, Findinglv4.class);
    }


    public void Right4(View view){

        Functions Question4 = new Functions();
        Question4.VeriGonder("Finding Test Question 4", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question4.FragmentDegistir(fragmentManager, Findinglv5.class);
    }

    public void Left4(View view){

        Functions Question4 = new Functions();
        Question4.VeriGonder("Finding Test Question 4", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question4.FragmentDegistir(fragmentManager, Findinglv5.class);
    }

    public void Up5(View view){

        Functions Question5 = new Functions();
        Question5.VeriGonder("Finding Test Question 5", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question5.FragmentDegistir(fragmentManager, Findinglv6.class);
    }

    public void Under5(View view){

        Functions Question5 = new Functions();
        Question5.VeriGonder("Finding Test Question 5", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question5.FragmentDegistir(fragmentManager, Findinglv6.class);
    }

    public void Up6(View view){

        Functions Question6 = new Functions();
        Question6.VeriGonder("Finding Test Question 6", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question6.FragmentDegistir(fragmentManager, Findinglv7.class);
    }

    public void Under6(View view){

        Functions Question6 = new Functions();
        Question6.VeriGonder("Finding Test Question 6", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Question6.FragmentDegistir(fragmentManager, Findinglv7.class);
    }

    public void Up7(View view){

        Functions Question7 = new Functions();
        Question7.VeriGonder("Finding Test Question 7", 1);

        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();
    }

    public void Under7(View view){

        Functions Question7 = new Functions();
        Question7.VeriGonder("Finding Test Question 7", 0);

        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();
    }

}