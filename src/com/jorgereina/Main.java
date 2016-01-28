package com.jorgereina;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

import javax.management.StringValueExp;

public class Main
{

    public static void main(String[] args)
    {
        solvePuzzle(999999999);
    }

    public static void solvePuzzle(long num)
    {

        Map<Character, Integer> holesMap = new HashMap<Character, Integer>();
        holesMap.put('1', 0);
        holesMap.put('2', 0);
        holesMap.put('3', 0);
        holesMap.put('4', 1);
        holesMap.put('5', 0);
        holesMap.put('6', 1);
        holesMap.put('8', 2);
        holesMap.put('9', 1);
        holesMap.put('0', 1);

        String strNum = num + "";
        long sum = 0;

        for(int i = 0; i < strNum.length(); i++)
        {
            char singleNum = strNum.charAt(i);

            int numOfHoles = holesMap.get(singleNum);
            sum = sum + numOfHoles;

        }
        System.out.println(sum);


    }
}
