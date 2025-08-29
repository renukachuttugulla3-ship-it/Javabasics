package com.innerclass;

public class Bank extends Customer {
	
	// inner class 1
	class SavingsAccount1 {
		void msg() {
			System.out.println("I am savings account ");
		}
	}

	// inner class 2
	class RecurringAccount2 {
		void msg() {
			System.out.println("I am recurring account ");
		}

	}
	public static void main(String[] args) {
		Bank b = new Bank();
		Bank.SavingsAccount1 obj1 = b.new SavingsAccount1();
		Bank.RecurringAccount2 obj2 = b.new RecurringAccount2();
		obj1.msg();
		obj2.msg();
	}


}
