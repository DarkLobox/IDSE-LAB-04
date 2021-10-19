package org.idnp.mvvmsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.idnp.mvvmsample.databinding.ActivityFourthBinding;
import org.idnp.mvvmsample.databinding.ActivitySecondBinding;
import org.idnp.mvvmsample.viewmodels.FourthVideModel;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_fourth);

        ActivityFourthBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_fourth);
        binding.setMiViewModelo(new FourthVideModel());
        binding.executePendingBindings();
    }
}