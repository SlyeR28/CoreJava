public class InstanceVaribales {
    public String geek;
    public int i;
    public Integer I;


    public InstanceVaribales() {
        this.geek = "Swetha Dash";
    }

    public static void main(String[] args) {
        InstanceVaribales name = new InstanceVaribales();

        System.out.println("name = " +name.geek);
        System.out.println("name = " +name.i);
        System.out.println("name = " +name.I);
    }
}
