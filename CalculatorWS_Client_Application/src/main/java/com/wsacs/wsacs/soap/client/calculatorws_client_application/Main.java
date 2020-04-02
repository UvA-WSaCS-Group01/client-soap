/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsacs.wsacs.soap.client.calculatorws_client_application;

/**
 *
 * @author stijn
 */
public class Main {
    public static void main(String args[]){
        double x = 10;
        double y = 3;
        
        System.out.println("Welcome to the JAX-WS calculator!");
        System.out.println("Chosen input is x " +x +", y " +y);
        System.out.println("----------------------------------------");        
        
        try{
            com.wsacs.wsacs.soap.web.calculator.CalculatorService_Service service = new com.wsacs.wsacs.soap.web.calculator.CalculatorService_Service();
            com.wsacs.wsacs.soap.web.calculator.CalculatorService port = service.getCalculatorServicePort();
            
            System.out.println("Addition: " +port.add(x, y));
            System.out.println("Substraction: " +port.sub(x, y));
            System.out.println("Multiplication: " +port.mul(x, y));
            System.out.println("Division: " +port.div(x, y));
        } catch(Exception e){
            // handle exception
            System.out.println("Failed to call service");
            System.out.println(e);
        }

    }
   
}
