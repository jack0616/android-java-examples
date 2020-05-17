package com.jyheo.fragmentbasic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class FragSwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_switch);

        Button button = (Button)findViewById(R.id.button_first);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchFragment(0);
            }
        });
        button = (Button)findViewById(R.id.button_second);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchFragment(1);
            }
        });
    }

    final FirstFragment firstFragment = new FirstFragment();
    final SecondFragment secondFragment = new SecondFragment();

    protected void switchFragment(int id) {
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (id == 0)
            fragmentTransaction.replace(R.id.fragment, firstFragment);
        else
            fragmentTransaction.replace(R.id.fragment, secondFragment);
        fragmentTransaction.commit();
    }
}
