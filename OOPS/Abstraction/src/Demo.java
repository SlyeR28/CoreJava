    // as we know all animals produce different sound so it's useless to make single method
    //we can overcome it by override the method again and again
    // this make your code clumsy or untidy soo we can use abstraction
    // just by declaring a method and using it again and again whenever we want but there are some rules  for abstract methods
    // if any class has a abstract method then class also has to be a abstract class
    // abstract classes can have regular/generals method also
    //method which have their bodies are known as concrete methods
    // and the which doesn't contain body but have their only method name are known abstract methods
    // example

    // here a example

    public  abstract class Demo      {

     public abstract  void sayHello();

     public void sleep(){
         System.out.println("zzz....");
     }
}



