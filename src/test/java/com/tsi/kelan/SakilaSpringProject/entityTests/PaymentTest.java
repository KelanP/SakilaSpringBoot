package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.Customer;
import com.tsi.kelan.SakilaSpringProject.entities.more.Payment;
import com.tsi.kelan.SakilaSpringProject.entities.more.Rental;
import com.tsi.kelan.SakilaSpringProject.entities.more.Staff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Instant;


public class PaymentTest {


    @Test
    public void testGettersAndSetters(){

        Payment testPayment = new Payment();

        Customer testCustomer = new Customer();
        Staff testStaff = new Staff();
        Rental testRental = new Rental();

        testPayment.setId(32);
        testPayment.setCustomer(testCustomer);
        testPayment.setStaff(testStaff);
        testPayment.setRental(testRental);
        testPayment.setAmount(20.99f);
        testPayment.setPaymentDate("2015-06-01 22:53:30");
        testPayment.setLastUpdate("2015-06-01 22:53:31");

        Assertions.assertEquals(32,testPayment.getId());
        Assertions.assertEquals(testCustomer,testPayment.getCustomer());
        Assertions.assertEquals(testStaff,testPayment.getStaff());
        Assertions.assertEquals(testRental,testPayment.getRental());
        Assertions.assertEquals(20.99f,testPayment.getAmount());
        Assertions.assertEquals("2015-06-01 22:53:30",testPayment.getPaymentDate());
        Assertions.assertEquals("2015-06-01 22:53:31",testPayment.getLastUpdate());

    }

    @Test
    public void testConstructor1(){

        Customer testCustomer = new Customer();
        Staff testStaff = new Staff();
        Rental testRental = new Rental();

        Payment testPayment = new Payment(320,testCustomer,testStaff, testRental,0.99f,"2020-06-01 22:53:30","2020-06-01 22:53:31");

        Assertions.assertEquals(320,testPayment.getId());
        Assertions.assertEquals(testCustomer,testPayment.getCustomer());
        Assertions.assertEquals(testStaff,testPayment.getStaff());
        Assertions.assertEquals(testRental,testPayment.getRental());
        Assertions.assertEquals(0.99f,testPayment.getAmount());
        Assertions.assertEquals("2020-06-01 22:53:30",testPayment.getPaymentDate());
        Assertions.assertEquals("2020-06-01 22:53:31",testPayment.getLastUpdate());

    }


}
