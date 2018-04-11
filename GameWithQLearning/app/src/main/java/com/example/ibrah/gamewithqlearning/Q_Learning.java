package com.example.ibrah.gamewithqlearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Q_Learning {

    private double[][] r,q;
    double gamma = 0.8,lw = 0.5;

    private ButtonList bList;
    private FindClickable findClickable;

    private void init(){

        //Ödül değerlerim, sadece bitiş noktasına değil ona bir adım olan uzaklıklara da az da olsa puan verdim

        r = new double[100][100];
        r[0][0] = 100;
        r[3][0] = 100;
        r[22][0] = 100;
        r[30][0] = 100;
/*
        r[0][3] = 20;
        r[6][3] = 20;
        r[25][3] = 20;
        r[33][3] = 20;
        r[21][3] = 20;

        r[0][22] = 20;
        r[4][22] = 20;
        r[25][22] = 20;
        r[44][22] = 20;
        r[52][22] = 20;
        r[40][22] = 20;

        r[0][30] = 20;
        r[12][30] = 20;
        r[33][30] = 20;
        r[52][30] = 20;
        r[60][30] = 20;
*/

        q = new double[100][100];

        findClickable = new FindClickable(bList);
    }

    Q_Learning(ButtonList buttonList){

        bList = buttonList;
        init();
    }

    //gelen değer kadar iterasyon ile öğretme işlemi yapan fonksiyon
    void learn(long times){

        Random random = new Random();
        ArrayList<Integer> clickable;

        for (long k=0;k<times;k++){

            int i = random.nextInt(100);

            clickable = findClickable.find(i);

            if(clickable.size() > 0){

                int j = clickable.size()-1;
                learnOneTime(i, clickable.get(j));
            }
        }

        //lw /= lw+0.1;

    }

    //bir iterasyonluk öğrenme
    private void learnOneTime(int i, int j){

        double max = 0;

        ArrayList<Integer> clickable;

        clickable = findClickable.find(j);
        //Collections.shuffle(clickable);

        for (Integer index: clickable) {

            if(q[j][index] >= max)
                max = q[j][index];
        }

        q[i][j] = q[i][j] + lw * (r[i][j] + gamma * max - q[i][j]);
    }

    //burada q matrisindeki verilere bakarak algoritmanın oyunu oynamasını sağlıyorum
    int play(int index, ArrayList<Integer> clickable){

        double max = 0;
        int maxIndex = 0;

        for (Integer clickable_index: clickable) {

            if(q[index][clickable_index] >= max){

                maxIndex = clickable_index;
                max = q[index][clickable_index];
            }
        }
        return maxIndex;
    }
}
