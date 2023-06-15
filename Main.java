package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import javax.xml.ws.soap.Addressing;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i < 20; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i%5==0) {
                System.out.println("Buzz");

                } else {
                    System.out.println(i);
                }
            }

        }
    }