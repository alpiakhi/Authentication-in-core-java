package com.prime.number;

import java.util.Scanner;

public class Register {
    public String username;
    protected String email;
    private String password;

    //constructor..................
    public Register (String username, String email, String password){
        this.username=username;
        this.email =email;
        this.password=password;
    }

    public String getPassword(){
        return this.password;
    }

    //check retype password.........

    public boolean CheckRetypePassword(String retypepassword){
//        if(this.password.equals(retypepassword)){
//            return true;
//        }else{
//            return false;
//        }
        while(!retypepassword.equals(this.password)){
            System.out.println("your password is incorrect,please try again");

            Scanner myscanner = new Scanner(System.in);
            System.out.print("Retype password here >--");
            String MyPassAgain = myscanner.nextLine();
            //recursion method.....
            CheckRetypePassword(MyPassAgain);
            return true;
        }

        return true;
  }


}
