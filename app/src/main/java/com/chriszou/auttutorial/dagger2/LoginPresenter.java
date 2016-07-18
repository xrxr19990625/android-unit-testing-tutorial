package com.chriszou.auttutorial.dagger2;

import com.chriszou.auttutorial.mockito.PasswordValidator;

import javax.inject.Inject;

/**
 * Created by xiaochuang on 4/29/16.
 */
public class LoginPresenter {
    private final UserManager mUserManager;
    private final PasswordValidator mPasswordValidator;

    @Inject
    public LoginPresenter(UserManager userManager, PasswordValidator passwordValidator) {
        this.mUserManager = userManager;
        this.mPasswordValidator = passwordValidator;
    }

    public void login(String username, String password) {
        if (username == null || username.length() == 0) return;
        if (!mPasswordValidator.verifyPassword(password)) return;

        mUserManager.performLogin(username, password);
    }

    public boolean isLoggedIn() {
        return false;
    }

}
