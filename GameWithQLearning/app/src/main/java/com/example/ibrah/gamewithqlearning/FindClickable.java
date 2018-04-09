package com.example.ibrah.gamewithqlearning;

import java.util.ArrayList;
import java.util.Collections;

//Tiklanabilir butanları bulan sınıf
public class FindClickable {

    private ButtonList bList;

    FindClickable(ButtonList buttonList){

        bList = buttonList;
    }

    ArrayList<Integer> find(int index) {

        ArrayList<Integer> clickableList = new ArrayList<>();

        if(index >= 30 && bList.b.get(index-30).getStatus() != 2)  clickableList.add(index-30);
        if(index%10 <= 6 && bList.b.get(index+3).getStatus() != 2)    clickableList.add(index+3);
        if(index < 70 && bList.b.get(index+30).getStatus() != 2)   clickableList.add(index+30);
        if(index%10 >= 3 && bList.b.get(index-3).getStatus() != 2)    clickableList.add(index-3);

        if(index%10 <= 7)
        {
            if(index >= 20 && bList.b.get(index-18).getStatus() != 2)
                clickableList.add(index-18);
            if(index < 80 && bList.b.get(index+22).getStatus() != 2)
                clickableList.add(index+22);
        }
        if(index%10 >= 2)
        {
            if(index < 80 && bList.b.get(index+18).getStatus() != 2)
                clickableList.add(index+18);
            if(index >= 20 && bList.b.get(index-22).getStatus() != 2)
                clickableList.add(index-22);
        }


        Collections.shuffle(clickableList);

        return clickableList;
    }

}
