package com.jetbrains;
import com.jetbrains.validators.emailValidator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class signUp extends JFrame {
    JFrame signFrame;
    JButton submitButton,backButton;
    JLabel userInput, passInput, emailInput,cEmailInput, cPasswordInput,welcome;
    JTextField user, password, cPassword, email, cEmail;

    signUp()
    {

    }
    public void createGUI(){
        //setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        signFrame = new JFrame("Sign Up");

        welcome = new JLabel("Sign up your account here!");
        welcome.setFont(new Font("Georgia", Font.BOLD, 16));

        submitButton = new JButton("Submit");
        backButton = new JButton("Back");

        userInput = new JLabel("Username： ");
        user = new JTextField();

        passInput = new JLabel("Password： ");
        password = new JTextField();
        cPasswordInput = new JLabel("Confirm Password：");
        cPassword = new JTextField();



        emailInput = new JLabel("Email： ");
        email = new JTextField();
        cEmailInput = new JLabel("Confirm Email： ");
        cEmail = new JFormattedTextField();

        welcome.setBounds(175, 60, 250, 50);
        userInput.setBounds(125, 125, 100, 50);
        user.setBounds(200, 135, 175, 35);
        passInput.setBounds(125, 175, 100, 50);
        password.setBounds(200, 185, 175, 35);
        cPasswordInput.setBounds(75,225,150,50);
        cPassword.setBounds(200,235,175,35);
        emailInput.setBounds(150, 275, 100, 50);
        email.setBounds(200, 285, 175, 35);
        cEmailInput.setBounds(105, 325, 100, 50);
        cEmail.setBounds(200, 335, 175, 35);


        submitButton.setBounds(220, 450, 125, 50);
        backButton.setBounds(400, 450, 125, 50);


        signFrame.add(welcome);
        signFrame.add(userInput);
        signFrame.add(user);
        signFrame.add(passInput);
        signFrame.add(password);
        signFrame.add(cPasswordInput);
        signFrame.add(cPassword);
        signFrame.add(emailInput);
        signFrame.add(email);
        signFrame.add(cEmailInput);
        signFrame.add(cEmail);
        signFrame.add(submitButton);
        signFrame.add(backButton);

        signFrame.setSize(600, 600);
        signFrame.setLayout(null);
        signFrame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emailValidator ev = new emailValidator(); //verify the fields here.
                if("".equals(user.getText())) //check blank
                {
                    JOptionPane.showMessageDialog(null, "The username cannot be blank!");
                } else if(("".equals(password.getText()) || "".equals(cPassword.getText())))
                {
                    JOptionPane.showMessageDialog(null, "The password or confirm password cannot be blank!");
                } else if(!password.getText().equals(cPassword.getText())) //check corresponding
                {
                    JOptionPane.showMessageDialog(null,"The password doesn't correspond.");
                } else if (!ev.validate(email.getText().trim()) || (!email.getText().equals(cEmail.getText())))
                {
                    {
                        JOptionPane.showMessageDialog(null, "The email format is incorrect or " +
                                        "the email doesn't correspond.", "Error"
                                , JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true) {
                    signFrame.setVisible(false);
                    LoginGUI login = new LoginGUI();
                    login.createGUI();
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
