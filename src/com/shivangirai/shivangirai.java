package com.shivangirai;
import javax.swing.*;
public class shivangirai {
    //User Details
    String firstName;
    String lastName;
    int hours;
    int days;
    int boxes;
    String packagee;
    String optionSize;
    String boxSize;

    //Costs to be calculated
    int serviceCost;
    double optionCost;
    double itemsCost;
    double totalCost;
    public shivangirai(String firstName, String lastName, int hours, int days, int boxes, String packagee, String optionSize, String boxSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
        this.days = days;
        this.boxes = boxes;
        this.packagee = packagee;
        this.optionSize = optionSize;
        this.boxSize = boxSize;
    }

    public void showServiceCost()
    {
        if(packagee.equalsIgnoreCase("A"))
        {
            this.serviceCost=this.hours*100;
        }
        else
        if(packagee.equalsIgnoreCase("B"))
        {
            this.serviceCost=this.hours*150;
        }
        JOptionPane.showMessageDialog(null, this.firstName+" your service cost is $"+this.serviceCost);
    }
    public void showOptionCost()
    {
        if(optionSize.equalsIgnoreCase("small"))
        {
            this.optionCost=this.days*8;
        }
        else
        if(optionSize.equalsIgnoreCase("large"))
        {
            this.optionCost=this.days*20.11;
        }
        JOptionPane.showMessageDialog(null, this.firstName+" your option cost is $"+this.optionCost);

    }

    public void showItemCost()
    {
        if(boxSize.equalsIgnoreCase("small"))
        {
            this.itemsCost=this.boxes*2.50;
        }
        else
        if(boxSize.equalsIgnoreCase("large"))
        {
            this.itemsCost=this.boxes*4.50;
        }
        JOptionPane.showMessageDialog(null, this.firstName+" your item cost is $"+this.itemsCost);
    }

    public void showTotalCost()
    {
        this.totalCost=this.serviceCost+this.optionCost+this.itemsCost;
        JOptionPane.showMessageDialog(null, this.firstName+" your total cost is $"+this.totalCost);
    }


}
 class Main
{
    public static void main(String... args)
    {
        String id="Admin";
        String pass="Admin";
        JTextField uId = new JTextField(10);
        JTextField uPass = new JTextField(10);
        JTextField firstName = new JTextField(10);
        JTextField lastName = new JTextField(10);
        JTextField hours = new JTextField(10);
        JTextField days = new JTextField(10);
        JTextField boxes = new JTextField(10);
        JTextField packagee = new JTextField(10);
        JTextField optionSize = new JTextField(10);
        JTextField boxSize = new JTextField(10);

        int attemptNum=0;
        int attemptLeft=3;
        Object[] detail = {
                "Id: ", uId,
                "Password: ", uPass
        };



        while(attemptNum<2)
        {
            JOptionPane.showMessageDialog(null, detail, "Login", JOptionPane.PLAIN_MESSAGE);
            if (uId.getText().equals(id) && uPass.getText().equals(pass)) {
                JOptionPane.showMessageDialog(null, "Hey welcome back, You can now proceed to enter inputs to check the costs", "Login", JOptionPane.PLAIN_MESSAGE);

                break;
            }
            else
            {
                uId.setText("");
                uPass.setText("");
                attemptNum++;
                attemptLeft--;
                if (attemptLeft != 0){
                    JOptionPane.showMessageDialog(null, "You have only" + attemptLeft + " left", "Warning", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
        if (attemptNum == 3) {
            JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye.", "Sorry", JOptionPane.PLAIN_MESSAGE);
        }

        Object[] userDetails = {
                "First Name: ",firstName,
                "Last Name: ",lastName,
                "Hours: ",hours,
                "Days: ",days,
                "No. of boxes: ",boxes,
                "Package (A or B): ",packagee,
                "Option Size (Small or large): ",optionSize,
                "Box Size(Small or large): ",boxSize
        };

        JOptionPane.showMessageDialog(null, userDetails, "Login", JOptionPane.PLAIN_MESSAGE);
        String firstName1=firstName.getText();
        String lastName1=lastName.getText();
        int hours1=Integer.parseInt(hours.getText());
        int days1=Integer.parseInt(days.getText());
        int boxes1=Integer.parseInt(boxes.getText());
        String packagee1=packagee.getText();
        String optionSize1=optionSize.getText();
        String boxSize1=boxSize.getText();
        shivangirai ob=new shivangirai(firstName1,lastName1,hours1,days1,boxes1,packagee1,optionSize1,boxSize1);
        ob.showServiceCost();
        ob.showOptionCost();
        ob.showItemCost();
        ob.showTotalCost();
        JOptionPane.showMessageDialog(null, firstName1+" thankyou have a nice day!!");
    }
}

