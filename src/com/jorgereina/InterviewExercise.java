package com.jorgereina;
import java.util.Arrays;

/**
 * Created by Jorge Reina on 1/27/16.
 */
public class InterviewExercise
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        int temp;
        for(int i = 0; i <arr.length/2 ; i++)
        {
            temp = arr[i];
            System.out.println(temp);
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

            System.out.println(Arrays.toString(arr));

        }


    }
}
