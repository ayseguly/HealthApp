package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.health.ClockPackage.Clock2;
import com.example.health.ClockPackage.Clock3;
import com.example.health.ClockPackage.Clock4;
import com.example.health.ClockPackage.Clock5;
import com.example.health.ClockPackage.Clock6;
import com.example.health.ClockPackage.Clock7;
import com.example.health.ClockPackage.Clock8;
import com.example.health.ClockPackage.Clock9;
import com.example.health.FindingTestPackage.Findinglv2;

public class drawClock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_clock);
    }

    public void clockBack(View view){
        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();
    }

    public void Next1(View view) {
        Spinner saat1 = (Spinner) findViewById(R.id.saat1);
        Spinner dakika1 = (Spinner) findViewById(R.id.dakika1);

        String saat = saat1.getSelectedItem().toString();
        String dakika = dakika1.getSelectedItem().toString();
        if (saat.equals("01") && dakika.equals("30")) {
            Functions Question1 = new Functions();
            Question1.VeriGonder("Clock Question 1", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question1.FragmentDegistirClock(fragmentManager, Clock2.class);
        } else {
            Functions Question1 = new Functions();
            Question1.VeriGonder("Clock Question 1", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question1.FragmentDegistirClock(fragmentManager, Clock2.class);

        }


    }

    public void Next2(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat2);
        Spinner dakika = (Spinner) findViewById(R.id.dakika2);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("12") && alinandakika.equals("15")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 2", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock3.class);
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 2", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock3.class);
        }

    }

    public void Next3(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat3);
        Spinner dakika = (Spinner) findViewById(R.id.dakika3);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("22") && alinandakika.equals("55")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 3", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock4.class);
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 3", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock4.class);
        }

    }
    public void Next4(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat4);
        Spinner dakika = (Spinner) findViewById(R.id.dakika4);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("19") && alinandakika.equals("20")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 4", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock5.class);
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 4", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock5.class);
        }

    }
    public void Next5(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat5);
        Spinner dakika = (Spinner) findViewById(R.id.dakika5);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("01") && alinandakika.equals("05")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 5", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock6.class);
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 5", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock6.class);
        }

    }
    public void Next6(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat6);
        Spinner dakika = (Spinner) findViewById(R.id.dakika6);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("09") && alinandakika.equals("35")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 6", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock7.class);
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 6", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock7.class);
        }

    }
    public void Next7(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat7);
        Spinner dakika = (Spinner) findViewById(R.id.dakika7);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("21") && alinandakika.equals("35")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 7", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock8.class);
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 7", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock8.class);
        }

    }

    public void Next8(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat8);
        Spinner dakika = (Spinner) findViewById(R.id.dakika8);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("17") && alinandakika.equals("05")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 8", 1);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock9.class);
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 8", 0);

            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirClock(fragmentManager, Clock9.class);
        }

    }
    public void Next9(View view) {
        Spinner saat = (Spinner) findViewById(R.id.saat9);
        Spinner dakika = (Spinner) findViewById(R.id.dakika9);

        String alinansaat = saat.getSelectedItem().toString();
        String alinandakika = dakika.getSelectedItem().toString();
        if (alinansaat.equals("10") && alinandakika.equals("00")) {
            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 9", 1);

            Intent intent = new Intent(getApplicationContext(), menuscreen.class);
            startActivity(intent);
            finish();
        } else {

            Functions Question = new Functions();
            Question.VeriGonder("Clock Question 9", 0);

            Intent intent = new Intent(getApplicationContext(), menuscreen.class);
            startActivity(intent);
            finish();
        }

    }

}

