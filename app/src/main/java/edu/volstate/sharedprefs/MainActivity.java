package edu.volstate.sharedprefs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnMakeItDo;
    private EditText editTextData;
    private SharedPreferences sPrefs;
    private SharedPreferences.Editor sPrefsEditor;
    private String strMakeItDo;
    private TextView txtViewMakeItDo;

    private View.OnClickListener makeItDoListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) { makeItDo(); }
    };

    private void makeItDo() {
        strMakeItDo = editTextData.getText().toString();
        Log.i("strMakeItDo", strMakeItDo);
        Intent activity2 = new Intent(this, MainActivity2.class);
        startActivity(activity2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextData = findViewById(R.id.editTextData);
        txtViewMakeItDo = findViewById(R.id.txtViewData);

        btnMakeItDo = findViewById(R.id.btnGo);
        btnMakeItDo.setOnClickListener(makeItDoListener);

    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("SaveState", "I was saved!");
        Log.i("SaveState", strMakeItDo);
        super.onSaveInstanceState(outState);
        outState.putString("make_it_do", strMakeItDo);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.i("RestoreState", "I was restored!");
        super.onRestoreInstanceState(savedInstanceState);
        txtViewMakeItDo = findViewById(R.id.txtViewData);
        String doText = savedInstanceState.getString("make_it_do");
        Log.i("RestoreState", doText);
        txtViewMakeItDo.setText(doText);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("ResumeState", "I was resumed!");
    }
}