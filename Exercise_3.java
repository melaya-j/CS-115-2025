import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a = 10;
       int b = 3;
       int c = 9;

       System.out.println("Total: " + (a + b +c));
       System.out.println("Average of int variables: " + ((a+b+c)/3));

       double d = 10.0;
       double e = 3.0;
       double f = 9.2;

       System.out.println("Average of doubles: "+ ((d+e+f)/3));
       System.out.println("Quotient of int variables: "+(a/b));
       System.out.println("Quotient of doubles: " + (d/e));

       System.out.println("Remainder of int variables: "+(a%b));

       //#7: integers are supposed to be whole numbers 
       //#8: 24.557 is not an integer so to use that line of code, you would have to change it into a double

       //#9: You'll get an arithmetic exception (runtime error) since you cant divide by 0 in java
       System.out.println("Enter first number/integer: ");
       int num1 = scanner.nextInt();

       System.out.println("Enter second integer: ");
       int num2 = scanner.nextInt();

       System.out.println("Enter third integer: ");
       int num3 = scanner.nextInt();

       double average = ((num1+num2+num3)/3);
       System.out.println("average:"+average);

       int num = 1;
       while(num <= 9){
          System.out.println(num);
          num++;
       }

       int numb = 1;
       while(numb<=9){
            double square = numb*numb;
            System.out.println("Square of" + numb+"is"+ square);
            numb++;
       }

       System.out.println("Enter radius: ");
       double radius = scanner.nextDouble();

       double perimeter = 2 * Math.PI * radius;
       double area = Math.PI * radius * radius;

       System.out.println("The perimeter of the circle is: " + perimeter);
       System.out.println("the area is:" +area);

       /*
       14.
       int: integers are whole numbers 
       float: floats store more precise measurements than ints, and less precise
       than doubles, so they take up less space.
       double: doubles are the most precise method measurement and can store a very 
       broad range of numbers.
       char: char is important because it is helpful when dealing with individual characters.
        */
        /*15.
         Comments and documentation are important in programming because 
         it is helpful for you anf other users to understand why you did what you've done 
         in an code. When someone looks at the code they can understand why things
         were done, and not assume. 
         */

    }
}
