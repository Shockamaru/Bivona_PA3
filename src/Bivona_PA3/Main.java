package Bivona_PA3;

import java.util.Scanner;
import java.util.Random;
public class Main {
    private static Scanner scan= new Scanner(System.in);
    private static Random rm =new Random();
    public static int count=0, correct=0, incorrect=0;
    public static void main(String[] args) {
        System.out.println("Difficulty level (1-4)");
        int lb = scan.nextInt();
        System.out.println("What Arithmitic Method Would You Like? (5-9)");
        int ar = scan.nextInt();
        switch (lb) {
            case 1:
                switch (ar) {
                    case 5:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            addit(n1, n2);
                        }
                        break;
                    case 6:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            subtr(n1, n2);
                        }

                        break;
                    case 7:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            mult(n1, n2);
                        }

                        break;
                    case 8:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            div(n1, n2);
                        }
                    case 9:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            ran(n1, n2);
                        }
                        break;
                }
            case 2:
                switch (ar) {
                    case 5:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(100);
                            int n2 = rm.nextInt(100);
                            addit(n1, n2);
                        }

                        break;
                    case 6:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(100);
                            int n2 = rm.nextInt(100);
                            subtr(n1, n2);
                        }

                        break;
                    case 7:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(100);
                            int n2 = rm.nextInt(100);

                            mult(n1, n2);
                        }

                        break;
                    case 8:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(100);
                            int n2 = rm.nextInt(100);
                            div(n1, n2);
                        }
                    case 9:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            ran(n1, n2);
                        }
                        break;
                }

            case 3:
                switch (ar) {
                    case 5:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(1000);
                            int n2 = rm.nextInt(1000);
                            addit(n1, n2);
                        }

                        break;
                    case 6:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(1000);
                            int n2 = rm.nextInt(1000);
                            subtr(n1, n2);
                        }

                        break;
                    case 7:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(1000);
                            int n2 = rm.nextInt(1000);
                            mult(n1, n2);
                        }

                        break;
                    case 8:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(1000);
                            int n2 = rm.nextInt(1000);
                            div(n1, n2);
                        }
                    case 9:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            ran(n1, n2);
                        }
                        break;
                }
            case 4:
                switch (ar) {
                    case 5:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10000);
                            int n2 = rm.nextInt(10000);
                            addit(n1, n2);
                        }

                        break;
                    case 6:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10000);
                            int n2 = rm.nextInt(10000);
                            subtr(n1, n2);
                        }

                        break;
                    case 7:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10000);
                            int n2 = rm.nextInt(10000);
                            mult(n1, n2);
                        }

                        break;
                    case 8:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10000);
                            int n2 = rm.nextInt(10000);
                            div(n1, n2);
                        }
                    case 9:
                        while (count < 10) {
                            count++;
                            int n1 = rm.nextInt(10);
                            int n2 = rm.nextInt(10);
                            ran(n1, n2);
                        }
                        break;

                }
        }
        percen();
    }

    private static void addit(int n1, int n2){
        int addit=n1+n2;
        System.out.println("How much is "+n1+" plus "+n2+"?");
        int n3=scan.nextInt();
        if(n3==addit){
            correct++;
            correct();
        }
        else{
            incorrect++;
            incorrect();
        }
    }

    private static void subtr(int n1, int n2){
        int subtr=n1-n2;
        System.out.println("How much is "+n1+" minus "+n2+"?");
        int n3=scan.nextInt();
        if(n3==subtr){
            correct++;
            correct();
        }
        else{
            incorrect++;
            incorrect();
        }
    }

    private static void mult(int n1, int n2){
        int multi=n1*n2;
        System.out.println("How much is "+n1+" times "+n2+"?");
        int n3=scan.nextInt();
        if(n3==multi){
            correct++;
            correct();
        }
        else{
            incorrect++;
            incorrect();
        }
    }
    private static void div(int n1, int n2){
        int div=n1/n2;

        System.out.println("How much is "+n1+" divided "+n2+"?");
        int n3=scan.nextInt();
        if(n3==div){
            correct++;
            correct();
        }
        else{
            incorrect++;
            incorrect();
        }
    }

    private static void ran(int n1, int n2){
        int r1=rm.nextInt(4);
        switch(r1){
            case 0:
                int addit=n1+n2;
                System.out.println("How much is "+n1+" plus "+n2+"?");
                int n3=scan.nextInt();
                if(n3==addit){
                    correct++;
                    correct();
                }
                else{
                    incorrect++;
                    incorrect();
                }
                break;
            case 1:
                int subtr=n1-n2;
                System.out.println("How much is "+n1+" minus "+n2+"?");
                n3=scan.nextInt();
                if(n3==subtr){
                    correct++;
                    correct();
                }
                else{
                    incorrect++;
                    incorrect();
                }
                break;
            case 2:
                int multi=n1*n2;
                System.out.println("How much is "+n1+" times "+n2+"?");
                n3=scan.nextInt();
                if(n3==multi){
                    correct++;
                    correct();
                }
                else{
                    incorrect++;
                    incorrect();
                }
                break;
            case 3:
                int div=n1/n2;

                System.out.println("How much is "+n1+" divided "+n2+"?");
                n3=scan.nextInt();
                if(n3==div){
                    correct++;
                    correct();
                }
                else{
                    incorrect++;
                    incorrect();
                }
                break;
        }
    }
    private static void correct(){
        int c1=rm.nextInt(4);
        switch(c1){
            case 0: System.out.println("Very Good !");
                break;
            case 1: System.out.println("Excellent !");
                break;
            case 2: System.out.println("Nice Work !");
                break;
            case 3: System.out.println("Keep up the good work !");
                break;
        }
    }
    private static void incorrect(){
        int c2=rm.nextInt(4);
        switch(c2){
            case 0: System.out.println("No, please try again !");
                break;
            case 1: System.out.println("wrong, try once more !");
                break;
            case 2: System.out.println("Don't give up !");
                break;
            case 3: System.out.println("No, keep trying!");
                break;
        }
    }
    private static void percen(){
        if(correct>= 7.5){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help");
        }
    }
}