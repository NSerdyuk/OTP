import Methodes.BasePageLogin;
import Methodes.PageHomeTT;
import org.junit.Test;

public class LoginN {
    @Test
    public void main() {

        BasePageLogin basePageLogin = new BasePageLogin();
        basePageLogin.Logining();
try {


        PageHomeTT homeTT=new PageHomeTT();
        homeTT.Log();

    }catch (NullPointerException e){

    e.printStackTrace();
    }
}}