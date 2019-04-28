package com.jetbrains.management;
import com.jetbrains.AccountInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class record extends JFrame {
    JFrame recordFrame;
    JButton backButton;
    JLabel userShow, userId, balanceShow, welcome;
    JLabel user2Show, user2Id;
    JLabel status, action, statusCheck, actionCheck, billShow, billAmount;

    private JLabel userCatch, userIdCatch, balanceCatch;
    private JLabel user2Catch, user2IdCatch;



    public record() {

    }

    public void recordTransaction() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        recordFrame = new JFrame("Transaction Record");

        welcome = new JLabel("Your Transaction Record");
        welcome.setFont(new Font("Georgia", Font.BOLD, 16));



        backButton = new JButton("Back");

        //user1 info and catch from DB
        userShow = new JLabel("Username： ");
        userCatch = new JLabel("#########");
        userId = new JLabel("User ID：");
        userIdCatch = new JLabel("12345");
        balanceShow = new JLabel("Balance：");
        balanceCatch = new JLabel("1000000000");

        //user2 info and catch from DB
        user2Show = new JLabel("Username2：");
        user2Catch = new JLabel("@@@@@@");
        user2Id = new JLabel("User2 ID：");
        user2IdCatch = new JLabel("54321");

        //infoPanel.setBounds(50,50,450,450);
        //infoPanel.setBackground(new Color(250,240,190));
        welcome.setBounds(170, 60, 250, 50);

        //user1 info set
        userShow.setBounds(40, 135, 100, 35);
        userCatch.setBounds(180, 135, 150, 35);
        userId.setBounds(40, 185, 100,35);
        userIdCatch.setBounds(180,185,100,35);


        recordFrame.add(userShow);
        recordFrame.add(userCatch);
        recordFrame.add(userId);
        recordFrame.add(userIdCatch);

        //user2 info set
        user2Show.setBounds(300,135,100,35);
        user2Catch.setBounds(450,135,100,35);
        user2Id.setBounds(300,185,100,35);
        user2IdCatch.setBounds(450,185,100,35);

        recordFrame.add(user2Show);
        recordFrame.add(user2Catch);
        recordFrame.add(user2Id);
        recordFrame.add(user2IdCatch);





        //record status and action
        status = new JLabel("Status：");
        statusCheck = new JLabel("Success or not");
        action = new JLabel("Account Action：");
        actionCheck = new JLabel("Pay/Collect or Transfer with bank");
        billShow = new JLabel("Total：");
        billAmount = new JLabel("$50");


        status.setBounds(40, 300,200,35);
        statusCheck.setBounds(250,300,200,35);
        action.setBounds(40,350,200,35);
        actionCheck.setBounds(250,350,200,35);
        billShow.setBounds(40,400,200,35);
        billAmount.setBounds(250,400,200,35);


        recordFrame.add(status);
        recordFrame.add(statusCheck);
        recordFrame.add(action);
        recordFrame.add(actionCheck);
        recordFrame.add(billShow);
        recordFrame.add(billAmount);


        balanceShow.setBounds(40, 250, 100, 35);
        balanceCatch.setBounds(250, 250, 150, 35);

        //infoFrame.add(infoPanel);

        backButton.setBounds(425, 450, 100, 35);
        recordFrame.add(welcome);
        recordFrame.add(backButton);
        recordFrame.add(balanceShow);
        recordFrame.add(balanceCatch);




        recordFrame.setSize(600, 600);
        recordFrame.setLayout(null);
        recordFrame.setVisible(true);


        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true) {
                    recordFrame.setVisible(false);
                    AccountInfo accountInfo = new AccountInfo();
                    accountInfo.showInfo();
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


