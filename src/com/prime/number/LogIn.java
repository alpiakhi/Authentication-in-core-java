package com.prime.number;

public class LogIn extends Register{
    public LogIn(String username, String email, String password){
        super( username ,email ,password);
    }

    public boolean login(String username ,String password){
        if(username.equals(this.username) && password.equals(this.getPassword())){
            return true;
        }else if(!username.equals(this.username) ){
            System.out.println("Wrong username");
            return false;
        }else if(!password.equals(this.getPassword())){
            System.out.println("Wrong Password");
            return false;
        }
        return false;
    }

}
