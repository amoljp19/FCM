package com.softaai.fcmdemo;

import android.app.*;
import android.os.*;
import com.google.firebase.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		FirebaseApp.initializeApp(this);
    }
}
