package com.example.health;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class patientdata extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdata);


    }
    public void doctorBack(View view){
        Intent intent = new Intent(getApplicationContext(), DoctorMenu.class);
        startActivity(intent);
        finish();
    }

    public void search (View view){

            EditText ptID = findViewById(R.id.ptID);
            int ID = Integer.parseInt(ptID.getText().toString());

            //Query verial = db.collection("user").whereEqualTo("ID", ID);
            // Log.i("Sonuc",verial.toString());
            db.collection("user")
                    .whereEqualTo("ID", ID)
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@Nullable Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {

                                    String ptUId = document.getId().toString();

                                    db.collection("Answers")
                                            .whereEqualTo("UId", ptUId)
                                            .get()
                                            .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                                @Override
                                                public void onComplete(@Nullable Task<QuerySnapshot> task) {
                                                    if (task.isSuccessful()) {
                                                        for (QueryDocumentSnapshot document : task.getResult()) {
                                                            TextView clock1 = findViewById(R.id.clockGamelv1);
                                                            TextView clock2 = findViewById(R.id.clockGamelv2);
                                                            TextView clock3 = findViewById(R.id.clockGamelv3);
                                                            TextView clock4 = findViewById(R.id.clockGamelv4);
                                                            TextView clock5 = findViewById(R.id.clockGamelv5);
                                                            TextView clock6 = findViewById(R.id.clockGamelv6);
                                                            TextView clock7 = findViewById(R.id.clockGamelv7);
                                                            TextView clock8 = findViewById(R.id.clockGamelv8);
                                                            TextView clock9 = findViewById(R.id.clockGamelv9);
                                                           /* clock1.setText(document.get("Clock Question 1").toString());
                                                            clock2.setText(document.get("Clock Question 2").toString());
                                                            clock3.setText(document.get("Clock Question 3").toString());
                                                            clock4.setText(document.get("Clock Question 4").toString());
                                                            clock5.setText(document.get("Clock Question 5").toString());
                                                            clock6.setText(document.get("Clock Question 6").toString());
                                                            clock7.setText(document.get("Clock Question 7").toString());
                                                            clock8.setText(document.get("Clock Question 8").toString());
                                                            clock9.setText(document.get("Clock Question 9").toString());*/

                                                            TextView memory1 = findViewById(R.id.memoryGamelv1);
                                                            TextView memory2 = findViewById(R.id.memoryGamelv2);
                                                            TextView memory3 = findViewById(R.id.memoryGamelv3);
                                                            TextView memory4 = findViewById(R.id.memoryGamelv4);
                                                            TextView memory5 = findViewById(R.id.memoryGamelv5);
                                                            TextView memory6 = findViewById(R.id.memoryGamelv6);
                                                            TextView memory7 = findViewById(R.id.memoryGamelv7);
                                                            TextView memory8 = findViewById(R.id.memoryGamelv8);
                                                            TextView memory9 = findViewById(R.id.memoryGamelv9);
                                                            TextView memory10 = findViewById(R.id.memoryGamelv10);
                                                            TextView memory11 = findViewById(R.id.memoryGamelv11);
                                                            TextView memory12 = findViewById(R.id.memoryGamelv12);
                                                            TextView memory13 = findViewById(R.id.memoryGamelv13);
                                                            TextView memory14 = findViewById(R.id.memoryGamelv14);
                                                            TextView memory15 = findViewById(R.id.memoryGamelv15);
                                                            TextView memory16 = findViewById(R.id.memoryGamelv16);
                                                            TextView memory17 = findViewById(R.id.memoryGamelv17);
                                                            TextView memory18 = findViewById(R.id.memoryGamelv18);
                                                            if(document.get("Memory Game Question 1") != null){
                                                                memory1.setText(document.get("Memory Game Question 1").toString());
                                                            }
                                                            if(document.get("Memory Game Question 2") != null){
                                                                memory2.setText(document.get("Memory Game Question 2").toString());
                                                            }
                                                            if(document.get("Memory Game Question 3") != null){
                                                                memory3.setText(document.get("Memory Game Question 3").toString());
                                                            }
                                                            if(document.get("Memory Game Question 4") != null){
                                                                memory4.setText(document.get("Memory Game Question 4").toString());
                                                            }
                                                            if(document.get("Memory Game Question 5") != null){
                                                                memory5.setText(document.get("Memory Game Question 5").toString());
                                                            }
                                                            if(document.get("Memory Game Question 6") != null){
                                                                memory6.setText(document.get("Memory Game Question 6").toString());
                                                            }
                                                            if(document.get("Memory Game Question 7") != null){
                                                                memory7.setText(document.get("Memory Game Question 7").toString());
                                                            }
                                                            if(document.get("Memory Game Question 8") != null){
                                                                memory8.setText(document.get("Memory Game Question 8").toString());
                                                            }
                                                            if(document.get("Memory Game Question 9") != null){
                                                                memory9.setText(document.get("Memory Game Question 9").toString());
                                                            }
                                                            if(document.get("Memory Game Question 10") != null){
                                                                memory10.setText(document.get("Memory Game Question 10").toString());
                                                            }
                                                            if(document.get("Memory Game Question 11") != null){
                                                                memory11.setText(document.get("Memory Game Question 11").toString());
                                                            }
                                                            if(document.get("Memory Game Question 12") != null){
                                                                memory12.setText(document.get("Memory Game Question 12").toString());
                                                            }
                                                            if(document.get("Memory Game Question 13") != null){
                                                                memory13.setText(document.get("Memory Game Question 13").toString());
                                                            }
                                                            if(document.get("Memory Game Question 14") != null){
                                                                memory14.setText(document.get("Memory Game Question 14").toString());
                                                            }
                                                            if(document.get("Memory Game Question 15") != null){
                                                                memory15.setText(document.get("Memory Game Question 15").toString());
                                                            }
                                                            if(document.get("Memory Game Question 16") != null){
                                                                memory16.setText(document.get("Memory Game Question 16").toString());
                                                            }
                                                            if(document.get("Memory Game Question 17") != null){
                                                                memory17.setText(document.get("Memory Game Question 17").toString());
                                                            }
                                                            if(document.get("Memory Game Question 18") != null){
                                                                memory18.setText(document.get("Memory Game Question 18").toString());
                                                            }



                                                            /*memory3.setText(document.get("Memory Game Question 3").toString());
                                                            memory4.setText(document.get("Memory Game Question 4").toString());
                                                            memory5.setText(document.get("Memory Game Question 5").toString());
                                                            memory6.setText(document.get("Memory Game Question 6").toString());
                                                            memory7.setText(document.get("Memory Game Question 7").toString());
                                                            memory8.setText(document.get("Memory Game Question 8").toString());
                                                            memory9.setText(document.get("Memory Game Question 9").toString());
                                                            memory10.setText(document.get("Memory Game Question 10").toString());
                                                            memory11.setText(document.get("Memory Game Question 11").toString());
                                                            memory12.setText(document.get("Memory Game Question 12").toString());
                                                            memory13.setText(document.get("Memory Game Question 13").toString());
                                                            memory14.setText(document.get("Memory Game Question 14").toString());
                                                            memory15.setText(document.get("Memory Game Question 15").toString());
                                                            memory16.setText(document.get("Memory Game Question 16").toString());
                                                            memory17.setText(document.get("Memory Game Question 17").toString());
                                                            memory18.setText(document.get("Memory Game Question 18").toString());*/

                                                            TextView find1 = findViewById(R.id.findGamelv1);
                                                            TextView find2 = findViewById(R.id.findGamelv2);
                                                            TextView find3 = findViewById(R.id.findGamelv3);
                                                            TextView find4 = findViewById(R.id.findGamelv4);
                                                            TextView find5 = findViewById(R.id.findGamelv5);
                                                            TextView find6 = findViewById(R.id.findGamelv6);
                                                            TextView find7 = findViewById(R.id.findGamelv7);

                                                            if(document.get("Clock Question 1") != null){
                                                                clock1.setText(document.get("Clock Question 1").toString());
                                                            }
                                                            if(document.get("Clock Question 2") != null){
                                                                clock2.setText(document.get("Clock Question 2").toString());
                                                            }
                                                            if(document.get("Clock Question 3") != null){
                                                                clock3.setText(document.get("Clock Question 3").toString());
                                                            }
                                                            if(document.get("Clock Question 4") != null){
                                                                clock4.setText(document.get("Clock Question 4").toString());
                                                            }
                                                            if(document.get("Clock Question 5") != null){
                                                                clock5.setText(document.get("Clock Question 5").toString());
                                                            }
                                                            if(document.get("Clock Question 6") != null){
                                                                clock6.setText(document.get("Clock Question 6").toString());
                                                            }
                                                            if(document.get("Clock Question 7") != null){
                                                                clock7.setText(document.get("Clock Question 7").toString());
                                                            }
                                                            if(document.get("Clock Question 8") != null){
                                                                clock8.setText(document.get("Clock Question 8").toString());
                                                            }
                                                            if(document.get("Clock Question 9") != null){
                                                                clock9.setText(document.get("Clock Question 9").toString());
                                                            }



/*
                                                            find1.setText(document.get("Finding Test Question 1").toString());
                                                            find2.setText(document.get("Finding Test Question 2").toString());
                                                            find3.setText(document.get("Finding Test Question 3").toString());
                                                            find4.setText(document.get("Finding Test Question 4").toString());
                                                            find5.setText(document.get("Finding Test Question 5").toString());
                                                            find6.setText(document.get("Finding Test Question 6").toString());
                                                            find7.setText(document.get("Finding Test Question 7").toString());*/

                                                            TextView sudoku1 = findViewById(R.id.sudokuGamelv1);
                                                            TextView sudoku2 = findViewById(R.id.sudokuGamelv2);
                                                            TextView sudoku3 = findViewById(R.id.sudokuGamelv3);
                                                            TextView sudoku4 = findViewById(R.id.sudokuGamelv4);
                                                            TextView sudoku5 = findViewById(R.id.sudokuGamelv5);
                                                            TextView sudoku6 = findViewById(R.id.sudokuGamelv6);
                                                            TextView sudoku7 = findViewById(R.id.sudokuGamelv7);
                                                            TextView sudoku8 = findViewById(R.id.sudokuGamelv8);
/*
                                                            sudoku1.setText(document.get("Sudoku Question 1").toString());
                                                            sudoku2.setText(document.get("Sudoku Question 2").toString());
                                                            sudoku3.setText(document.get("Sudoku Question 3").toString());
                                                            sudoku4.setText(document.get("Sudoku Question 4").toString());
                                                            sudoku5.setText(document.get("Sudoku Question 5").toString());
                                                            sudoku6.setText(document.get("Sudoku Question 6").toString());
                                                            sudoku7.setText(document.get("Sudoku Question 7").toString());
                                                            sudoku8.setText(document.get("Sudoku Question 8").toString());*/
                                                            if(document.get("Finding Test Question 1") != null){
                                                                find1.setText(document.get("Finding Test Question 1").toString());
                                                            }
                                                            if(document.get("Finding Test Question 2") != null){
                                                                find2.setText(document.get("Finding Test Question 2").toString());
                                                            }
                                                            if(document.get("Finding Test Question 3") != null){
                                                                find3.setText(document.get("Finding Test Question 3").toString());
                                                            }
                                                            if(document.get("Finding Test Question 4") != null){
                                                                find4.setText(document.get("Finding Test Question 4").toString());
                                                            }
                                                            if(document.get("Finding Test Question 5") != null){
                                                                find5.setText(document.get("Finding Test Question 5").toString());
                                                            }
                                                            if(document.get("Finding Test Question 6") != null){
                                                                find6.setText(document.get("Finding Test Question 6").toString());
                                                            }
                                                            if(document.get("Finding Test Question 7") != null){
                                                                find7.setText(document.get("Finding Test Question 7").toString());
                                                            }


                                                            if(document.get("Sudoku Level 1") != null){
                                                                sudoku1.setText(document.get("Sudoku Level 1").toString());
                                                            }
                                                            if(document.get("Sudoku Level 2") != null){
                                                                sudoku2.setText(document.get("Sudoku Level 2").toString());
                                                            }
                                                            if(document.get("Sudoku Level 3") != null){
                                                                sudoku3.setText(document.get("Sudoku Level 3").toString());
                                                            }
                                                            if(document.get("Sudoku Level 4") != null){
                                                                sudoku4.setText(document.get("Sudoku Level 4").toString());
                                                            }
                                                            if(document.get("Sudoku Level 5") != null){
                                                                sudoku5.setText(document.get("Sudoku Level 5").toString());
                                                            }
                                                            if(document.get("Sudoku Level 6") != null){
                                                                sudoku6.setText(document.get("Sudoku Level 6").toString());
                                                            }
                                                            if(document.get("Sudoku Level 7") != null){
                                                                sudoku7.setText(document.get("Sudoku Level 7").toString());
                                                            }
                                                            if(document.get("Sudoku Level 8") != null){
                                                                sudoku8.setText(document.get("Sudoku Level 8").toString());
                                                            }


                                                        }
                                                    } else {
                                                    }
                                                }
                                            });

                                }
                            } else {
                            }
                        }
                    });




    }
}