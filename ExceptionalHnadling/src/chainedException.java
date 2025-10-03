public class chainedException {
    public static void main(String[] args) {
        try{
            NumberFormatException ex = new NumberFormatException("primary Exception");
            ex.initCause(new NullPointerException("Root cause of Exception"));
            throw ex;
        }catch (NumberFormatException ex){
            System.out.println("Caugth Exception : " +ex);
            System.out.println("cause of Exception :" +ex.getCause());
        }
    }
}
