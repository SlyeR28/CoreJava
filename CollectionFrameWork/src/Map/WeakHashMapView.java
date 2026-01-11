package Map;

import java.security.Key;
import java.util.WeakHashMap;

public class WeakHashMapView {
    public static void main(String[] args) {
//        WeakReference<Phone> phones = new WeakReference<>(new Phone("Apple", 15000.78));
//
//        System.out.println(phones.get());
//        System.gc();
//        try{
//            System.out.println("System is working something that you dont know !!!!!!!!!");
//            Thread.sleep(1000);
//        }catch (Exception ignored){
//
//        }
//        System.out.println(phones.get());

        WeakHashMap<String , Image> chaheImage = new WeakHashMap();
//        String key1 = ;
//        String key2 = ;
//        String key3 = ;
        chaheImage.put(new String("img1") , new Image("dance.png"));
        chaheImage.put(new String("img2") , new Image("sdfgsdjfg.png"));
        chaheImage.put(new String("img3") , new Image("sjkfshhsskjdh.png"));

        System.out.println(chaheImage);
        System.gc();
        applicationProcssing();
        System.out.println(chaheImage);

        /*
        in weekHashMap gc will not work till key is in ordinary use
         */
    }


    private static void applicationProcssing(){
        System.out.println("Application is running ...");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.fillInStackTrace();
        }
    }
}




class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}




 class Phone{
    private String brand;
    private double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
