package org.idnp.mvvmsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.idnp.mvvmsample.databinding.ActivityMainBinding;
import org.idnp.mvvmsample.databinding.ActivityThirdBinding;
import org.idnp.mvvmsample.viewmodels.ThridViewModel;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_third);

       ActivityThirdBinding bindig =
                DataBindingUtil.setContentView(this, R.layout.activity_third);
        bindig.setMiVista(new ThridViewModel());
        bindig.executePendingBindings();
    }
}