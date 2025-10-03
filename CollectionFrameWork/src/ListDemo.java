import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Integer> list1 =  new ArrayList<>();
          list1.add(12);
          list1.add(1);
          list1.add(2);
          list1.add(29);
          list1.add(122);
          list1.add(126);
          list1.add(182);
          list1.add(102);
          list1.set(4,556);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(56);
        list2.add(90);
        list2.add(97);
        list2.add(91);

        list2.addAll( 4, list1);
        System.out.println(list2);

        gfg o1 = new gfg();
        gfg o2 = (gfg) o1.clone();

        System.out.println(o1.x + " " + o1.y);
        System.out.println(o2.x + " " +o2.y);


//        list2.clear();
//        System.out.println(list2);
//        System.out.println(list1);
//        for(int i = 0; i<list1.size(); i++){
//
//            if(i == 4){
//                list1.set(4, 195);
//            }
//            System.out.println(list1.get(i));
//        }
//        System.out.println(list1.size());
    }
    static class gfg implements Cloneable{
        int x;
        int y;

        gfg(){
            x = 10;
            y = 20;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

}
