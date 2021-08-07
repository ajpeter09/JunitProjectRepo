package testcases;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        shopMobilePhoneTest.class,
        parameterizedTest.class,
        validationTest.class

})
public class customExecuteRunner {

}
