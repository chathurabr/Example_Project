package com.examples.exetel;

import org.testng.annotations.Test;

import javax.swing.*;

/**
 * Created by Chathura on 1/5/2017.
 */
public class CreditbalaceTest {
    String Newbalance;
    JTextField jtfText1 = new JTextField(20);
    Creditbalace creditbalace = new Creditbalace(50);

    @Test(priority = 1)
    public void checkbalance(){

        creditbalace.withdraw(10);
        System.out.println(creditbalace.getBalance());

        jtfText1.setText(creditbalace.getBalance()+"");
       // System.out.println(jtfText1.getText());
        Newbalance = jtfText1.getText();
    }
@Test(priority = 2)
    public String getNewbalance(){
        return Newbalance;
    }

    @Test(priority = 3)
    public void balaceafretdeduct(){
            double Newbalance2 = Double.parseDouble(Newbalance);
            Newbalance2 = Newbalance2 - 1.5;
        System.out.println(Newbalance2);

        }


}
