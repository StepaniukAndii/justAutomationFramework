package AlloTest.HelpClases;

import java.util.ArrayList;
import java.util.List;

public class PersonSingIn {

    private String name;
    private String tell;
    private String email;
    private String password;

    public void setName(String name) {
        if(name.length ()<3){
            System.out.println ("Имя " + name + " Слишком  короткое");
            return;
        } else {
            System.out.println ("Вы ввели имя " + name );
        }
        this.name = name;
    }
    public String  getName() {
        return name;
    }
    public void setTell(String tell) {
        this.tell = tell;
    }
    public String getTell(){
        return tell;
    }
    public void setEmail(String email) {
        String name = email;

        List<String> tokens = new ArrayList<String> ();
        tokens.add("@gmail");

        for(String l:tokens){
            if(name.contains (l)){
                System.out.println ("Вы ввели " +l);
            }  else {
                System.out.println ("Вы должны ввести жемей-почту");
                return;
            }
        }
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
