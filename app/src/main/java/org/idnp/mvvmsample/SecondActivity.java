package org.idnp.mvvmsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import org.idnp.mvvmsample.databinding.ActivitySecondBinding;
import org.idnp.mvvmsample.viewmodels.VisitaViewModel;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        binding.setViewModel(new VisitaViewModel(this));
        binding.executePendingBindings();
    }
}