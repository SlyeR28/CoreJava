package locks;

import java.util.concurrent.locks.Lock;

public class SyncronizedIuuses {
    private int balance = 100;


    public  void withdraw(int amonut) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw" + amonut);
    if(balance >= amonut){
        System.out.println(Thread.currentThread().getName() + "proceeding with withdrawal" );
        Thread.sleep(1000);
        balance -= amonut;
        System.out.println(Thread.currentThread().getName() + "remaining balance is "  +balance);
    }else{
        System.out.println(Thread.currentThread().getName() + "insufficient balance" );
    }
    }
}

//here we are intrinsic lock - basically these are in built in every java object ,we cant se them but they are there
//when we use syncronized keyword , you ar using automatic locks
// by using intrinsic lock we dont have control on the locks
// for eg = we have and bank account where want to make some transaction and from any where else at same time we are
// making another transaction  syncronzed keyword make it hold till one transaction is completed by this you dont have control to
//  to make transaction which transaction is completed first
//for making thing in your control we use redunctant lock