package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm implements ActionListener {
    JFrame frame;
    JTextField textFieldNameAndLastName;
    JTextField textFieldFirstAddress;
    JTextField textFieldSecondAddress;
    JTextField textFieldAge;
    JTextField textFieldHeight;
    JTextField textFieldWeight;
   String name;
    String address1;
    String address2;
    Double age;
    Double height;
    Double weight1;


    public void setupAndShowFrame() {

        frame = new JFrame("SignUp Form");
        frame.setSize(420, 680);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);
    }

    public void createAndShowButtons() {
        //-----------------------------------------------
        //textfield Name and lastName


        textFieldNameAndLastName = new JTextField();
        textFieldNameAndLastName.setBounds(20, 60, 370, 40);
        frame.add(textFieldNameAndLastName);


        //-----------------------------------------------
        //textfield first address


        textFieldFirstAddress = new JTextField();
        textFieldFirstAddress.setBounds(20, 140, 370, 40);
        frame.add(textFieldFirstAddress);
//-----------------------------------------------
//textfield second address


        textFieldSecondAddress = new JTextField();
        textFieldSecondAddress.setBounds(20, 220, 370, 40);
        frame.add(textFieldSecondAddress);


//-----------------------------------------------
//textfield age


        textFieldAge = new JTextField();
        textFieldAge.setBounds(20, 300, 370, 40);
        frame.add(textFieldAge);


//-----------------------------------------------
//textfield height


        textFieldHeight = new JTextField();
        textFieldHeight.setBounds(20, 380, 370, 40);
        frame.add(textFieldHeight);


//-----------------------------------------------
//textfield weight

        textFieldWeight = new JTextField();
        textFieldWeight.setBounds(20, 460, 370, 40);
        frame.add(textFieldWeight);


        //-----------------------------------------------
        //button
        JButton buttonRegister = new JButton("ثبت نام");
        buttonRegister.setBounds(70, 540, 260, 50);
        frame.add(buttonRegister);

        buttonRegister.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        name = textFieldNameAndLastName.getText();
        textFieldNameAndLastName.setText("");
        if (name.length()<3){
            textFieldNameAndLastName.setText("error");
        } else {
            System.out.println("Name and Last Name is:" + name);
        }

        //------------
        address1 = textFieldFirstAddress.getText();
        if(textFieldFirstAddress.getText().equals(textFieldSecondAddress.getText())){
            textFieldFirstAddress.setText("error");
        }else {
            textFieldFirstAddress.setText("");
            System.out.println("First address is:" + address1);
        }
        //---------------
        address2 = textFieldSecondAddress.getText();
        if(textFieldSecondAddress.getText().equals(address1)){
            textFieldSecondAddress.setText("error");
        }else {
            textFieldSecondAddress.setText("");
            System.out.println("Second address is:" + address2);
        }
        //----------------------------

        age = Double.parseDouble(textFieldAge.getText());
        textFieldAge.setText("");
        if (age < 18) {
            textFieldAge.setText("error");
        } else {
            System.out.println("Candidate's Age is:" + age);
        }
        //----------------------------
        height = Double.parseDouble(textFieldHeight.getText());
        textFieldHeight.setText("");
        if (height < 100) {
            textFieldHeight.setText("error");
        } else {
            System.out.println("Candidate's height is:" + height);
        }
            //----------------------------------

            weight1 = Double.parseDouble(textFieldWeight.getText());
            textFieldWeight.setText("");
            if (weight1 < 40) {
                textFieldWeight.setText("error");
            } else {
                System.out.println("Candidate's weight is:" + weight1);
            }
            //---------------------------------

        }
    }
