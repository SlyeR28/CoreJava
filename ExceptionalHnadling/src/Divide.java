public class Divide {
    public static void main(String[] args) {
        int [] numera = {20,100,400,30};
        int [] deno = {1,2,0,4};
        for(int i =0 ; i< numera.length; i++){
            System.out.println(divide(numera[i] , deno[i]));
        }
        System.out.println("good jobbb");
    }

    private static int divide(int a , int b){
       try{
           return a/b;
       } catch (ArithmeticException e) {
           System.out.println(e);
       return -1;
       }
    }

}
