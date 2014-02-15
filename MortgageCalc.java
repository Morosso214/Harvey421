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
   JPanel mPanelAmt;
   JPanel mPanelApr;
   JPanel mPanelTerm;
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
            
      mPanelAmt = new JPanel();
      mPanelAmt.add(new Label("Total amount:"));
      mFieldAmt = new JTextField(12);

      mPanelApr = new JPanel();
      mPanelApr.add(new Label("APR:"));
      mFieldApr = new JTextField(12);

      mPanelTerm = new JPanel();
      mPanelTerm.add(new Label("Term (in years):"));
      mFieldTerm = new JTextField(12);
      
      mPanelAmt.add(mFieldAmt);
      mPanelApr.add(mFieldApr);
      mPanelTerm.add(mFieldTerm);     

      mFrame.getContentPane().add(BorderLayout.WEST, mPanelAmt);
      mFrame.getContentPane().add(BorderLayout.CENTER, mPanelApr);
      mFrame.getContentPane().add(BorderLayout.EAST, mPanelTerm);
      
      
      //JButton open = new JButton("Calculate Mortgage");
      //open.addActionListener(new CalcListener());
      mFrame.setVisible(true);
      mFrame.setSize(750, 150);
   }

   class CalcListner implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         //calculate mortgage
      }          
   }

   
}