/**
 * This program is an exploration in Java GUI by programming a
 * simple mortgage calculator.
 *
 * NOTE: Program is still under construction 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * MORTGAGE CALCULATOR CLASS
 *
 */
public class MortgageCalc
{
   JFrame mFrame;
   JPanel mPanel;
   JTextField mFieldAmt;
   JTextField mFieldApr;
   JTextField mFieldTerm;

   /**
    * MAIN
    */
   public static void main(String[] args)
   {
      new MortgageCalc().buildCalc();
   }

   /**
    * BUILD CALCULATOR
    */
   public void buildCalc()
   {
      mFrame = new JFrame("Mortgage Calculator");
      mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      mPanel = new JPanel();
     
      mFieldAmt = new JTextField(12);
      mFieldAmt.setText("Mortgage Amount");
      mFieldApr = new JTextField(12);
      mFieldApr.setText("APR");
      mFieldTerm = new JTextField(12);
      mFieldTerm.setText("Term (in years)");
      
      mPanel.add(mFieldAmt);
      mPanel.add(mFieldApr);
      mPanel.add(mFieldTerm);     
      mFrame.getContentPane().add(BorderLayout.CENTER, mPanel);
      
      //JButton open = new JButton("Calculate Mortgage");
      //open.addActionListener(new CalcListener());
      mFrame.setVisible(true);
      mFrame.setSize(500, 200);
   }

   class CalcListner implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         //calculate mortgage
      }          
   }

   
}