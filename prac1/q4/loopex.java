package com.mycompany.p1q4;


public class loopex {
   {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");
    }
    //result is  10
//20
//I'm out of the Loop now
     /* {
       
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");
    }*/
}
//10
//20
//40
//50
//I'm out of the Loop now


