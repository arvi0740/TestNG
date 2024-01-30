import org.testng.annotations.*;

public class Pragya1 {

    @Test
    void test5(){

        System.out.println("this is 5th test");

    }

    @Test
    void test6(){

        System.out.println("this is 6th test");

    }

    @Test
    void test7(){

        System.out.println("this is 7th test");

    }

    @Test
    void test8(){

        System.out.println("this is 8th test");

    }

    @BeforeClass
    void beforeClass(){
        System.out.println("this will run before every class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("this will run after every class");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("this will run before every Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("this will run after every Test");
    }
}
