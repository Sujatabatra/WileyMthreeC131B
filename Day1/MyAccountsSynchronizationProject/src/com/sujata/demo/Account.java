package com.sujata.demo;

class Account implements Runnable {

	static int balance = 1000;

	public void run() {
		//Object level Locking
//		synchronized (this) {
//class level locking
			synchronized (Account.class) {
			if (balance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw and your balance is Rs." + balance);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - 800;
				System.out.println(Thread.currentThread().getName() + "After withdrawl your balance = Rs." + balance);
			} else
				System.out.println(Thread.currentThread().getName()
						+ " you have insufficient balance to withdraw and your balance is Rs." + balance);

		}
	}
}
