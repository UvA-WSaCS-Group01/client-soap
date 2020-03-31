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
        int x = 10;
        int y = 2;
        
        System.out.println("Welcome to the JAX-WS calculator!");
        System.out.println("Chosen input is x " +x +", y " +y);
        System.out.println("----------------------------------------");        
        
        try{
            com.wsacs.wsacs.soap.web.calculator.CalculatorService_Service service = new com.wsacs.wsacs.soap.web.calculator.CalculatorService_Service();
            com.wsacs.wsacs.soap.web.calculator.CalculatorService port = service.getCalculatorServicePort();
            
            System.out.println("ADD: " +port.add(x, y));
            System.out.println("MIN: " +port.min(x, y));
            System.out.println("MUL: " +port.mul(x, y));
            System.out.println("DIV: " +port.div(x, y));
        } catch(Exception e){
            // handle exception
        }

    }
   
}
