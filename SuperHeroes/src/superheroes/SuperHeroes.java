/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superheroes;
import acm.program.*;
import acm.io.*;
import acm.graphics.*;
import java.awt.*;

/**
 *
 * @author Emily
 */
public class SuperHeroes extends GraphicsProgram {
    
    public void run() {
        GRect firstHeroTorso = new GRect(150, 150, 200, 200);
        firstHeroTorso.setFilled(true);
        firstHeroTorso.setColor(Color.GREEN); 
        add(firstHeroTorso);
        
        GRect firstHeroLeg1 = new GRect(150, 250, 50, 200);
        firstHeroLeg1.setFilled(true);
        firstHeroLeg1.setColor(Color.GREEN);
        add(firstHeroLeg1);
        
        GRect firstHeroLeg2 = new GRect(300, 250, 50, 200);
        firstHeroLeg2.setFilled(true);
        firstHeroLeg2.setColor(Color.GREEN);
        add(firstHeroLeg2);
        
        GRect firstHeroPant1 = new GRect(150, 300, 50, 100);
        firstHeroPant1.setFilled(true);
        firstHeroPant1.setColor(Color.MAGENTA);
        add(firstHeroPant1);
        
        GRect firstHeroPant2 = new GRect(300, 300, 50, 100);
        firstHeroPant2.setFilled(true);
        firstHeroPant2.setColor(Color.MAGENTA);
        add(firstHeroPant2);
        
        GRect firstHeroPant3 = new GRect(200, 300, 100, 50);
        firstHeroPant3.setFilled(true);
        firstHeroPant3.setColor(Color.MAGENTA);
        add(firstHeroPant3);
        
        GOval firstHeroHead = new GOval(225, 100, 50, 50);
        firstHeroHead.setFilled(true);
        firstHeroHead.setColor(Color.GREEN);
        add(firstHeroHead);
        
        GRect firstHeroArm1 = new GRect(50, 150, 100, 50);
        firstHeroArm1.setFilled(true);
        firstHeroArm1.setColor(Color.GREEN);
        add(firstHeroArm1);
        
        GRect firstHeroArm2 = new GRect(350, 150, 100, 50);
        firstHeroArm2.setFilled(true);
        firstHeroArm2.setColor(Color.GREEN);
        add(firstHeroArm2);
        
        
        GLine secondHeroCape1 = new GLine(550, 150, 500, 250);
        secondHeroCape1.setColor(Color.BLUE);
        add(secondHeroCape1);
        
        GLine secondHeroCape2 = new GLine(500, 250, 675, 250);
        secondHeroCape2.setColor(Color.BLUE);
        add(secondHeroCape2);
        
        GLine secondHeroCape3 = new GLine(675, 250, 625, 150);
        secondHeroCape3.setColor(Color.BLUE);
        add(secondHeroCape3);
        
        GRect secondHeroTorso = new GRect(550, 150, 75, 150);
        secondHeroTorso.setFilled(true);
        secondHeroTorso.setColor(Color.GRAY); 
        add(secondHeroTorso);
        
        GRect secondHeroLeg1 = new GRect(550, 300, 25, 150);
        secondHeroLeg1.setFilled(true);
        secondHeroLeg1.setColor(Color.GRAY);
        add(secondHeroLeg1);
        
        GRect secondHeroLeg2 = new GRect(600, 300, 25, 150);
        secondHeroLeg2.setFilled(true);
        secondHeroLeg2.setColor(Color.GRAY);
        add(secondHeroLeg2);
        
        GRect secondHeroBoot1 = new GRect(550, 375, 25, 75);
        secondHeroBoot1.setFilled(true);
        secondHeroBoot1.setColor(Color.BLUE);
        add(secondHeroBoot1);
        
        GRect secondHeroBoot2 = new GRect(600, 375, 25, 75);
        secondHeroBoot2.setFilled(true);
        secondHeroBoot2.setColor(Color.BLUE);
        add(secondHeroBoot2);
        
        GRect secondHeroShorts = new GRect(550, 260, 75, 40);
        secondHeroShorts.setFilled(true);
        secondHeroShorts.setColor(Color.BLUE);
        add(secondHeroShorts);
        
        GOval secondHeroHead = new GOval(565, 100, 50, 50);
        secondHeroHead.setFilled(true);
        secondHeroHead.setColor(Color.LIGHT_GRAY);
        add(secondHeroHead);
        
        IODialog dialog = getDialog();
        String firstName = dialog.readLine("Guess who is the first super-hero? (Hint: begins with H) ");
        String secondName = dialog.readLine("Guess who is the second super-hero? (Hint: begins with B) ");
        GLabel firstLabel = new GLabel(firstName,150,450);
        add(firstLabel);
        GLabel secondLabel = new GLabel(secondName,400,450);
        add(secondLabel);
        dialog.println("I hope you like my drawings!"); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SuperHeroes ().start(args);
        // TODO code application logic here
    }
    
}
 