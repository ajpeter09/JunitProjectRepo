package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class parameterizedTest {

    String Username;
    String Password;


    public parameterizedTest(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;

    }
    @Test
    public void login(){
        System.out.println(Username + " ----"  + Password);
    }

    @Parameterized.Parameters
    public static Collection<Object> feedData(){
        Object[][] data = new  Object[2][2];

        data[0][0] = "Alex";
        data[0][1] = "Password";

        data[1][0] = "Ajantha";
        data[1][1] = "Ajantha Password";

        return Arrays.asList(data);


    }



}
