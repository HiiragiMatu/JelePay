package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {
    JFrame loginFrame;
    JButton loginButton, signUpButton, exitButton;
    JLabel userInput, passInput, welcome;
    JTextField user, password, statusField;
    //JPanel mainPanel;

    LoginGUI() {
    }

    public void createGUI() {
        loginFrame = new JFrame("JelePay");

        welcome = new JLabel("Welcome to JelePay!");
        welcome.setFont(new Font("Georgia", Font.BOLD, 16));

        statusField = new JTextField();
        statusField.setHorizontalAlignment(JLabel.CENTER);
        statusField.setEditable(false);
        loginFrame.add(statusField);

        loginButton = new JButton("Login");
        signUpButton = new JButton("Sign Up");
        exitButton = new JButton("Exit  JelePay");

        statusField = new JTextField(20);

        userInput = new JLabel("Username：");
        user = new JTextField();

        passInput = new JLabel("Password：");
        password = new JPasswordField();

        //mainPanel = new JPanel(new GridLayout(2,3));


        //mainPanel.setBounds(150,100,500,500);
        //mainPanel.setBackground(Color.lightGray);

        /*mainPanel.add(welcome);
        mainPanel.add(userInput);
        mainPanel.add(user);
        mainPanel.add(passInput);
        mainPanel.add(password);
        mainPanel.add(loginButton);
        mainPanel.add(signUpButton);*/

        /*add(mainPanel, BorderLayout.CENTER);
        setTitle("Login Form");*/


        welcome.setBounds(180, 100, 200, 50);
        userInput.setBounds(125, 175, 100, 50);
        user.setBounds(200, 185, 175, 35);
        passInput.setBounds(125, 225, 100, 50);
        password.setBounds(200, 235, 175, 35);


        signUpButton.setBounds(300, 325, 100, 50);
        loginButton.setBounds(150, 325, 100, 50);
        exitButton.setBounds(400,450,150,30);

        loginFrame.add(welcome);
        loginFrame.add(userInput);
        loginFrame.add(user);
        loginFrame.add(passInput);
        loginFrame.add(password);
        loginFrame.add(signUpButton);
        loginFrame.add(loginButton);
        loginFrame.add(exitButton);


        //loginFrame.add(mainPanel);
        loginFrame.setSize(600, 600);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);

        //when loginButton is pressed.
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent login) {
                //statusField.setText("Authenticating.....");


                String u = user.getText();
                String p = password.getText();
                if (u.equals("admin") && p.equals("0000")) {

                    loginFrame.setVisible(false);
                    AccountInfo loginSuccess = new AccountInfo();
                    loginSuccess.showInfo();

                } else if("".equals(u) || "".equals(p)) {
                    JOptionPane.showMessageDialog(null,"The username or password cannot be blank.");
                } else { //get username and password from DB
                    JOptionPane.showMessageDialog(null, "The username or the password is incorrect");
                }
            }
        });

        //when signUpButton is pressed.
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent sign) {
                if (true) {
                    loginFrame.setVisible(false);
                    signUp signUpPage = new signUp();
                    signUpPage.createGUI();

                } else {
                    System.out.println("The Server is busy, please try again later.");
                    JOptionPane.showMessageDialog(null, "The Server is under maintenance.", "Error"
                            , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true) {
                    System.exit(0);
                }
            }
        });

    }

    public void actionPerformed(ActionEvent ae)
    {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.exit(0);
        }

    }
}



