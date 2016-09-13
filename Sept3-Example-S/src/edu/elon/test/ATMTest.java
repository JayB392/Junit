package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATMTest {

  @Test
  public void testATMConstructor() {
    ATM testATM = new ATM();
    assertTrue(testATM.getBalance()==0);
  }
  @Test
  public void testATMDouble(){
    ATM testATM = new ATM(20.5);
    assertTrue(testATM.getBalance()==20.5);
  }
  @Test
  public void testDeposit(){
    ATM testATM = new ATM(20.5);
    testATM.deposit(20);
    assertTrue(testATM.getBalance()==40.5);
  }
  @Test
  public void testToString(){
    ATM testATM = new ATM(20);
    assertTrue(testATM.toString().equals("Amount balance is $20.00"));
  }
  @Test
  public void testWithdrawal(){
    ATM testATM = new ATM(20.5);
    testATM.withdraw(10);
    System.out.println(testATM.getBalance());
    assertTrue(testATM.getBalance()==10.5);
  }
}
