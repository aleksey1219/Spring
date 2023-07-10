package com.example.calkylato;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public  class CalculatorServiceImpl implements CalculatorService {
    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public int sum( int num1, int num2) {

        return num1+num2;
    }

    public int min(int num1, int num2) {

        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;

    }
    public double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}

