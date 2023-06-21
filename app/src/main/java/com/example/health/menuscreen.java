package com.example.health;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

import org.jetbrains.annotations.NotNull;

public class menuscreen extends AppCompatActivity {

    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuscreen);
        mAuth= FirebaseAuth.getInstance();


        Button clock = findViewById(R.id.clock);
        Button sudoku = findViewById(R.id.sudoku);

        ImageView settings = findViewById(R.id.settings);
        ImageView back = findViewById(R.id.geri);
        ImageView profile = findViewById(R.id.profile);
        ImageView howTo = findViewById(R.id.howtoplay);
        ImageView help = findViewById(R.id.Yardım);
        ImageView info = findViewById(R.id.info);
        ImageView logout = findViewById(R.id.logout);

        TextView howToinfo = findViewById(R.id.howToinfo);
        TextView helpinfo = findViewById(R.id.helpinfo);
        TextView about = findViewById(R.id.Aboutinfo);

        TextView helptext = findViewById(R.id.helptext);
        TextView infotext = findViewById(R.id.infotext);
        TextView howtotext = findViewById(R.id.howtoplaytext);
        TextView logouttext = findViewById(R.id.logouttext);



        profile.setVisibility(View.INVISIBLE);
        howTo.setVisibility(View.INVISIBLE);
        help.setVisibility(View.INVISIBLE);
        info.setVisibility(View.INVISIBLE);
        logout.setVisibility(View.INVISIBLE);
        back.setVisibility(View.INVISIBLE);

        howToinfo.setVisibility(View.INVISIBLE);
        helpinfo.setVisibility(View.INVISIBLE);
        about.setVisibility(View.INVISIBLE);
        helptext.setVisibility(View.INVISIBLE);
        infotext.setVisibility(View.INVISIBLE);
        howtotext.setVisibility(View.INVISIBLE);
        logouttext.setVisibility(View.INVISIBLE);



        TextView idtext = findViewById(R.id.hastaID);
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String UId = currentFirebaseUser.getUid();

        DocumentReference docRef = db.collection("user").document(UId);
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        String idaldim = document.get("ID").toString();
                        idtext.setText(idaldim);
                    }
                }
            }
        });






    }

    public void LogOut(View view){


        mAuth.signOut();
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        view.getContext().startActivity(intent);



    }

    public void InfoGetir(View view){


        Button painting = findViewById(R.id.painting);
        Button naming = findViewById(R.id.naming);

        Button clock = findViewById(R.id.clock);
        Button sudoku = findViewById(R.id.sudoku);

        ImageView settings = findViewById(R.id.settings);
        ImageView back = findViewById(R.id.geri);
        ImageView profile = findViewById(R.id.profile);
        ImageView howTo = findViewById(R.id.howtoplay);
        ImageView help = findViewById(R.id.Yardım);
        ImageView info = findViewById(R.id.info);
        ImageView logout = findViewById(R.id.logout);

        TextView howToinfo = findViewById(R.id.howToinfo);
        TextView helpinfo = findViewById(R.id.helpinfo);
        TextView about = findViewById(R.id.Aboutinfo);

        TextView helptext = findViewById(R.id.helptext);
        TextView infotext = findViewById(R.id.infotext);
        TextView howtotext = findViewById(R.id.howtoplaytext);
        TextView logouttext = findViewById(R.id.logouttext);


        painting.setVisibility(View.INVISIBLE);
        naming.setVisibility(View.INVISIBLE);

        clock.setVisibility(View.INVISIBLE);
        sudoku.setVisibility(View.INVISIBLE);
        settings.setVisibility(View.INVISIBLE);

        profile.setVisibility(View.INVISIBLE);
        howTo.setVisibility(View.INVISIBLE);
        help.setVisibility(View.INVISIBLE);
        info.setVisibility(View.INVISIBLE);
        logout.setVisibility(View.INVISIBLE);

        back.setVisibility(View.VISIBLE);

        howToinfo.setVisibility(View.INVISIBLE);
        helpinfo.setVisibility(View.INVISIBLE);
        about.setVisibility(View.VISIBLE);
        helptext.setVisibility(View.INVISIBLE);
        infotext.setVisibility(View.INVISIBLE);
        howtotext.setVisibility(View.INVISIBLE);
        logouttext.setVisibility(View.INVISIBLE);



    }

    public void HelpGetir(View view){



        Button painting = findViewById(R.id.painting);
        Button naming = findViewById(R.id.naming);

        Button clock = findViewById(R.id.clock);
        Button sudoku = findViewById(R.id.sudoku);

        ImageView settings = findViewById(R.id.settings);
        ImageView back = findViewById(R.id.geri);
        ImageView profile = findViewById(R.id.profile);
        ImageView howTo = findViewById(R.id.howtoplay);
        ImageView help = findViewById(R.id.Yardım);
        ImageView info = findViewById(R.id.info);
        ImageView logout = findViewById(R.id.logout);

        TextView howToinfo = findViewById(R.id.howToinfo);
        TextView helpinfo = findViewById(R.id.helpinfo);
        TextView about = findViewById(R.id.Aboutinfo);

        TextView helptext = findViewById(R.id.helptext);
        TextView infotext = findViewById(R.id.infotext);
        TextView howtotext = findViewById(R.id.howtoplaytext);
        TextView logouttext = findViewById(R.id.logouttext);


        painting.setVisibility(View.INVISIBLE);
        naming.setVisibility(View.INVISIBLE);

        clock.setVisibility(View.INVISIBLE);
        sudoku.setVisibility(View.INVISIBLE);
        settings.setVisibility(View.INVISIBLE);

        profile.setVisibility(View.INVISIBLE);
        howTo.setVisibility(View.INVISIBLE);
        help.setVisibility(View.INVISIBLE);
        info.setVisibility(View.INVISIBLE);
        logout.setVisibility(View.INVISIBLE);

        back.setVisibility(View.VISIBLE);

        howToinfo.setVisibility(View.INVISIBLE);
        helpinfo.setVisibility(View.VISIBLE);
        about.setVisibility(View.INVISIBLE);
        helptext.setVisibility(View.INVISIBLE);
        infotext.setVisibility(View.INVISIBLE);
        howtotext.setVisibility(View.INVISIBLE);
        logouttext.setVisibility(View.INVISIBLE);




    }

    public void HowToPlay(View view){



        Button painting = findViewById(R.id.painting);
        Button naming = findViewById(R.id.naming);

        Button clock = findViewById(R.id.clock);
        Button sudoku = findViewById(R.id.sudoku);

        ImageView settings = findViewById(R.id.settings);
        ImageView back = findViewById(R.id.geri);
        ImageView profile = findViewById(R.id.profile);
        ImageView howTo = findViewById(R.id.howtoplay);
        ImageView help = findViewById(R.id.Yardım);
        ImageView info = findViewById(R.id.info);
        ImageView logout = findViewById(R.id.logout);

        TextView howToinfo = findViewById(R.id.howToinfo);
        TextView helpinfo = findViewById(R.id.helpinfo);
        TextView about = findViewById(R.id.Aboutinfo);

        TextView helptext = findViewById(R.id.helptext);
        TextView infotext = findViewById(R.id.infotext);
        TextView howtotext = findViewById(R.id.howtoplaytext);
        TextView logouttext = findViewById(R.id.logouttext);



        painting.setVisibility(View.INVISIBLE);
        naming.setVisibility(View.INVISIBLE);

        clock.setVisibility(View.INVISIBLE);
        sudoku.setVisibility(View.INVISIBLE);
        settings.setVisibility(View.INVISIBLE);

        profile.setVisibility(View.INVISIBLE);
        howTo.setVisibility(View.INVISIBLE);
        help.setVisibility(View.INVISIBLE);
        info.setVisibility(View.INVISIBLE);
        logout.setVisibility(View.INVISIBLE);

        back.setVisibility(View.VISIBLE);

        howToinfo.setVisibility(View.VISIBLE);
        helpinfo.setVisibility(View.INVISIBLE);
        about.setVisibility(View.INVISIBLE);
        helptext.setVisibility(View.INVISIBLE);
        infotext.setVisibility(View.INVISIBLE);
        howtotext.setVisibility(View.INVISIBLE);
        logouttext.setVisibility(View.INVISIBLE);



    }
    public void SettingsGetir(View view){



        Button painting = findViewById(R.id.painting);
        Button naming = findViewById(R.id.naming);

        Button clock = findViewById(R.id.clock);
        Button sudoku = findViewById(R.id.sudoku);

        ImageView settings = findViewById(R.id.settings);
        ImageView back = findViewById(R.id.geri);
        ImageView profile = findViewById(R.id.profile);
        ImageView howTo = findViewById(R.id.howtoplay);
        ImageView help = findViewById(R.id.Yardım);
        ImageView info = findViewById(R.id.info);
        ImageView logout = findViewById(R.id.logout);

        TextView howToinfo = findViewById(R.id.howToinfo);
        TextView helpinfo = findViewById(R.id.helpinfo);
        TextView about = findViewById(R.id.Aboutinfo);

        TextView helptext = findViewById(R.id.helptext);
        TextView infotext = findViewById(R.id.infotext);
        TextView howtotext = findViewById(R.id.howtoplaytext);
        TextView logouttext = findViewById(R.id.logouttext);


        profile.setVisibility(View.VISIBLE);
        howTo.setVisibility(View.VISIBLE);
        help.setVisibility(View.VISIBLE);
        info.setVisibility(View.VISIBLE);
        logout.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);


        painting.setVisibility(View.INVISIBLE);
        naming.setVisibility(View.INVISIBLE);

        clock.setVisibility(View.INVISIBLE);
        sudoku.setVisibility(View.INVISIBLE);
        settings.setVisibility(View.INVISIBLE);




        howToinfo.setVisibility(View.INVISIBLE);
        helpinfo.setVisibility(View.INVISIBLE);
        about.setVisibility(View.INVISIBLE);
        helptext.setVisibility(View.VISIBLE);
        infotext.setVisibility(View.VISIBLE);
        howtotext.setVisibility(View.VISIBLE);
        logouttext.setVisibility(View.VISIBLE);


    }

    public void Back(View view ){



        Button painting = findViewById(R.id.painting);
        Button naming = findViewById(R.id.naming);

        Button clock = findViewById(R.id.clock);
        Button sudoku = findViewById(R.id.sudoku);

        ImageView settings = findViewById(R.id.settings);
        ImageView back = findViewById(R.id.geri);
        ImageView profile = findViewById(R.id.profile);
        ImageView howTo = findViewById(R.id.howtoplay);
        ImageView help = findViewById(R.id.Yardım);
        ImageView info = findViewById(R.id.info);
        ImageView logout = findViewById(R.id.logout);

        TextView howToinfo = findViewById(R.id.howToinfo);
        TextView helpinfo = findViewById(R.id.helpinfo);
        TextView about = findViewById(R.id.Aboutinfo);

        TextView helptext = findViewById(R.id.helptext);
        TextView infotext = findViewById(R.id.infotext);
        TextView howtotext = findViewById(R.id.howtoplaytext);
        TextView logouttext = findViewById(R.id.logouttext);


        painting.setVisibility(View.VISIBLE);
        naming.setVisibility(View.VISIBLE);

        clock.setVisibility(View.VISIBLE);
        sudoku.setVisibility(View.VISIBLE);
        settings.setVisibility(View.VISIBLE);



        profile.setVisibility(View.INVISIBLE);
        howTo.setVisibility(View.INVISIBLE);
        help.setVisibility(View.INVISIBLE);
        info.setVisibility(View.INVISIBLE);
        logout.setVisibility(View.INVISIBLE);
        back.setVisibility(View.INVISIBLE);

        howToinfo.setVisibility(View.INVISIBLE);
        helpinfo.setVisibility(View.INVISIBLE);
        about.setVisibility(View.INVISIBLE);
        helptext.setVisibility(View.INVISIBLE);
        infotext.setVisibility(View.INVISIBLE);
        howtotext.setVisibility(View.INVISIBLE);
        logouttext.setVisibility(View.INVISIBLE);



    }

    public void playSudoku(View view){

        Intent intent = new Intent(this, playSudoku.class);
        startActivity(intent);



    }


    public void Finding(View view){

        Intent intent = new Intent(this, FindingTest.class);
        startActivity(intent);
    }



    public void playMemory(View view){

        Intent intent = new Intent(this, memory.class);
        startActivity(intent);
    }




    public void playClock(View view){

        Intent intent = new Intent(this, drawClock.class);
        startActivity(intent);
    }


}