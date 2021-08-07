package testcases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class shopMobilePhoneTest {

    @Test
    public void test_a_searchMobile() {
        System.out.println("Searching mobile");

    }
    @Test
    public void test_b_selectMobile() {
        System.out.println("selecting the mobile");
    }

    @Ignore // One way ignore test case
    @Test
    public void test_c_ChoosingMobile() {
        System.out.println("Choosing the mobile");
    }

    @Test
    public void test_c_SelectDiffMobile() {
        Assume.assumeTrue(false); //one way to ignore test case
        System.out.println("Selecting Diff the mobile");
    }

    @Test
    public void tesgt_d_checkOut() {
        System.out.println("Mobile Check out done ");
    }
}
