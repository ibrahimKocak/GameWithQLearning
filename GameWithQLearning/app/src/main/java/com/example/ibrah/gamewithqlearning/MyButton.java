package com.example.ibrah.gamewithqlearning;

import android.widget.Button;

//tiktalanabilme durumunu içeren özel buton
public class MyButton {

    private Button button;
    private int status;         //0=unclickable, 1=clickable, 2=clicked

    MyButton(Button viewById) {
        setButton(viewById);}

    public Button getButton() {
        return button;
    }

    private void setButton(Button button) {
        this.button = button;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
