package com.epam.rd.autotasks;

import java.rmi.UnexpectedException;

class ConditionStatements {

    public static int task2(int n) {
        int x, y, z, result;
        String a, b, c, s;
        x=n%1000/100; //first digit of original integer
        y=n%100/10; //second digit of original integer
        z=n%10; //third digit of original integer

        if (x>y){
            if (y>z){
                a=Integer.toString(x);
                b=Integer.toString(y);
                c=Integer.toString(z);
            }
            else{ //z>y
                if (x>z){
                    a=Integer.toString(x);
                    b=Integer.toString(z);
                    c=Integer.toString(y);
                }
                else{ //z>x
                    a=Integer.toString(z);
                    b=Integer.toString(x);
                    c=Integer.toString(y);
                }
            }
        }
        else{ //y>x
            if (x>z){
                a=Integer.toString(y);
                b=Integer.toString(x);
                c=Integer.toString(z);
            }
            else { //z>x
                if (y>z){
                    a=Integer.toString(y);
                    b=Integer.toString(z);
                    c=Integer.toString(x);
                }
                else{ //z>y
                    a=Integer.toString(z);
                    b=Integer.toString(y);
                    c=Integer.toString(x);
                }
            }
        }
        s=a+b+c;
        result=Integer.parseInt(s);
        return result;
    }
}
