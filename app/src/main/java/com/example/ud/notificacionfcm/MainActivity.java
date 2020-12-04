package com.example.ud.notificacionfcm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetToken(View v){
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>(){
            @Override
            public void onComplete(@NonNull Task<String> task) {
                String token = task.getResult();
                Log.e("Mi Token MA: ", token);
                Toast.makeText(MainActivity.this, token, Toast.LENGTH_LONG).show();
            }
        });
    }
}