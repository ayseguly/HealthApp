package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.health.SudokuPackage.Sudokulv2;
import com.example.health.SudokuPackage.Sudokulv3;
import com.example.health.SudokuPackage.Sudokulv4;
import com.example.health.SudokuPackage.Sudokulv5;
import com.example.health.SudokuPackage.Sudokulv6;
import com.example.health.SudokuPackage.Sudokulv7;
import com.example.health.SudokuPackage.Sudokulv8;

public class playSudoku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
    }

    public void sudokuBack(View view){
        Intent intent = new Intent(getApplicationContext(), menuscreen.class);
        startActivity(intent);
        finish();
    }

    public void sudokudevam1(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku1lv11);
        EditText sudoku12 = findViewById(R.id.sudoku1lv12);
        EditText sudoku13 = findViewById(R.id.sudoku1lv13);
        EditText sudoku14 = findViewById(R.id.sudoku1lv14);
        EditText sudoku21 = findViewById(R.id.sudoku1lv21);
        EditText sudoku22 = findViewById(R.id.sudoku1lv22);
        EditText sudoku23 = findViewById(R.id.sudoku1lv23);
        EditText sudoku24 = findViewById(R.id.sudoku1lv24);
        EditText sudoku31 = findViewById(R.id.sudoku1lv31);
        EditText sudoku32 = findViewById(R.id.sudoku1lv32);
        EditText sudoku33 = findViewById(R.id.sudoku1lv33);
        EditText sudoku34 = findViewById(R.id.sudoku1lv34);
        EditText sudoku41 = findViewById(R.id.sudoku1lv41);
        EditText sudoku42 = findViewById(R.id.sudoku1lv42);
        EditText sudoku43 = findViewById(R.id.sudoku1lv43);
        EditText sudoku44 = findViewById(R.id.sudoku1lv44);

        if (sudoku11.getText().toString().equals("2") && sudoku12.getText().toString().equals("3") && sudoku13.getText().toString().equals("1") && sudoku14.getText().toString().equals("4")
                && sudoku21.getText().toString().equals("4") && sudoku22.getText().toString().equals("1") && sudoku23.getText().toString().equals("3") && sudoku24.getText().toString().equals("2")
                && sudoku31.getText().toString().equals("1") && sudoku32.getText().toString().equals("2") && sudoku33.getText().toString().equals("4") && sudoku34.getText().toString().equals("3")
                && sudoku41.getText().toString().equals("3") && sudoku42.getText().toString().equals("4") && sudoku43.getText().toString().equals("2") && sudoku44.getText().toString().equals("1")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 1", 1);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv2.class);


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 1", 0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv2.class);

        }
    }
    public void sudokudevam2(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku2lv11);
        EditText sudoku12 = findViewById(R.id.sudoku2lv12);
        EditText sudoku13 = findViewById(R.id.sudoku2lv13);
        EditText sudoku14 = findViewById(R.id.sudoku2lv14);
        EditText sudoku21 = findViewById(R.id.sudoku2lv21);
        EditText sudoku22 = findViewById(R.id.sudoku2lv22);
        EditText sudoku23 = findViewById(R.id.sudoku2lv23);
        EditText sudoku24 = findViewById(R.id.sudoku2lv24);
        EditText sudoku31 = findViewById(R.id.sudoku2lv31);
        EditText sudoku32 = findViewById(R.id.sudoku2lv32);
        EditText sudoku33 = findViewById(R.id.sudoku2lv33);
        EditText sudoku34 = findViewById(R.id.sudoku2lv34);
        EditText sudoku41 = findViewById(R.id.sudoku2lv41);
        EditText sudoku42 = findViewById(R.id.sudoku2lv42);
        EditText sudoku43 = findViewById(R.id.sudoku2lv43);
        EditText sudoku44 = findViewById(R.id.sudoku2lv44);

        if (sudoku11.getText().toString().equals("4") && sudoku12.getText().toString().equals("1") && sudoku13.getText().toString().equals("3") && sudoku14.getText().toString().equals("2")
                && sudoku21.getText().toString().equals("3") && sudoku22.getText().toString().equals("2") && sudoku23.getText().toString().equals("4") && sudoku24.getText().toString().equals("1")
                && sudoku31.getText().toString().equals("1") && sudoku32.getText().toString().equals("3") && sudoku33.getText().toString().equals("2") && sudoku34.getText().toString().equals("4")
                && sudoku41.getText().toString().equals("2") && sudoku42.getText().toString().equals("4") && sudoku43.getText().toString().equals("1") && sudoku44.getText().toString().equals("3")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 2", 1);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv3.class);


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 2", 0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv3.class);

        }
    }
    public void sudokudevam3(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku3lv11);
        EditText sudoku12 = findViewById(R.id.sudoku3lv12);
        EditText sudoku13 = findViewById(R.id.sudoku3lv13);
        EditText sudoku14 = findViewById(R.id.sudoku3lv14);
        EditText sudoku21 = findViewById(R.id.sudoku3lv21);
        EditText sudoku22 = findViewById(R.id.sudoku3lv22);
        EditText sudoku23 = findViewById(R.id.sudoku3lv23);
        EditText sudoku24 = findViewById(R.id.sudoku3lv24);
        EditText sudoku31 = findViewById(R.id.sudoku3lv31);
        EditText sudoku32 = findViewById(R.id.sudoku3lv32);
        EditText sudoku33 = findViewById(R.id.sudoku3lv33);
        EditText sudoku34 = findViewById(R.id.sudoku3lv34);
        EditText sudoku41 = findViewById(R.id.sudoku3lv41);
        EditText sudoku42 = findViewById(R.id.sudoku3lv42);
        EditText sudoku43 = findViewById(R.id.sudoku3lv43);
        EditText sudoku44 = findViewById(R.id.sudoku3lv44);

        if (sudoku11.getText().toString().equals("3") && sudoku12.getText().toString().equals("4") && sudoku13.getText().toString().equals("2") && sudoku14.getText().toString().equals("1")
                && sudoku21.getText().toString().equals("1") && sudoku22.getText().toString().equals("2") && sudoku23.getText().toString().equals("4") && sudoku24.getText().toString().equals("2")
                && sudoku31.getText().toString().equals("2") && sudoku32.getText().toString().equals("3") && sudoku33.getText().toString().equals("1") && sudoku34.getText().toString().equals("4")
                && sudoku41.getText().toString().equals("4") && sudoku42.getText().toString().equals("1") && sudoku43.getText().toString().equals("3") && sudoku44.getText().toString().equals("2")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 3", 1);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv4.class);


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 3", 0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv4.class);

        }
    }
    public void sudokudevam4(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku4lv11);
        EditText sudoku12 = findViewById(R.id.sudoku4lv12);
        EditText sudoku13 = findViewById(R.id.sudoku4lv13);
        EditText sudoku14 = findViewById(R.id.sudoku4lv14);
        EditText sudoku21 = findViewById(R.id.sudoku4lv21);
        EditText sudoku22 = findViewById(R.id.sudoku4lv22);
        EditText sudoku23 = findViewById(R.id.sudoku4lv23);
        EditText sudoku24 = findViewById(R.id.sudoku4lv24);
        EditText sudoku31 = findViewById(R.id.sudoku4lv31);
        EditText sudoku32 = findViewById(R.id.sudoku4lv32);
        EditText sudoku33 = findViewById(R.id.sudoku4lv33);
        EditText sudoku34 = findViewById(R.id.sudoku4lv34);
        EditText sudoku41 = findViewById(R.id.sudoku4lv41);
        EditText sudoku42 = findViewById(R.id.sudoku4lv42);
        EditText sudoku43 = findViewById(R.id.sudoku4lv43);
        EditText sudoku44 = findViewById(R.id.sudoku4lv44);

        if (sudoku11.getText().toString().equals("2") && sudoku12.getText().toString().equals("4") && sudoku13.getText().toString().equals("1") && sudoku14.getText().toString().equals("3")
                && sudoku21.getText().toString().equals("3") && sudoku22.getText().toString().equals("1") && sudoku23.getText().toString().equals("2") && sudoku24.getText().toString().equals("4")
                && sudoku31.getText().toString().equals("1") && sudoku32.getText().toString().equals("3") && sudoku33.getText().toString().equals("4") && sudoku34.getText().toString().equals("2")
                && sudoku41.getText().toString().equals("4") && sudoku42.getText().toString().equals("2") && sudoku43.getText().toString().equals("3") && sudoku44.getText().toString().equals("1")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 4", 1);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv5.class);


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 4", 0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv5.class);

        }
    }
    public void sudokudevam5(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku5lv11);
        EditText sudoku12 = findViewById(R.id.sudoku5lv12);
        EditText sudoku13 = findViewById(R.id.sudoku5lv13);
        EditText sudoku14 = findViewById(R.id.sudoku5lv14);
        EditText sudoku21 = findViewById(R.id.sudoku5lv21);
        EditText sudoku22 = findViewById(R.id.sudoku5lv22);
        EditText sudoku23 = findViewById(R.id.sudoku5lv23);
        EditText sudoku24 = findViewById(R.id.sudoku5lv24);
        EditText sudoku31 = findViewById(R.id.sudoku5lv31);
        EditText sudoku32 = findViewById(R.id.sudoku5lv32);
        EditText sudoku33 = findViewById(R.id.sudoku5lv33);
        EditText sudoku34 = findViewById(R.id.sudoku5lv34);
        EditText sudoku41 = findViewById(R.id.sudoku5lv41);
        EditText sudoku42 = findViewById(R.id.sudoku5lv42);
        EditText sudoku43 = findViewById(R.id.sudoku5lv43);
        EditText sudoku44 = findViewById(R.id.sudoku5lv44);

        if (sudoku11.getText().toString().equals("3") && sudoku12.getText().toString().equals("4") && sudoku13.getText().toString().equals("1") && sudoku14.getText().toString().equals("2")
                && sudoku21.getText().toString().equals("1") && sudoku22.getText().toString().equals("2") && sudoku23.getText().toString().equals("3") && sudoku24.getText().toString().equals("4")
                && sudoku31.getText().toString().equals("4") && sudoku32.getText().toString().equals("1") && sudoku33.getText().toString().equals("2") && sudoku34.getText().toString().equals("3")
                && sudoku41.getText().toString().equals("2") && sudoku42.getText().toString().equals("3") && sudoku43.getText().toString().equals("4") && sudoku44.getText().toString().equals("1")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 5", 1);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv6.class);


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 5", 0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv6.class);

        }
    }
    public void sudokudevam6(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku6lv11);
        EditText sudoku12 = findViewById(R.id.sudoku6lv12);
        EditText sudoku13 = findViewById(R.id.sudoku6lv13);
        EditText sudoku14 = findViewById(R.id.sudoku6lv14);
        EditText sudoku21 = findViewById(R.id.sudoku6lv21);
        EditText sudoku22 = findViewById(R.id.sudoku6lv22);
        EditText sudoku23 = findViewById(R.id.sudoku6lv23);
        EditText sudoku24 = findViewById(R.id.sudoku6lv24);
        EditText sudoku31 = findViewById(R.id.sudoku6lv31);
        EditText sudoku32 = findViewById(R.id.sudoku6lv32);
        EditText sudoku33 = findViewById(R.id.sudoku6lv33);
        EditText sudoku34 = findViewById(R.id.sudoku6lv34);
        EditText sudoku41 = findViewById(R.id.sudoku6lv41);
        EditText sudoku42 = findViewById(R.id.sudoku6lv42);
        EditText sudoku43 = findViewById(R.id.sudoku6lv43);
        EditText sudoku44 = findViewById(R.id.sudoku6lv44);

        if (sudoku11.getText().toString().equals("2") && sudoku12.getText().toString().equals("3") && sudoku13.getText().toString().equals("1") && sudoku14.getText().toString().equals("4")
                && sudoku21.getText().toString().equals("1") && sudoku22.getText().toString().equals("4") && sudoku23.getText().toString().equals("2") && sudoku24.getText().toString().equals("3")
                && sudoku31.getText().toString().equals("4") && sudoku32.getText().toString().equals("2") && sudoku33.getText().toString().equals("3") && sudoku34.getText().toString().equals("1")
                && sudoku41.getText().toString().equals("3") && sudoku42.getText().toString().equals("1") && sudoku43.getText().toString().equals("4") && sudoku44.getText().toString().equals("2")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 6", 1);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv7.class);


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 6", 0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv7.class);

        }
    }

    public void sudokudevam7(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku7lv11);
        EditText sudoku12 = findViewById(R.id.sudoku7lv12);
        EditText sudoku13 = findViewById(R.id.sudoku7lv13);
        EditText sudoku14 = findViewById(R.id.sudoku7lv14);
        EditText sudoku21 = findViewById(R.id.sudoku7lv21);
        EditText sudoku22 = findViewById(R.id.sudoku7lv22);
        EditText sudoku23 = findViewById(R.id.sudoku7lv23);
        EditText sudoku24 = findViewById(R.id.sudoku7lv24);
        EditText sudoku31 = findViewById(R.id.sudoku7lv31);
        EditText sudoku32 = findViewById(R.id.sudoku7lv32);
        EditText sudoku33 = findViewById(R.id.sudoku7lv33);
        EditText sudoku34 = findViewById(R.id.sudoku7lv34);
        EditText sudoku41 = findViewById(R.id.sudoku7lv41);
        EditText sudoku42 = findViewById(R.id.sudoku7lv42);
        EditText sudoku43 = findViewById(R.id.sudoku7lv43);
        EditText sudoku44 = findViewById(R.id.sudoku7lv44);

        if (sudoku11.getText().toString().equals("4") && sudoku12.getText().toString().equals("2") && sudoku13.getText().toString().equals("3") && sudoku14.getText().toString().equals("1")
                && sudoku21.getText().toString().equals("1") && sudoku22.getText().toString().equals("3") && sudoku23.getText().toString().equals("4") && sudoku24.getText().toString().equals("2")
                && sudoku31.getText().toString().equals("3") && sudoku32.getText().toString().equals("1") && sudoku33.getText().toString().equals("2") && sudoku34.getText().toString().equals("4")
                && sudoku41.getText().toString().equals("2") && sudoku42.getText().toString().equals("4") && sudoku43.getText().toString().equals("1") && sudoku44.getText().toString().equals("3")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 7", 1);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv8.class);


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 7", 0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            Question.FragmentDegistirSudoku(fragmentManager, Sudokulv8.class);

        }

    }

    public void sudokudevam8(View view) {
        EditText sudoku11 = findViewById(R.id.sudoku8lv11);
        EditText sudoku12 = findViewById(R.id.sudoku8lv12);
        EditText sudoku13 = findViewById(R.id.sudoku8lv13);
        EditText sudoku14 = findViewById(R.id.sudoku8lv14);
        EditText sudoku21 = findViewById(R.id.sudoku8lv21);
        EditText sudoku22 = findViewById(R.id.sudoku8lv22);
        EditText sudoku23 = findViewById(R.id.sudoku8lv23);
        EditText sudoku24 = findViewById(R.id.sudoku8lv24);
        EditText sudoku31 = findViewById(R.id.sudoku8lv31);
        EditText sudoku32 = findViewById(R.id.sudoku8lv32);
        EditText sudoku33 = findViewById(R.id.sudoku8lv33);
        EditText sudoku34 = findViewById(R.id.sudoku8lv34);
        EditText sudoku41 = findViewById(R.id.sudoku8lv41);
        EditText sudoku42 = findViewById(R.id.sudoku8lv42);
        EditText sudoku43 = findViewById(R.id.sudoku8lv43);
        EditText sudoku44 = findViewById(R.id.sudoku8lv44);

        if (sudoku11.getText().toString().equals("4") && sudoku12.getText().toString().equals("3") && sudoku13.getText().toString().equals("1") && sudoku14.getText().toString().equals("2")
                && sudoku21.getText().toString().equals("2") && sudoku22.getText().toString().equals("1") && sudoku23.getText().toString().equals("3") && sudoku24.getText().toString().equals("4")
                && sudoku31.getText().toString().equals("1") && sudoku32.getText().toString().equals("4") && sudoku33.getText().toString().equals("2") && sudoku34.getText().toString().equals("3")
                && sudoku41.getText().toString().equals("3") && sudoku42.getText().toString().equals("2") && sudoku43.getText().toString().equals("4") && sudoku44.getText().toString().equals("1")) {

            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 8", 1);
            Intent intent = new Intent(getApplicationContext(), menuscreen.class);
            startActivity(intent);
            finish();


        } else if (sudoku11.getText().toString().equals("") || sudoku12.getText().toString().equals("") || sudoku13.getText().toString().equals("") || sudoku14.getText().toString().equals("")
                || sudoku21.getText().toString().equals("") || sudoku22.getText().toString().equals("") || sudoku23.getText().toString().equals("") || sudoku24.getText().toString().equals("")
                || sudoku31.getText().toString().equals("") || sudoku32.getText().toString().equals("") || sudoku33.getText().toString().equals("") || sudoku34.getText().toString().equals("")
                || sudoku41.getText().toString().equals("") || sudoku42.getText().toString().equals("") || sudoku43.getText().toString().equals("") || sudoku44.getText().toString().equals(""))
        {


            Toast.makeText(getApplicationContext(), "Check all box and fulfill them", Toast.LENGTH_LONG).show();
        }
        else {
            Functions Question = new Functions();
            Question.VeriGonder("Sudoku Level 8", 0);
            Intent intent = new Intent(getApplicationContext(), menuscreen.class);
            startActivity(intent);
            finish();

        }
    }

}