package com.example.withteaagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    TextInputLayout favMoive, favFlower;
    Button submit;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favMoive = findViewById(R.id.ti_movieAnswer);
        favFlower = findViewById(R.id.ti_flowerAnswer);
        submit = findViewById(R.id.bt_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("something");

                //get all values
                String movie = favMoive.getEditText().getText().toString();
                String flower = favFlower.getEditText().getText().toString();

                UserHelperClass helperClass = new UserHelperClass(movie, flower);
                reference.child(movie).setValue(helperClass);
            }
        });
    }
}