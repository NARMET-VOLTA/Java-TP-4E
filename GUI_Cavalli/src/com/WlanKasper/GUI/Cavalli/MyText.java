package com.WlanKasper.GUI.Cavalli;

import javax.swing.*;
import java.awt.*;

public class MyText extends JTextField {

    public MyText(String str){
        this.setText(str);
        this.setBounds(CENTER, CENTER, CENTER, CENTER);
        this.setSelectedTextColor(Color.BLACK);
    }

    public void changeText(String str){
        this.setText(str);
    }

    public void visualiseText(){
        this.setBounds(1, CENTER, CENTER, CENTER);
    }
}
