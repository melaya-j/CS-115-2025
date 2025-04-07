public class Television {

  private String brand;
  private double price;
  
  public Television(String brand, double price) {
    this.brand = brand;
    this.price = price;

    public String getBrand() {
        return brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Television other) {
        if (this.brand == other.brand && this.price == other.price) {
            return true;
        }
        
        else {
            return false;
        }
    }
  }
}


//Questions 1-4 & 9-13
/* 1. In Java, an array is declared with which syntax?
 a. int [] vals;
 b. int vals [];

 2. The offset of the first memeber of an array is:
a.0

3. The offset of the last member of an array is:
b.1

4. Accessing a member of an array at index 6 is done with:
a. vals[5]

9. A class is:
a.	An object type, created from other types

10. A data member of an object hiddent from other source files is marked:
d.	private

11.	The methods for a class that provide the interface to the outside progrmming world are marked:
a. public

12.	A class for an object type called bottledMagic would be saved in a file called:
 b. bottledMagic.java

 13. The constructor method for class bottledMagic is named:
 c. bottledMagic()
*/