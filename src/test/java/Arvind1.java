import org.testng.annotations.*;

public class Arvind1 {


    @BeforeMethod
    void beforeMethod(){
        System.out.println("this will run before every Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("this will run after every Method");
    }

    @Test
    void test1(){

        System.out.println("this is 1st method");
    }

    @Test
    void test2(){

        System.out.println("this is 2nd method");
    }

    @Test
    void test3(){

        System.out.println("this is 3rd method");
    }

    @Test
    void test4(){

        System.out.println("this is 4th method");
    }

    @BeforeSuite
    void beforeSuit(){
        System.out.println("this will start before every Suite");
    }

    @AfterSuite
    void afterSuit(){
        System.out.println("this will run after every Suite");
    }

}
