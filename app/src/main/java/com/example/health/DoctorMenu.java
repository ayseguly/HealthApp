package com.example.health;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class DoctorMenu extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_menu);

        mAuth= FirebaseAuth.getInstance();


    }
    public void LogOutDr(View view){


        mAuth.signOut();
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        view.getContext().startActivity(intent);



    }

/*    public void ButonGetir(){

        Button hasta1 = findViewById(R.id.Patient1);
        Button hasta2 = findViewById(R.id.patient2);
        Button hasta3 = findViewById(R.id.patient3);
        Button hasta4 = findViewById(R.id.patient4);
        db.collection("user")
                .whereEqualTo("User Case", "Patient")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            int sayi = 1;
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                if (sayi==1){
                                    hasta1.setText(document.getString("name"));
                                    sayi+=2;
                                }
                                else if(sayi==2){
                                    hasta2.setText(document.getString("name"));
                                    sayi+=2;
                                }
                                else if(sayi==3){
                                    hasta3.setText(document.getString("name"));
                                    sayi+=2;
                                }
                                else if(sayi==4){
                                    hasta4.setText(document.getString("name"));
                                    sayi+=2;
                                }
                                sayi=sayi-1;

                            }
                        } else {

                        }
                    }
                });


    }*/
    public void Back(View view ){


        Button hasta1 = findViewById(R.id.Patient1);

        ImageView userpp = findViewById(R.id.Drprofile);
        ImageView logOut = findViewById(R.id.logout);
        ImageView geri = findViewById(R.id.geri);
        TextView logtext = findViewById(R.id.logouttext);
        ImageView sett = findViewById(R.id.settings);
        sett.setVisibility(View.VISIBLE);
        userpp.setVisibility(View.INVISIBLE);
        logOut.setVisibility(View.INVISIBLE);
        geri.setVisibility(View.INVISIBLE);
        logtext.setVisibility(View.INVISIBLE);
        hasta1.setVisibility(View.VISIBLE);


    }

    public void DrSettingsGetir(View view)
    {

        ImageView userpp = findViewById(R.id.Drprofile);
        ImageView logOut = findViewById(R.id.logout);
        ImageView geri = findViewById(R.id.geri);
        TextView logtext = findViewById(R.id.logouttext);
        Button hasta1 = findViewById(R.id.Patient1);

        ImageView sett = findViewById(R.id.settings);
        sett.setVisibility(View.INVISIBLE);
        userpp.setVisibility(View.VISIBLE);
        logOut.setVisibility(View.VISIBLE);
        geri.setVisibility(View.VISIBLE);
        logtext.setVisibility(View.VISIBLE);
        hasta1.setVisibility(View.INVISIBLE);



    }

    public void Pt1(View view){

        Intent intent = new Intent(getApplicationContext(), patientdata.class);
        startActivity(intent);




    }

}