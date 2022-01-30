/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fop.tetris2.pkg0;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Border extends JPanel{
     private int width, height;
    private int squareWidth, squareHeight;
    private Color color;

    Border(int width, int height, int squareWidth, int squareHeight) {
        super();
        this.width = width;
        this.height = height;
        this.squareWidth = squareWidth;
        this.squareHeight = squareHeight;
        color = new Color(51,51,51);
        setBackground(color);
        this.setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
