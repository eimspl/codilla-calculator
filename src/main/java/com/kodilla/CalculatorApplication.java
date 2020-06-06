package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(5,4);
        calculator.subtraction(3,4);
    }

}
