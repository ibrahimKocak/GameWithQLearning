package com.example.ibrah.gamewithqlearning;

import android.app.Activity;
import android.graphics.Color;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by ibrah on 8.12.2017.
 */
//oyundaki butonları bir listede toplayan sınıf, butonlara tiklanabilme bitiş, blok olma gibi durumların atamasını sağlıyor
public class ButtonList {

    ArrayList<MyButton> b;

    private Activity activity;

    ButtonList(Activity _activity){

        this.activity = _activity;
        setButtonArray();
    }

    private void setButtonArray() {

        b = new ArrayList<>();
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b0))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b1))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b2))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b3))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b4)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b5))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b6))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b7))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b8))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b9)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b10))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b11))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b12))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b13))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b14)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b15))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b16))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b17))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b18))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b19)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b20))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b21))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b22))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b23))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b24)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b25))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b26))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b27))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b28))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b29)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b30))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b31))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b32))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b33))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b34)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b35))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b36))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b37))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b38))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b39)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b40))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b41))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b42))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b43))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b44)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b45))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b46))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b47))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b48))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b49)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b50))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b51))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b52))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b53))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b54)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b55))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b56))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b57))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b58))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b59)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b60))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b61))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b62))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b63))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b64)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b65))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b66))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b67))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b68))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b69)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b70))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b71))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b72))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b73))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b74)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b75))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b76))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b77))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b78))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b79)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b80))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b81))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b82))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b83))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b84)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b85))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b86))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b87))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b88))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b89)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b90))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b91))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b92))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b93))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b94)));
        b.add(new MyButton((Button) this.activity.findViewById(R.id.b95))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b96))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b97))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b98))); b.add(new MyButton((Button) this.activity.findViewById(R.id.b99)));
    }

    public int indexOf(Button button)
    {
        for(int i=0;i<b.size();i++)
            if(b.get(i).getButton().equals(button))
                return i;

        return -1;
    }

    public void setClickable(int index) {

        b.get(index).getButton().setBackgroundColor(Color.GREEN);
        b.get(index).setStatus(1);
    }

    public void setUnclickable(int index) {

        b.get(index).getButton().setBackgroundColor(Color.LTGRAY);
        b.get(index).setStatus(0);
    }

    protected void setClicked(int index) {

        b.get(index).getButton().setBackgroundColor(Color.CYAN);
        b.get(index).setStatus(2);
    }

    protected void setClick(int index) {

        b.get(index).getButton().setBackgroundColor(Color.MAGENTA);
        b.get(index).setStatus(2);
    }

    protected void setBlocked(int index) {

        b.get(index).getButton().setBackgroundColor(Color.GRAY);
        b.get(index).setStatus(2);
        b.get(index).getButton().setText("X");
    }

    protected void setFinish(int index) {

        b.get(index).getButton().setBackgroundColor(Color.RED);
        b.get(index).setStatus(0);
    }
}
