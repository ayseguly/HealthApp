package com.example.health;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.SetOptions;

import java.util.HashMap;
import java.util.Map;

public class userinfo extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    public String cinsiyet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
    }

    public void devam(View view) {
        EditText Name = findViewById(R.id.Name);
        EditText BDate = findViewById(R.id.BirthDate);
        RadioGroup rg = findViewById(R.id.radioGroup);
        RadioGroup rg2 = findViewById(R.id.radioGroup2);

        String isim = Name.getText().toString();
        String bd = BDate.getText().toString();
        int selectedId = rg.getCheckedRadioButtonId();
        int selectedId2 = rg2.getCheckedRadioButtonId();
        RadioButton gender = (RadioButton) findViewById(selectedId);
        RadioButton usercase = findViewById(selectedId2);


        String usercaseid = usercase.getText().toString();


        cinsiyet = gender.getText().toString();
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String UId = currentFirebaseUser.getUid();
        if (usercaseid.equals("Doctor") && (Name.getText().toString().trim().length() > 0) && (BDate.getText().toString().trim().length() > 0) && cinsiyet.isEmpty() == false) {
            Map<String, Object> user = new HashMap<>();
            user.put("name", isim);
            user.put("BirthDate", bd);
            user.put("Gender", cinsiyet);
            user.put("User Case", usercaseid);

            db.collection("user").document(UId).set(user);
            Map<String, Object> cevap = new HashMap<>();
            cevap.put("isSuccessful", true);
            db.collection("Answers").document(UId).set(cevap);
            Intent intent = new Intent(getApplicationContext(), DoctorMenu.class);
            startActivity(intent);
            finish();

        } else if (usercaseid.equals("Patient") && (Name.getText().toString().trim().length() > 0) && (BDate.getText().toString().trim().length() > 0) && cinsiyet.isEmpty() == false) {
            db.collection("user").orderBy("ID", Query.Direction.DESCENDING).limit(1)
                    .get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                        @Override
                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                            String gelenid = queryDocumentSnapshots.getDocuments().get(0).get("ID").toString();
                            int yeniid = Integer.parseInt(gelenid);
                            yeniid = yeniid + 1;

                            // Create a new user with a first and last name
                            Map<String, Object> user = new HashMap<>();
                            user.put("name", isim);
                            user.put("BirthDate", bd);
                            user.put("Gender", cinsiyet);
                            user.put("User Case", usercaseid);
                            user.put("ID", yeniid);

                            db.collection("user").document(UId).set(user);
                            Map<String, Object> cevap = new HashMap<>();
                            cevap.put("Clock Question 1", null);
                            cevap.put("Clock Question 2", null);
                            cevap.put("Clock Question 3", null);
                            cevap.put("Clock Question 4", null);
                            cevap.put("Clock Question 5", null);
                            cevap.put("Clock Question 6", null);
                            cevap.put("Clock Question 7", null);
                            cevap.put("Clock Question 8", null);
                            cevap.put("Clock Question 9", null);
                            cevap.put("Finding Test Question 1", null);
                            cevap.put("Finding Test Question 2", null);
                            cevap.put("Finding Test Question 3", null);
                            cevap.put("Finding Test Question 4", null);
                            cevap.put("Finding Test Question 5", null);
                            cevap.put("Finding Test Question 6", null);
                            cevap.put("Finding Test Question 7", null);
                            cevap.put("Sudoku Level 1", null);
                            cevap.put("Sudoku Level 2", null);
                            cevap.put("Sudoku Level 3", null);
                            cevap.put("Sudoku Level 4", null);
                            cevap.put("Sudoku Level 5", null);
                            cevap.put("Sudoku Level 6", null);
                            cevap.put("Sudoku Level 7", null);
                            cevap.put("Sudoku Level 8", null);
                            cevap.put("Memory Game Question 1", null);
                            cevap.put("Memory Game Question 2", null);
                            cevap.put("Memory Game Question 3", null);
                            cevap.put("Memory Game Question 4", null);
                            cevap.put("Memory Game Question 5", null);
                            cevap.put("Memory Game Question 6", null);
                            cevap.put("Memory Game Question 7", null);
                            cevap.put("Memory Game Question 8", null);
                            cevap.put("Memory Game Question 9", null);
                            cevap.put("Memory Game Question 10", null);
                            cevap.put("Memory Game Question 11", null);
                            cevap.put("Memory Game Question 12", null);
                            cevap.put("Memory Game Question 13", null);
                            cevap.put("Memory Game Question 14", null);
                            cevap.put("Memory Game Question 15", null);
                            cevap.put("Memory Game Question 16", null);
                            cevap.put("Memory Game Question 17", null);
                            cevap.put("Memory Game Question 18", null);
                            cevap.put("UId", UId);
                            db.collection("Answers").document(UId).set(cevap);

                        }
                    });
            Intent intent = new Intent(getApplicationContext(), menuscreen.class);
            startActivity(intent);
            finish();
        } else {

            Toast.makeText(getApplicationContext(), "Please fill all the information", Toast.LENGTH_LONG).show();
        }



}
}