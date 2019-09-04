package com.arunsinghsaab98.testmyapp;

import com.arunsinghsaab98.testmyapp.Interface.Fighting;

public class KickBoxer implements Fighting {

    @Override
    public String throwJab() {
        return "KickBoxer Jab";
    }

    @Override
    public String throwHook() {
        return "KickBoxer Hook";
    }

    @Override
    public String throwCross() {
        return "KickBoxer Cross";
    }

    @Override
    public String throwUpperCut() {
        return "KickBoxer UpperCut";
    }
}
