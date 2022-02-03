package Parallel_Test;

import org.testng.annotations.Test;

public class ParallelTest1 {

    public class DemoTest {
        @Test()
        public void Login() {
            System.out.println("Test Method 1");
        }

        @Test()
        public void CustomerDetails() {

            System.out.println("Enter Customer Details 1");
        }
    }
}
