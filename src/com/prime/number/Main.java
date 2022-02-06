package com.prime.number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Welcome To See You");
        System.out.println("your user name is");
        String myusername = myscanner.nextLine();

        System.out.println("your email is");
        String email = myscanner.nextLine();

        System.out.println("your password is");
        String password = myscanner.nextLine();

        System.out.println("your retype password is");
        String RetypePassword = myscanner.nextLine();

        //class to create object......
        Register myregister = new Register(myusername , email ,password);

        boolean RegisterOrNot = myregister.CheckRetypePassword(RetypePassword);
        if(RegisterOrNot == true){
            System.out.println("successfully register");
            System.out.println("Login Now");
            //login class object....
            LogIn mylogin = new LogIn(myusername,email,password);

            System.out.println("Enter your username To login");
            String LoginUserName = myscanner.nextLine();

            System.out.println("Enter your password To Login");
            String LoginPassword = myscanner.nextLine();


            boolean LogInSuccessOrnot = mylogin.login(LoginUserName,LoginPassword);

            if(LogInSuccessOrnot == true){
                System.out.println("Welcome you are LOg in");
            }
        }


    }
}
