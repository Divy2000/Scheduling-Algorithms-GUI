/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author divyp
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*; 

public class animation{

 public static void main(String[] args){
  java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new DrawLine(150,300,350,300));
      frame.setSize(500,500);
      frame.setVisible(true);  
    }
  });  
 } 
}

class DrawLine extends JPanel implements ActionListener{

  int x1;
  int y1;
  int x2;
  int y2;
  int midx;
  int midy;

  Timer time = new Timer(100, (ActionListener) this);

  public DrawLine(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    midx = (x1+x2)/2;
    midy = (y1+y2)/2;
    time.start();
  }

  public void animateLine(Graphics2D g){
    g.drawLine(x1,y1,midx,midy);
    g.drawLine(x2,y2,midx,midy);
  }
  @Override
  public void actionPerformed(ActionEvent arg0) {
    if(midy>123){
      midy--;
      repaint();
    }
  }

  @Override
  public void paintComponent(Graphics newG){
    super.paintComponent(newG);
    Graphics2D g2d = (Graphics2D)newG;
    animateLine(g2d);
  }
}
