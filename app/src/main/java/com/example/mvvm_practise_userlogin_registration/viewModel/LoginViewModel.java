package com.example.mvvm_practise_userlogin_registration.viewModel;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.mvvm_practise_userlogin_registration.callback.LoginResultCallBack;
import com.example.mvvm_practise_userlogin_registration.model.UserModel;

public class LoginViewModel extends ViewModel {

  private UserModel userModel;
  private LoginResultCallBack loginResultCallBack;

  public LoginViewModel(LoginResultCallBack loginResultCallBack){
      this.loginResultCallBack=loginResultCallBack;
      this.userModel=new UserModel();
  }

  public TextWatcher getEmailTextWatcher(){

   return new TextWatcher() {
       @Override
       public void beforeTextChanged(CharSequence s, int start, int count, int after) {

       }

       @Override
       public void onTextChanged(CharSequence s, int start, int before, int count) {
           Log.i("checkWatcherEmail", "Start: "+start+", "+"before: "+before+","+"count: "+count);
       }

       @Override
       public void afterTextChanged(Editable s) {
        userModel.setEmailId(s.toString());
       }
   };
  }

  public TextWatcher getPasswordWatcher(){

      return new TextWatcher() {
          @Override
          public void beforeTextChanged(CharSequence s, int start, int count, int after) {

          }

          @Override
          public void onTextChanged(CharSequence s, int start, int before, int count) {

          }

          @Override
          public void afterTextChanged(Editable s) {
           userModel.setPassword(s.toString());
          }
      };
  }

}
