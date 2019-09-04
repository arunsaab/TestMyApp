package com.arunsinghsaab98.testmyapp;

import com.arunsinghsaab98.testmyapp.Interface.Fighting;

public class Boxer implements Fighting {
    @Override
    public String throwJab() {
        return "Boxer Jab";
    }

    @Override
    public String throwHook() {
        return "Boxer Hook";
    }

    @Override
    public String throwCross() {
        return "Boxer Cross";
    }

    @Override
    public String throwUpperCut() {
        return "Boxer UpperCut  ";
    }
}
