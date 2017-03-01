package com.uvoice.jhb.databindingdemo.bean;

import android.databinding.BindingAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.webkit.WebView;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/1/19.
 */

public class User {

    private String userName;
    private int userAge;
    private String userPwd;
    private String userIconPath;

    public User(String userName, int userAge, String userPwd, String userIconPath) {
        this.userName = userName;
        this.userAge = userAge;
        this.userPwd = userPwd;
        this.userIconPath = userIconPath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserIconPath() {
        return userIconPath;
    }

    public void setUserIconPath(String userIconPath) {
        this.userIconPath = userIconPath;
    }

    @BindingAdapter({"userIcon"})
    public static void imageLoader(WebView webView, String userIconPath){
        webView.loadUrl(userIconPath);
    }
}
