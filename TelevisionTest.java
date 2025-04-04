public class TelevisionTest {
    public static void main(String[] args) {
        Television tv1 = new Television ("LG" , 799.99 );
        Television tv2 = new Television ("Toshiba " , 599.99 ); 

        System.out.println("TV1:");
        tv1.displayInfo();  
        System.out.println("TV2:");
        tv2.displayInfo();

        if (tv1.equals(tv2)) {
            System.out.println("Both televisions are equal.");
        } else {
            System.out.println("The televisions are different.");
        }

        tv1.setBrand("Samsung");
        tv1.setPrice(499.99);

        System.out.println("\nUpdated TV1:");
        tv1.displayInfo();

        if (tv1.equals(tv2)) {
            System.out.println("Both televisions are the same.");
        } else {
            System.out.println("The televisions are different.");
        }
    
    }
    
}
