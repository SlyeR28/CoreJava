public class LocalVariable {
    public static void main(String[] args) {
           int X = 10;
         String Message = " Hello World";
        System.out.println("x = " +X);
        System.out.println("Message = " +Message);

        if(X>5){
            String result = "x is greater then 5";
            System.out.println(result);
        }

        for(int i = 0; i<3; i++){
            String loppMessage = "Iteration" + i;
            System.out.println(loppMessage);
        }
    }
}
