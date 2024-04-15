/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usave;

/**
 *
 * @author Phelembe Phetolo
 */
import java.util.Scanner;

public class Usave {

    public static void main(String[] args) {
        
   Scanner input=new Scanner(System.in);
   
    System.out.println("DISCOUNT SYSTEM");
    
    System.out.println("Enter username: ");
    
    int username=input.nextInt();
    
    System.out.println("Enter password");
    
    int password=input.nextInt();
    
    System.out.println("Enter Item Quantity");
    
    double Item_Quantity=input.nextInt();
    
    System.out.println("RECEIPT");
    
    double Item_Amount=10.00;
    
    double Total_Original_Amount=Item_Amount*Item_Quantity;
    double discount_percentage;
    //for salesperson
    if(Item_Quantity>=0&&Item_Quantity<=14&&username==1111){
        
        discount_percentage=2;
        double discount_amount=Total_Original_Amount*2/100;
        
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Amount: "+"R"+Item_Amount);
        
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);
        
        
    }
    else if (Item_Quantity>=15&&Item_Quantity<=20&&username==1111){
        discount_percentage=7;
        
        double discount_amount=Total_Original_Amount*7/100;
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);
        
        
    }
    else if(Item_Quantity>=21&&Item_Quantity<=30&&username==1111){
         discount_percentage=10;
        double discount_amount=Total_Original_Amount*10/100;
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);
        
    }
    else if(Item_Quantity>=31&&Item_Quantity<=40&&username==1111){
        discount_percentage=15;
        double discount_amount=Total_Original_Amount*15/100;
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);
    }
    else if(Item_Quantity>=41&&username==1111){
        discount_percentage=25;
        
        double discount_amount=Total_Original_Amount*25/100;
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);
       
    }
    //discount for student
   if(Item_Quantity>=0&&Item_Quantity<=14){
        
        discount_percentage=0;
        double discount_amount=Total_Original_Amount*0/100;
        
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Amount: "+"R"+Item_Amount);
        
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);}
  else if(Item_Quantity>=15&&Item_Quantity<=20){
        
        discount_percentage=5;
        double discount_amount=Total_Original_Amount*5/100;
        
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Amount: "+"R"+Item_Amount);
        
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);}
  
 else if(Item_Quantity>=21&&Item_Quantity<=30){
        
        discount_percentage=8;
        double discount_amount=Total_Original_Amount*8/100;
        
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Amount: "+"R"+Item_Amount);
        
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);}
   
  else if(Item_Quantity>=31&&Item_Quantity<=40){
        
        discount_percentage=12;
        double discount_amount=Total_Original_Amount*12/100;
        
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Amount: "+"R"+Item_Amount);
        
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);}
   
   if(Item_Quantity>=41){
        
        discount_percentage=20;
        double discount_amount=Total_Original_Amount*20/100;
        
        double discounted_amount=Total_Original_Amount-discount_amount;
        System.out.println("Item Amount: "+"R"+Item_Amount);
        
        System.out.println("Item Quantity: "+Item_Quantity);
        
        System.out.println("Total_Original_Amount: "+Total_Original_Amount);
        
        System.out.println("Discount percentage: "+discount_percentage);
        
        System.out.println("Discount Amount: "+discount_amount);
        
        System.out.println("Discounted Amount: "+discounted_amount);
        
        System.out.println("Total Amount: "+discounted_amount);}
    
       
  
    
}
    
}
