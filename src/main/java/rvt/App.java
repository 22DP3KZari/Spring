package rvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        printMoneyOutcomes();
    }
    public static void printMoneyOutcomes(){
        Money macins1 = new Money(10, 0);
        Money macins2 = new Money(5, 0);
    
        Money sum = macins1.plus(macins2);
        System.out.println("Macins 1 + Macins 2 = " + sum);
    
        Money difference = macins1.minus(macins2);
        System.out.println("Macins 1 - Macins 2 = " + difference);
    }
}