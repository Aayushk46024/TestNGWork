package TestNG;

import org.testng.annotations.Test;

public class Groups_in_Groups {
        @Test(groups= {"Smoke"})
        public void Atest1()
        {
            System.out.println("test1 completed");
        }
        @Test(groups= {"Regression"})
        public void Btest2()
        {
            System.out.println("test2 completed");
        }
        @Test(groups= {"Sanity"})
        public void Atest3()
        {
            System.out.println("test3 completed");
        }
}
