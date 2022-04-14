package encapsulationPractice;

public class LoginPage {
   //I don't want to give permission to user directly if they want they can access through public layer by using
   //setter and getter
    private String username;
    private String password;


    public void setUsername(String username){
        this.username=username;
    }

    public String getUsername(){
        return username;
    }


    public  void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
