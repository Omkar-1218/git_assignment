package Basic;
import java.util.Scanner;
public class ProductDetails {
	String pname;
	float price;
	int quantity;
	String Discount;
	Scanner s;
	
	void input() {
		s= new Scanner(System.in);
		System.out.println("enter pname ");
		pname= s.next();//take string as input from user
		System.out.println("enter price ");
		price= s.nextFloat();
		System.out.println("enter quantity ");
		quantity= s.nextInt();
	}
	
	void show() {
		System.out.println("Name= "+pname);

        System.out.println("Name= "+price);

        System.out.println("Name= "+quantity);
		
	}
	
	void CalculateDiscount()

    {
        if(price>3000)
        {
            System.out.println("Discount= 10%");
        }
        else
        {
        	System.out.println("Discount= 9%");
        }
    }
	
		
		 public static void main(String[] args)

		     {

			 ProductDetails i= new ProductDetails();
		         
		         i.input();
		         i.show();
		         i.CalculateDiscount();
		 
		     }
		


}
