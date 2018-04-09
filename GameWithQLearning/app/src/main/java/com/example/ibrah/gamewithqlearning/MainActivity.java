package com.example.ibrah.gamewithqlearning;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {

    Button bt_newGame,bt_qGame,button,bt_L100,bt_L1000,bt_L10000;
    TextView tv_steps,tv_status;

    int steps,i,finish_index=0,old_button_index;
    boolean isEndGame = false;

    ButtonList bList;
    ArrayList<Integer> clickableList;
    Q_Learning qlearning;
    FindClickable findClickable;

    private void init() {

        bList = new ButtonList(this);
        clickableList = new ArrayList<>();

        bt_newGame = findViewById(R.id.btn_newGame);
        bt_qGame = findViewById(R.id.btn_qPlay);
        bt_L100 = findViewById(R.id.btn_L100);
        bt_L1000 = findViewById(R.id.btn_L1000);
        bt_L10000 = findViewById(R.id.btn_L10000);
        tv_steps = findViewById(R.id.tv_steps);
        tv_status = findViewById(R.id.tv_status);

        qlearning = new Q_Learning(bList);
        findClickable = new FindClickable(bList);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        newGame_onClick(new View(this));
    }

    //Kazanma durumu
    private void endWon() {

        //Toast.makeText(this," Tebrikler sonuca ulaştınız ",Toast.LENGTH_SHORT).show();
        tv_status.setText(R.string.status_won);
        tv_status.setTextColor(Color.BLUE);
        isEndGame = true;
    }

    //Kaybetme durumu
    private void endLost() {

        //Toast.makeText(this,"Üzgünüz kazanma şansınız kalmadı ",Toast.LENGTH_SHORT).show();
        tv_status.setText(R.string.status_lost);
        tv_status.setTextColor(Color.RED);
        isEndGame = true;
    }

    @SuppressLint("DefaultLocale")
    public void button_onClick(View view) {

        button = (Button) view;


        if(bList.b.get(bList.indexOf((Button) view)).getStatus() == 1)
        {
            steps++;

            button.setText(String.valueOf(steps));
            tv_steps.setText(String.format("%02d",steps));

            if(bList.b.get(3).getStatus() == 2 && bList.b.get(22).getStatus() == 2 && bList.b.get(30).getStatus() == 2 && steps != 1)
                endLost();

            for(i=0;i<clickableList.size();i++) {

                if(clickableList.get(i) == finish_index)
                    bList.b.get(finish_index).setStatus(0);
                else
                    bList.setUnclickable(clickableList.get(i));
            }

            clickableList.clear();
            bList.setClick(bList.indexOf(button));

            if(old_button_index != -1)
                bList.setClicked(old_button_index);

            if(button == bList.b.get(finish_index).getButton())
                endWon();
            else
            {
                findClickable(bList.indexOf((Button) view));

                if(clickableList.size() == 0)
                    endLost();

                old_button_index = bList.indexOf(button);
            }
        }
    }

    //tıklanabilir butanların atamasını yapan fonksiyon
    private void findClickable(int index) {

        clickableList = findClickable.find(index);

        for(i=0;i<clickableList.size();i++){

            if(clickableList.get(i) == finish_index)
                bList.b.get(finish_index).setStatus(1);
            else
                bList.setClickable(clickableList.get(i));
        }
    }

    //Oyunu yeniden başlatan fonksiyon
    public void newGame_onClick(View view) {

        isEndGame = false;
        old_button_index = -1;

        for(i=0;i<bList.b.size();i++)
        {
            bList.setUnclickable(i);
            bList.b.get(i).getButton().setText("  ");
        }

        bList.setClickable(99);
        bList.setFinish(finish_index);

        bList.setBlocked(2);
        bList.setBlocked(5);
        //bList.setBlocked(6);
        bList.setBlocked(12);
        bList.setBlocked(15);
        bList.setBlocked(19);
        bList.setBlocked(22);
        //bList.setBlocked(25);
        bList.setBlocked(27);
        bList.setBlocked(34);
        bList.setBlocked(41);
        bList.setBlocked(43);
        bList.setBlocked(57);
        bList.setBlocked(58);
        bList.setBlocked(63);
        bList.setBlocked(65);
        bList.setBlocked(66);
        //bList.setBlocked(69);
        bList.setBlocked(70);
        bList.setBlocked(71);
        bList.setBlocked(76);
        bList.setBlocked(84);
        bList.setBlocked(87);
        bList.setBlocked(92);
        bList.setBlocked(95);

        steps = 0;
        tv_steps.setText(String.valueOf(steps));
        bList.b.get(99).getButton().setText(String.valueOf(steps));

        tv_status.setText(R.string.status_continues);
        tv_status.setTextColor(Color.GREEN);

        button_onClick((bList.b.get(99).getButton()));
    }

    //Q-Learningin'e oyunu oynatan fonksiyon
    public void qPlay_onClick(View view) {

        int index,index_temp=99;

        while(!isEndGame){

            index = qlearning.play(index_temp,clickableList);
            button_onClick((bList.b.get(index).getButton()));
            index_temp = index;
        }
    }

    //tiklana butanın sayisi kadar öğrenme yaptıran fonksiyon
    public void learn_onClick(View view) {

        button = (Button) view;

        qlearning.learn(Long.valueOf(String.valueOf(button.getText())));

        Toast.makeText(this,"Iteration is completed",Toast.LENGTH_SHORT).show();
    }

    //Q-Learningini dolayısı ile Q-Learningin arkasındaki öğrenme matrisini sıfırlayan fonksiyon
    public void newQ_onClick(View view) {

        qlearning = new Q_Learning(bList);
    }

    public void exit_onClick(View view) {
        finish();
    }
}
