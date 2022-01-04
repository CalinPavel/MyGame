import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Test {

    public static void main(String[] args) throws Exception {
        // parsing file "JSONExample.json"
        Object obj = new JSONParser().parse(new FileReader("JSON_files/accounts.json"));

        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;

        JSONArray ja = (JSONArray) jo.get("accounts");
        Iterator itr2 = ja.iterator();

        //JSONObject jl = (JSONObject) ja.get(0);

        int i=0;
        while (itr2.hasNext()){
            itr2.next();
            //System.out.println(jo.get("accounts"));
            //System.out.println(ja.get(0));
            JSONObject jl = (JSONObject) ja.get(i);
            i++;
                    //parseCredentialsObject(jl.get("credentials"));
                    //System.out.println(jl.get("country"));
                            //System.out.println(jl.get("favorite_games"));
                            //parseFavoriteGamesObject(jl.get("favorite_games"));
//            System.out.println(jl.get("characters"));
            parseCharactersObject(jl.get("characters"));


            //i++;
        }
       // JSONObject jx = (JSONObject) ja.get(0);
       //parseCredentialsObject(jx.get("credentials"));
    }

    private static void parseCredentialsObject(Object Credentials)
    {
        //Get obj
        JSONObject credentialsObject = (JSONObject) Credentials;

        //Get email
        String email = (String) credentialsObject.get("email");
        System.out.println(email);

        //Get password
        String password = (String) credentialsObject.get("password");
        System.out.println(password);

        System.out.println("///////////////////");

    }

    private static void parseFavoriteGamesObject(Object FavoriteGames)
    {
        //Get email
//        String game = (String) FavoriteGames;
        System.out.println(FavoriteGames);
        System.out.println("///////////////////");

    }

    private static void parseCharactersObject(Object Characters)
    {
       //Get obj
        JSONArray CharactersObject = (JSONArray) Characters;

        Iterator itr3 = CharactersObject.iterator();
        int i=0;
        Account myObj = new Account();
        while (itr3.hasNext()){
            JSONObject jc = (JSONObject ) CharactersObject.get(i);
            myObj.charachterList.add(jc.get("name"));
            i++;
            itr3.next();
        }
        System.out.println(myObj.charachterList);
    }
}
