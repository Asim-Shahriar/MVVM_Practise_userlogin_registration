package com.example.mvvm_practise_userlogin_registration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvm_practise_userlogin_registration.callback.LoginResultCallBack;
import com.example.mvvm_practise_userlogin_registration.databinding.ActivityMainBinding;
import com.example.mvvm_practise_userlogin_registration.viewModel.LoginViewModel;
import com.example.mvvm_practise_userlogin_registration.viewModel.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity implements LoginResultCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(this,new LoginViewModelFactory(this))

        .get(LoginViewModel.class));

    }

    @Override
    public void onSuccess(String message) {

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError(String message) {

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
