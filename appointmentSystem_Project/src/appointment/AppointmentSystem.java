package appointment;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AppointmentSystem {

    public static void main(String[] args) {

        Appointment A1 = new Appointment("jim","",23,0851413388);
        Appointment A2 = new Appointment("joe","",18,0851493388);
        Appointment A3 = new Appointment("jill","",34,0851416788);
        Appointment A4 = new Appointment("janet","",64,0851413558);
        Appointment A5 = new Appointment("tim","",89,0851423388);

        Appointment allAppointments[] = {A1,A2,A3,A4,A5};



        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,10);
        textArea.setFont(font);


        String output = "";

        output += "Name: " + allAppointments.getName() + "\nID: " + allAppointments.getId() +
                "\nAge : " + allAppointments.getAge() + "\nDate of birth:" + allAppointments.getDOB() +
                "\nPPSN " + allAppointments.PPSN() + " Phone" + String.format("patient information");

        output += String.format("appointment Number","Appointment Description","Doctor");

        textArea.append(output);

        JOptionPane.showInputDialog(null, " Which appointment would you like to view?");

        JOptionPane.showMessageDialog(null, "showing appointment - details  are as follows: \n"
                , "PLaying track", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,textArea,"appointment Information",JOptionPane.INFORMATION_MESSAGE);













        System.exit(0);


    }
}



    //start time , end time , set date , description

