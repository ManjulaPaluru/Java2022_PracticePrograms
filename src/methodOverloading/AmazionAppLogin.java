package methodOverloading;
/**
 particapating methods should be the same signature in the method overloading , return type need to be same,
 if its different it want particapate inn method overloading
 * @param
 */
public class AmazionAppLogin {

    public static void main(String[] args) {
        AmazionAppLogin ap= new AmazionAppLogin();
      ap.login();
      ap.login("manjula","test123");
      ap.login("manju","tes23","manager");
    }



    public boolean login(){
        System.out.println("login done");
        return true;
    }
     private String login(String un,String pwd){
        System.out.println("login done with user name with password");
        return un;
    }
    public String  login(String un,String pwd, String role) {
        System.out.println("Amazon application login with user name, password with role");
        return role;
    }
    public void login(String un,String pwd,int opt){

    }
    public int login(String un,String pwd,long phonenumber){
        System.out.println("amazon app login with un,pwd,pnumber");
        return (int)
                phonenumber;

    }
}
