package com.WlanKasper.GUI.Cavalli;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel{

//    Border border = BorderFactory.createLineBorder(Color.BLUE, 1);

    public static final int LABEL_WIDTH  = 150;
    public static final int LABEL_HEIGHT = 150;

    private int positionX = 0;

    public MyLabel (String name) {
        this.setText(name);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalTextPosition(TOP);
        this.setLayout(new BorderLayout());
        this.setVerticalAlignment(CENTER);
        this.setHorizontalAlignment(LEFT);
    }

    public ImageIcon scaleImage (ImageIcon image, int size){
        Image imScale = image.getImage().getScaledInstance(size,size,size);
        return new ImageIcon(imScale);
    }

    public void setImageHorse () {
        ImageIcon imageHorse = scaleImage(new ImageIcon("GUI_Cavalli/img/horse.png"),100 );
        this.setIcon(imageHorse);
    }

    public void moveHorse(){
        positionX+=10;
        this.setBounds(positionX, 0, LABEL_WIDTH, LABEL_HEIGHT);
    }

    public void setHorsePosition (){
        this.setBounds(positionX, 0, LABEL_WIDTH, LABEL_HEIGHT);
    }
    public void setPosition (){
        this.setBounds(CENTER, CENTER, CENTER, CENTER);
    }

}
