package com.jetbrains;
import javax.swing.*;


public class Main {

    public static void main(String[] args){

        {
            try {
                /*LoginGUI login = new LoginGUI();
                login.createGUI();*/
                /*signUp sign = new signUp();
                sign.createGUI();*/
                AccountInfo info = new AccountInfo();
                info.showInfo();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }
}
