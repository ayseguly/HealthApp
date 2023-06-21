package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.health.FindingTestPackage.Findinglv2;
import com.example.health.MemoryGamePackage.Memorylv1;
import com.example.health.MemoryGamePackage.Memorylv10;
import com.example.health.MemoryGamePackage.Memorylv11;
import com.example.health.MemoryGamePackage.Memorylv12;
import com.example.health.MemoryGamePackage.Memorylv13;
import com.example.health.MemoryGamePackage.Memorylv14;
import com.example.health.MemoryGamePackage.Memorylv15;
import com.example.health.MemoryGamePackage.Memorylv16;
import com.example.health.MemoryGamePackage.Memorylv17;
import com.example.health.MemoryGamePackage.Memorylv18;
import com.example.health.MemoryGamePackage.Memorylv2;
import com.example.health.MemoryGamePackage.Memorylv3;
import com.example.health.MemoryGamePackage.Memorylv4;
import com.example.health.MemoryGamePackage.Memorylv5;
import com.example.health.MemoryGamePackage.Memorylv6;
import com.example.health.MemoryGamePackage.Memorylv7;
import com.example.health.MemoryGamePackage.Memorylv8;
import com.example.health.MemoryGamePackage.Memorylv9;

public class memory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
    }

    public void memoryBack(View view){
        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();
    }

    public void MemDcevap1(View view){
        Functions memQuestion1 = new Functions();
        memQuestion1.VeriGonder("Memory Game Question 1", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion1.FragmentDegistirmemory(fragmentManager, Memorylv2.class);

    }

    public void Memycevap1(View view){

        Functions memQuestion1 = new Functions();
        memQuestion1.VeriGonder("Memory Game Question 1", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion1.FragmentDegistirmemory(fragmentManager, Memorylv2.class);

    }

    public void MemContinue1(View view){

        ImageView MEMSoruim1 = findViewById(R.id.MEMSoruim1);
        ImageView MEMCevapim1 = findViewById(R.id.MEMCevapim1);
        ImageView MEMYCevapim1 = findViewById(R.id.MEMYCevapim1);
        Button memContinue1 = findViewById(R.id.MEMbuton1);

        TextView MEMSoru1 = findViewById(R.id.MEMSoru1);

        MEMSoruim1.setVisibility(View.INVISIBLE);
        MEMCevapim1.setVisibility(View.VISIBLE);
        MEMYCevapim1.setVisibility(View.VISIBLE);
        memContinue1.setVisibility(View.INVISIBLE);
        MEMSoru1.setText("Touch the image, which is exactly the same with the previous one.");
    }


    public void MemDcevap2(View view){
        Functions memQuestion2 = new Functions();
        memQuestion2.VeriGonder("Memory Game Question 2", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion2.FragmentDegistirmemory(fragmentManager, Memorylv3.class);

    }

    public void Memycevap2(View view){

        Functions memQuestion2 = new Functions();
        memQuestion2.VeriGonder("Memory Game Question 2", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion2.FragmentDegistirmemory(fragmentManager, Memorylv3.class);

    }

    public void MemContinue2(View view){

        ImageView MEMSoruim2 = findViewById(R.id.MEMSoruim2);
        ImageView MEMCevapim2 = findViewById(R.id.MEMCevapim2);
        ImageView MEMYCevapim2 = findViewById(R.id.MEMYCevapim2);
        Button memContinue2 = findViewById(R.id.MEMbuton2);

        TextView MEMSoru2 = findViewById(R.id.MEMSoru2);

        MEMSoruim2.setVisibility(View.INVISIBLE);
        MEMCevapim2.setVisibility(View.VISIBLE);
        MEMYCevapim2.setVisibility(View.VISIBLE);
        memContinue2.setVisibility(View.INVISIBLE);
        MEMSoru2.setText("Touch the image, which is exactly the same with the previous one.");
    }

    public void MemDcevap3(View view){
        Functions memQuestion3 = new Functions();
        memQuestion3.VeriGonder("Memory Game Question 3", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion3.FragmentDegistirmemory(fragmentManager, Memorylv4.class);

    }

    public void Memycevap3(View view){

        Functions memQuestion3 = new Functions();
        memQuestion3.VeriGonder("Memory Game Question 3", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion3.FragmentDegistirmemory(fragmentManager, Memorylv4.class);

    }

    public void MemContinue3(View view){

        ImageView MEMSoruim3 = findViewById(R.id.MEMSoruim3);
        ImageView MEMCevapim3 = findViewById(R.id.MEMCevapim3);
        ImageView MEMYCevapim3 = findViewById(R.id.MEMYCevapim3);
        Button memContinue3 = findViewById(R.id.MEMbuton3);

        TextView MEMSoru3 = findViewById(R.id.MEMSoru3);

        MEMSoruim3.setVisibility(View.INVISIBLE);
        MEMCevapim3.setVisibility(View.VISIBLE);
        MEMYCevapim3.setVisibility(View.VISIBLE);
        memContinue3.setVisibility(View.INVISIBLE);
        MEMSoru3.setText("Touch the image, which is exactly the same with the previous one.");

    }


    public void MemDcevap4(View view){
        Functions memQuestion4 = new Functions();
        memQuestion4.VeriGonder("Memory Game Question 4", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion4.FragmentDegistirmemory(fragmentManager, Memorylv5.class);

    }

    public void Memycevap4(View view){

        Functions memQuestion4 = new Functions();
        memQuestion4.VeriGonder("Memory Game Question 4", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion4.FragmentDegistirmemory(fragmentManager, Memorylv5.class);

    }

    public void MemContinue4(View view){

        ImageView MEMSoruim4 = findViewById(R.id.MEMSoruim4);
        ImageView MEMCevapim4 = findViewById(R.id.MEMCevapim4);
        ImageView MEMYCevapim4 = findViewById(R.id.MEMYCevapim4);
        Button memContinue4 = findViewById(R.id.MEMbuton4);

        TextView MEMSoru4 = findViewById(R.id.MEMSoru4);

        MEMSoruim4.setVisibility(View.INVISIBLE);
        MEMCevapim4.setVisibility(View.VISIBLE);
        MEMYCevapim4.setVisibility(View.VISIBLE);
        memContinue4.setVisibility(View.INVISIBLE);
        MEMSoru4.setText("Touch the image, which is exactly the same with the previous one.");

    }

    public void MemDcevap5(View view){
        Functions memQuestion5 = new Functions();
        memQuestion5.VeriGonder("Memory Game Question 5", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion5.FragmentDegistirmemory(fragmentManager, Memorylv6.class);

    }

    public void Memycevap5(View view){

        Functions memQuestion5 = new Functions();
        memQuestion5.VeriGonder("Memory Game Question 5", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion5.FragmentDegistirmemory(fragmentManager, Memorylv6.class);

    }

    public void MemContinue5(View view){

        ImageView MEMSoruim5 = findViewById(R.id.MEMSoruim5);
        ImageView MEMCevapim5 = findViewById(R.id.MEMCevapim5);
        ImageView MEMYCevapim5 = findViewById(R.id.MEMYCevapim5);
        Button memContinue5 = findViewById(R.id.MEMbuton5);

        TextView MEMSoru5 = findViewById(R.id.MEMSoru5);

        MEMSoruim5.setVisibility(View.INVISIBLE);
        MEMCevapim5.setVisibility(View.VISIBLE);
        MEMYCevapim5.setVisibility(View.VISIBLE);
        memContinue5.setVisibility(View.INVISIBLE);
        MEMSoru5.setText("Touch the image, which is exactly the same with the previous one.");

    }
    public void MemDcevap6(View view){
        Functions memQuestion6 = new Functions();
        memQuestion6.VeriGonder("Memory Game Question 6", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion6.FragmentDegistirmemory(fragmentManager, Memorylv7.class);

    }

    public void Memycevap6(View view){

        Functions memQuestion6 = new Functions();
        memQuestion6.VeriGonder("Memory Game Question 6", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion6.FragmentDegistirmemory(fragmentManager, Memorylv7.class);

    }

    public void MemContinue6(View view){

        ImageView MEMSoruim6 = findViewById(R.id.MEMSoruim6);
        ImageView MEMCevapim6 = findViewById(R.id.MEMCevapim6);
        ImageView MEMYCevapim6 = findViewById(R.id.MEMYCevapim6);
        Button memContinue6 = findViewById(R.id.MEMbuton6);
        TextView MEMSoru6 = findViewById(R.id.MEMSoru6);

        MEMSoruim6.setVisibility(View.INVISIBLE);
        MEMCevapim6.setVisibility(View.VISIBLE);
        MEMYCevapim6.setVisibility(View.VISIBLE);
        memContinue6.setVisibility(View.INVISIBLE);
        MEMSoru6.setText("Touch the image, which is exactly the same with the previous one.");

    }
    public void MemDcevap7(View view){
        Functions memQuestion7 = new Functions();
        memQuestion7.VeriGonder("Memory Game Question 7", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion7.FragmentDegistirmemory(fragmentManager, Memorylv8.class);

    }

    public void Memycevap7(View view){

        Functions memQuestion7 = new Functions();
        memQuestion7.VeriGonder("Memory Game Question 7", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion7.FragmentDegistirmemory(fragmentManager, Memorylv8.class);

    }

    public void MemContinue7(View view){

        ImageView MEMSoruim7 = findViewById(R.id.MEMSoruim7);
        ImageView MEMCevapim7 = findViewById(R.id.MEMCevapim7);
        ImageView MEMYCevapim7 = findViewById(R.id.MEMYCevapim7);
        Button memContinue7 = findViewById(R.id.MEMbuton7);
        TextView MEMSoru7 = findViewById(R.id.MEMSoru7);

        MEMSoruim7.setVisibility(View.INVISIBLE);
        MEMCevapim7.setVisibility(View.VISIBLE);
        MEMYCevapim7.setVisibility(View.VISIBLE);
        memContinue7.setVisibility(View.INVISIBLE);
        MEMSoru7.setText("Touch the image, which is exactly the same with the previous one.");

    }
    public void MemDcevap8(View view){
        Functions memQuestion8 = new Functions();
        memQuestion8.VeriGonder("Memory Game Question 8", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion8.FragmentDegistirmemory(fragmentManager, Memorylv9.class);

    }

    public void Memycevap8(View view){

        Functions memQuestion8 = new Functions();
        memQuestion8.VeriGonder("Memory Game Question 8", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion8.FragmentDegistirmemory(fragmentManager, Memorylv9.class);

    }

    public void MemContinue8(View view){

        ImageView MEMSoruim8 = findViewById(R.id.MEMSoruim8);
        ImageView MEMCevapim8 = findViewById(R.id.MEMCevapim8);
        ImageView MEMYCevapim8 = findViewById(R.id.MEMYCevapim8);
        Button memContinue8 = findViewById(R.id.MEMbuton8);
        TextView MEMSoru8 = findViewById(R.id.MEMSoru8);

        MEMSoruim8.setVisibility(View.INVISIBLE);
        MEMCevapim8.setVisibility(View.VISIBLE);
        MEMYCevapim8.setVisibility(View.VISIBLE);
        memContinue8.setVisibility(View.INVISIBLE);
        MEMSoru8.setText("Touch the image, which is exactly the same with the previous one.");

    }
    public void MemDcevap9(View view){
        Functions memQuestion9 = new Functions();
        memQuestion9.VeriGonder("Memory Game Question 9", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion9.FragmentDegistirmemory(fragmentManager, Memorylv10.class);

    }

    public void Memycevap9(View view){

        Functions memQuestion9 = new Functions();
        memQuestion9.VeriGonder("Memory Game Question 9", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion9.FragmentDegistirmemory(fragmentManager, Memorylv10.class);

    }

    public void MemContinue9(View view){

        ImageView MEMSoruim9= findViewById(R.id.MEMSoruim9);
        ImageView MEMCevapim9 = findViewById(R.id.MEMCevapim9);
        ImageView MEMYCevapim9 = findViewById(R.id.MEMYCevapim9);
        Button memContinue9 = findViewById(R.id.MEMbuton9);
        TextView MEMSoru9 = findViewById(R.id.MEMSoru9);

        MEMSoruim9.setVisibility(View.INVISIBLE);
        MEMCevapim9.setVisibility(View.VISIBLE);
        MEMYCevapim9.setVisibility(View.VISIBLE);
        memContinue9.setVisibility(View.INVISIBLE);
        MEMSoru9.setText("Touch the image, which is exactly the same with the previous one.");

    }

    public void MemDcevap10(View view){
        Functions memQuestion10 = new Functions();
        memQuestion10.VeriGonder("Memory Game Question 10", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion10.FragmentDegistirmemory(fragmentManager, Memorylv11.class);

    }

    public void Memycevap10(View view){

        Functions memQuestion10 = new Functions();
        memQuestion10.VeriGonder("Memory Game Question 10", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion10.FragmentDegistirmemory(fragmentManager, Memorylv11.class);

    }

    public void MemContinue10(View view){

        ImageView MEMSoruim10 = findViewById(R.id.MEMSoruim10);
        ImageView MEMCevapim10 = findViewById(R.id.MEMCevapim10);
        ImageView MEMYCevapim10 = findViewById(R.id.MEMYCevapim10);
        Button memContinue10 = findViewById(R.id.MEMbuton10);

        TextView MEMSoru10 = findViewById(R.id.MEMSoru10);

        MEMSoruim10.setVisibility(View.INVISIBLE);
        MEMCevapim10.setVisibility(View.VISIBLE);
        MEMYCevapim10.setVisibility(View.VISIBLE);
        memContinue10.setVisibility(View.INVISIBLE);
        MEMSoru10.setText("Touch the image, which is exactly the same with the previous one.");
    }
    public void MemDcevap11(View view){
        Functions memQuestion11 = new Functions();
        memQuestion11.VeriGonder("Memory Game Question 11", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion11.FragmentDegistirmemory(fragmentManager, Memorylv12.class);

    }

    public void Memycevap11(View view){

        Functions memQuestion11= new Functions();
        memQuestion11.VeriGonder("Memory Game Question 11", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion11.FragmentDegistirmemory(fragmentManager, Memorylv12.class);

    }

    public void MemContinue11(View view){

        ImageView MEMSoruim11 = findViewById(R.id.MEMSoruim11);
        ImageView MEMCevapim11 = findViewById(R.id.MEMCevapim11);
        ImageView MEMYCevapim11 = findViewById(R.id.MEMYCevapim11);
        Button memContinue11 = findViewById(R.id.MEMbuton11);

        TextView MEMSoru11 = findViewById(R.id.MEMSoru11);

        MEMSoruim11.setVisibility(View.INVISIBLE);
        MEMCevapim11.setVisibility(View.VISIBLE);
        MEMYCevapim11.setVisibility(View.VISIBLE);
        memContinue11.setVisibility(View.INVISIBLE);
        MEMSoru11.setText("Touch the image, which is exactly the same with the previous one.");
    }
    public void MemDcevap12(View view){
        Functions memQuestion12 = new Functions();
        memQuestion12.VeriGonder("Memory Game Question 12", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion12.FragmentDegistirmemory(fragmentManager, Memorylv13.class);

    }

    public void Memycevap12(View view){

        Functions memQuestion12 = new Functions();
        memQuestion12.VeriGonder("Memory Game Question 12", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion12.FragmentDegistirmemory(fragmentManager, Memorylv13.class);

    }

    public void MemContinue12(View view){

        ImageView MEMSoruim12 = findViewById(R.id.MEMSoruim12);
        ImageView MEMCevapim12 = findViewById(R.id.MEMCevapim12);
        ImageView MEMYCevapim12 = findViewById(R.id.MEMYCevapim12);
        Button memContinue12 = findViewById(R.id.MEMbuton12);

        TextView MEMSoru12 = findViewById(R.id.MEMSoru12);

        MEMSoruim12.setVisibility(View.INVISIBLE);
        MEMCevapim12.setVisibility(View.VISIBLE);
        MEMYCevapim12.setVisibility(View.VISIBLE);
        memContinue12.setVisibility(View.INVISIBLE);
        MEMSoru12.setText("Touch the image, which is exactly the same with the previous one.");
    }

    public void MemDcevap13(View view){
        Functions memQuestion13 = new Functions();
        memQuestion13.VeriGonder("Memory Game Question 13", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion13.FragmentDegistirmemory(fragmentManager, Memorylv14.class);

    }

    public void Memycevap13(View view){

        Functions memQuestion13 = new Functions();
        memQuestion13.VeriGonder("Memory Game Question 13", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion13.FragmentDegistirmemory(fragmentManager, Memorylv14.class);

    }

    public void MemContinue13(View view){

        ImageView MEMSoruim13 = findViewById(R.id.MEMSoruim13);
        ImageView MEMCevapim13= findViewById(R.id.MEMCevapim13);
        ImageView MEMYCevapim13 = findViewById(R.id.MEMYCevapim13);
        Button memContinue13 = findViewById(R.id.MEMbuton13);

        TextView MEMSoru13 = findViewById(R.id.MEMSoru13);

        MEMSoruim13.setVisibility(View.INVISIBLE);
        MEMCevapim13.setVisibility(View.VISIBLE);
        MEMYCevapim13.setVisibility(View.VISIBLE);
        memContinue13.setVisibility(View.INVISIBLE);
        MEMSoru13.setText("Touch the image, which is exactly the same with the previous one.");
    }
    public void MemDcevap14(View view){
        Functions memQuestion14 = new Functions();
        memQuestion14.VeriGonder("Memory Game Question 14", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion14.FragmentDegistirmemory(fragmentManager, Memorylv15.class);

    }

    public void Memycevap14(View view){

        Functions memQuestion14 = new Functions();
        memQuestion14.VeriGonder("Memory Game Question 14", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion14.FragmentDegistirmemory(fragmentManager, Memorylv15.class);

    }

    public void MemContinue14(View view){

        ImageView MEMSoruim14 = findViewById(R.id.MEMSoruim14);
        ImageView MEMCevapim14 = findViewById(R.id.MEMCevapim14);
        ImageView MEMYCevapim14 = findViewById(R.id.MEMYCevapim14);
        Button memContinue14 = findViewById(R.id.MEMbuton14);

        TextView MEMSoru14 = findViewById(R.id.MEMSoru14);

        MEMSoruim14.setVisibility(View.INVISIBLE);
        MEMCevapim14.setVisibility(View.VISIBLE);
        MEMYCevapim14.setVisibility(View.VISIBLE);
        memContinue14.setVisibility(View.INVISIBLE);
        MEMSoru14.setText("Touch the image, which is exactly the same with the previous one.");
    }
    public void MemDcevap15(View view){
        Functions memQuestion15 = new Functions();
        memQuestion15.VeriGonder("Memory Game Question 15", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion15.FragmentDegistirmemory(fragmentManager, Memorylv16.class);

    }
    public void Memycevap15(View view){

        Functions memQuestion15 = new Functions();
        memQuestion15.VeriGonder("Memory Game Question 15", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion15.FragmentDegistirmemory(fragmentManager, Memorylv16.class);

    }

    public void MemContinue15(View view){

        ImageView MEMSoruim15 = findViewById(R.id.MEMSoruim15);
        ImageView MEMCevapim15 = findViewById(R.id.MEMCevapim15);
        ImageView MEMYCevapim15 = findViewById(R.id.MEMYCevapim15);
        Button memContinue15 = findViewById(R.id.MEMbuton15);

        TextView MEMSoru15 = findViewById(R.id.MEMSoru15);

        MEMSoruim15.setVisibility(View.INVISIBLE);
        MEMCevapim15.setVisibility(View.VISIBLE);
        MEMYCevapim15.setVisibility(View.VISIBLE);
        memContinue15.setVisibility(View.INVISIBLE);
        MEMSoru15.setText("Touch the image, which is exactly the same with the previous one.");
    }
    public void MemDcevap16(View view){
        Functions memQuestion16 = new Functions();
        memQuestion16.VeriGonder("Memory Game Question 16", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion16.FragmentDegistirmemory(fragmentManager, Memorylv17.class);

    }
    public void Memycevap16(View view){

        Functions memQuestion16 = new Functions();
        memQuestion16.VeriGonder("Memory Game Question 16", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion16.FragmentDegistirmemory(fragmentManager, Memorylv17.class);

    }

    public void MemContinue16(View view){

        ImageView MEMSoruim16 = findViewById(R.id.MEMSoruim16);
        ImageView MEMCevapim16 = findViewById(R.id.MEMCevapim16);
        ImageView MEMYCevapim16 = findViewById(R.id.MEMYCevapim16);
        Button memContinue16 = findViewById(R.id.MEMbuton16);

        TextView MEMSoru16 = findViewById(R.id.MEMSoru16);

        MEMSoruim16.setVisibility(View.INVISIBLE);
        MEMCevapim16.setVisibility(View.VISIBLE);
        MEMYCevapim16.setVisibility(View.VISIBLE);
        memContinue16.setVisibility(View.INVISIBLE);
        MEMSoru16.setText("Touch the image, which is exactly the same with the previous one.");
    }
    public void MemDcevap17(View view){
        Functions memQuestion17 = new Functions();
        memQuestion17.VeriGonder("Memory Game Question 17", 1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion17.FragmentDegistirmemory(fragmentManager, Memorylv18.class);

    }

    public void Memycevap17(View view){

        Functions memQuestion17 = new Functions();
        memQuestion17.VeriGonder("Memory Game Question 17", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        memQuestion17.FragmentDegistirmemory(fragmentManager, Memorylv18.class);

    }

    public void MemContinue17(View view){

        ImageView MEMSoruim17 = findViewById(R.id.MEMSoruim17);
        ImageView MEMCevapim17 = findViewById(R.id.MEMCevapim17);
        ImageView MEMYCevapim17 = findViewById(R.id.MEMYCevapim17);
        Button memContinue17 = findViewById(R.id.MEMbuton17);

        TextView MEMSoru17 = findViewById(R.id.MEMSoru17);

        MEMSoruim17.setVisibility(View.INVISIBLE);
        MEMCevapim17.setVisibility(View.VISIBLE);
        MEMYCevapim17.setVisibility(View.VISIBLE);
        memContinue17.setVisibility(View.INVISIBLE);
        MEMSoru17.setText("Touch the image, which is exactly the same with the previous one.");
    }
    public void MemDcevap18(View view){
        Functions memQuestion18= new Functions();
        memQuestion18.VeriGonder("Memory Game Question 18", 1);

        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();

    }

    public void Memycevap18(View view){

        Functions memQuestion18 = new Functions();
        memQuestion18.VeriGonder("Memory Game Question 18", 0);

        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();

    }

    public void MemContinue18(View view){

        ImageView MEMSoruim18 = findViewById(R.id.MEMSoruim18);
        ImageView MEMCevapim18 = findViewById(R.id.MEMCevapim18);
        ImageView MEMYCevapim18 = findViewById(R.id.MEMYCevapim18);
        Button memContinue18 = findViewById(R.id.MEMbuton18);

        TextView MEMSoru18 = findViewById(R.id.MEMSoru18);

        MEMSoruim18.setVisibility(View.INVISIBLE);
        MEMCevapim18.setVisibility(View.VISIBLE);
        MEMYCevapim18.setVisibility(View.VISIBLE);
        memContinue18.setVisibility(View.INVISIBLE);
        MEMSoru18.setText("Touch the image, which is exactly the same with the previous one.");
    }

}