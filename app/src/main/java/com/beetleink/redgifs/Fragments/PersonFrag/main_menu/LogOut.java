package com.beetleink.redgifs.Fragments.PersonFrag.main_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.beetleink.redgifs.Fragments.PersonFrag.Authentication.RegistrationActivity;
import com.beetleink.redgifs.R;
import com.google.firebase.auth.FirebaseAuth;

public class LogOut extends AppCompatActivity {

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        auth = FirebaseAuth.getInstance();
        auth.signOut();
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}