package com.jetbrains;
import com.jetbrains.management.transact;
import com.jetbrains.management.transfer;
import com.jetbrains.management.record;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AccountInfo extends JFrame
{
    JFrame infoFrame;
    JButton logout, transfer, transact, record;
    JLabel userShow, userId, emailShow, balanceShow, welcome;
    //JPanel infoPanel;
    private JLabel userCatch, userIdCatch, emailCatch, balanceCatch;

    public AccountInfo()
    {

    }
    public void showInfo(){
        //setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //infoPanel = new JPanel();
        infoFrame = new JFrame("Account");

        welcome = new JLabel("Start Using JelePay!");
        welcome.setFont(new Font("Georgia", Font.BOLD, 16));

        logout = new JButton("Logout");
        transfer = new JButton("Transfer");
        transact = new JButton("Transact");
        record = new JButton("Record");

        userShow = new JLabel("Username： ");
        userCatch = new JLabel("#########"); //get username from DB
        userId = new JLabel("User ID：");
        userIdCatch = new JLabel("12345");
        emailShow = new JLabel("Email：");
        emailCatch = new JLabel("#########");//get email from DB
        balanceShow = new JLabel("Balance：");
        balanceCatch = new JLabel("1000000000");//get balance from DB





        //infoPanel.setBounds(50,50,450,450);
        //infoPanel.setBackground(new Color(250,240,190));
        welcome.setBounds(150, 60, 200, 50);
        userShow.setBounds(80, 135, 100, 35);
        userCatch.setBounds(200, 135, 150, 35);
        userId.setBounds(80,185,100,35);
        userIdCatch.setBounds(200,185,100,35);
        emailShow.setBounds(80,235,100,35);
        emailCatch.setBounds(200,235,150,35);
        balanceShow.setBounds(80,285,75,35);
        balanceCatch.setBounds(200,285,100,35);
        transfer.setBounds(75,350,100,35);
        transact.setBounds(200,350,100,35);
        record.setBounds(325,350,100,35);






        logout.setBounds(425, 450, 100, 35);



        infoFrame.add(welcome);
        //infoFrame.add(infoPanel);
        infoFrame.add(userShow);
        infoFrame.add(userCatch);
        infoFrame.add(userId);
        infoFrame.add(userIdCatch);
        infoFrame.add(emailShow);
        infoFrame.add(emailCatch);
        infoFrame.add(logout);
        infoFrame.add(balanceShow);
        infoFrame.add(balanceCatch);
        infoFrame.add(transfer);
        infoFrame.add(transact);
        infoFrame.add(record);

        infoFrame.setSize(600, 600);
        infoFrame.setLayout(null);
        infoFrame.setVisible(true);


       setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);





       /*
       JLabel loginMessage = new JLabel("Welcome: " + u);
       loginMessage.setHorizontalAlignment(SwingConstants.CENTER);
       loginSuccess.getContentPane().add(loginMessage);
       */

       logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true) {
                    infoFrame.setVisible(false);
                    LoginGUI login = new LoginGUI();
                    login.createGUI();
                }
            }
        });

        transfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true) {

                }
            }
        });

        transact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true) {

                }
            }
        });

        record.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true) {
                    infoFrame.setVisible(false);
                    record check = new record();
                    check.recordTransaction();
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
