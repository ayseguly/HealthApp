package com.example.health;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import com.example.health.FindingTestPackage.Findinglv2;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Functions {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
    String UId = currentFirebaseUser.getUid();

    public void VeriGonder(String soru, int cevap ){
        /*Map<String, Object> user = new HashMap<>();
        user.put("Deneme", 100);
        db.collection(path).document(UId).set(user);*/
        DocumentReference Koleksiyon = db.collection("Answers").document(UId);


// Set the "isCapital" field of the city 'DC'
        Koleksiyon
                .update(soru, cevap)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }

    public void FragmentDegistir(FragmentManager fragmentManager, Class fragmentclass){


        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragmentclass, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // name can be null
                .commit();


    }

    public void FragmentDegistirmemory(FragmentManager fragmentManager, Class fragmentclass){


        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, fragmentclass, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // name can be null
                .commit();


    }

    public void FragmentDegistirClock(FragmentManager fragmentManager, Class fragmentclass){


        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView3, fragmentclass, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // name can be null
                .commit();


    }

    public void FragmentDegistirSudoku(FragmentManager fragmentManager, Class fragmentclass){


        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView4, fragmentclass, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // name can be null
                .commit();


    }
}
