package Parallel_Test;

import org.testng.annotations.Test;

public class ParallelTest2 {
    public class DemoTest1 {
        @Test()
        public void Login() {
            System.out.println("Test Method 2");
        }

        @Test()
        public void CustomerDetails1() {
            System.out.println("Enter Customer Details 2");
        }
    }
}
