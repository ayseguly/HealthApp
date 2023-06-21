package com.example.health;

import static android.graphics.Color.parseColor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.UserName);
        EditText password = findViewById(R.id.Password);
        ImageView back = findViewById(R.id.geri);
        Button register1 = findViewById(R.id.RegisterOl1);
        Button login1 = findViewById(R.id.LoginOl);


        mAuth = FirebaseAuth.getInstance();

        username.setVisibility(View.INVISIBLE);

        password.setVisibility(View.INVISIBLE);

        back.setVisibility(View.INVISIBLE);

        register1.setVisibility(View.INVISIBLE);

        login1.setVisibility(View.INVISIBLE);


        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
            String UId = currentFirebaseUser.getUid();
            DocumentReference docRef = db.collection("user").document(UId);
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String sonuc = document.getString("User Case").toString();
                            //int sonuc2 = Integer.valueOf(sonuc);
                            if(sonuc.equals("Doctor")){
                                Intent intent = new Intent(getApplicationContext(), DoctorMenu.class);
                                startActivity(intent);
                                finish();
                            }else if(sonuc.equals("Patient")){
                                Intent intent = new Intent(getApplicationContext(), menuscreen.class);
                                startActivity(intent);
                                finish();
                            }
                            else {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                                finish();

                            }

                        } else {

                        }
                    } else {

                    }
                }
            });
            finish();

        } else {
            // No user is signed in
        }
    }
    public void RegisterOl(View view){

        EditText username = findViewById(R.id.UserName);
        EditText password = findViewById(R.id.Password);


        String email= username.getText().toString();
        String pass= password.getText().toString();



        mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Intent intent = new Intent(view.getContext(), userinfo.class);
                            view.getContext().startActivity(intent);
                            // Sign in success, update UI with the signed-in user's information

                        } else {
                            // If sign in fails, display a message to the user.

                        }
                    }
                });
    }


    public  void Login(View view){

    System.out.println("Worked");

    Log.i("worked","worked!!");

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);


        layout.setBackgroundResource(R.drawable.white);

        EditText username = findViewById(R.id.UserName);
        EditText password = findViewById(R.id.Password);
        ImageView back = findViewById(R.id.geri);
        Button login1 = findViewById(R.id.LoginOl);
        LinearLayout linear1 = findViewById(R.id.buttonsField);

        username.setVisibility(View.VISIBLE);

        password.setVisibility(View.VISIBLE);

        back.setVisibility(View.VISIBLE);

        login1.setVisibility(View.VISIBLE);

        linear1.setVisibility(View.INVISIBLE);


    }

    public void Register(View view){

        EditText username = findViewById(R.id.UserName);
        EditText password = findViewById(R.id.Password);
        ImageView back = findViewById(R.id.geri);
        Button register1 = findViewById(R.id.RegisterOl1);
        LinearLayout linear1 = findViewById(R.id.buttonsField);

        username.setVisibility(View.VISIBLE);

        password.setVisibility(View.VISIBLE);

        back.setVisibility(View.VISIBLE);

        register1.setVisibility(View.VISIBLE);

        linear1.setVisibility(View.INVISIBLE);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);


        layout.setBackgroundResource(R.drawable.white);



    }

    public void Back (View view){

        EditText username = findViewById(R.id.UserName);
        EditText password = findViewById(R.id.Password);
        ImageView back = findViewById(R.id.geri);
        Button register1 = findViewById(R.id.RegisterOl1);
        Button login1 = findViewById(R.id.LoginOl);

        username.setVisibility(View.INVISIBLE);
        password.setVisibility(View.INVISIBLE);
        back.setVisibility(View.INVISIBLE);
        register1.setVisibility(View.INVISIBLE);
        login1.setVisibility(View.INVISIBLE);
        LinearLayout linear1 = findViewById(R.id.buttonsField);
        linear1.setVisibility(View.VISIBLE);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);


        layout.setBackgroundResource(R.drawable.bg1);



    }

    public void LoginOl (View view){

        EditText username = findViewById(R.id.UserName);
        EditText password = findViewById(R.id.Password);


        String email= username.getText().toString();
        String pass= password.getText().toString();


        mAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
                            String UId = currentFirebaseUser.getUid();
                            DocumentReference docRef = db.collection("user").document(UId);
                            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                                @Override
                                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                    if (task.isSuccessful()) {
                                        DocumentSnapshot document = task.getResult();
                                        if (document.exists()) {
                                            String sonuc = document.getString("User Case");
                                            //int sonuc2 = Integer.valueOf(sonuc);
                                            if(sonuc.equals("Doctor") ){
                                                Intent intent = new Intent(view.getContext(), DoctorMenu.class);
                                                view.getContext().startActivity(intent);
                                            }else if(sonuc.equals("Patient") ){
                                                Intent intent = new Intent(view.getContext(), menuscreen.class);
                                                view.getContext().startActivity(intent);
                                            }

                                        } else {

                                        }
                                    } else {

                                    }
                                }
                            });


                        } else {
                            Toast.makeText(getApplicationContext(), "Invalid user, please try again.", Toast.LENGTH_LONG).show();

                        }
                    }
                });






    }
}