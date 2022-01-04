import java.util.*;
public class Account {
   Information myObj = new Information();


   List <Object> charachterList = new ArrayList <Object>();


   //este o clasa interna clasei Account
   class Information{
       Credentials myHero = new Credentials();

       //personal
       String name;
       String country;

       //games collection
    }
}

//Encapsulation
    class Credentials {
       private String email;
       private String password;

        public String getEmail(){
            return email;
        }

        public String getpassword(){
            return password;
        }
    }


