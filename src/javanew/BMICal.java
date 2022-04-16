
 
package javanew;

import java.util.Scanner;


public class BMICal {
    
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your gender (Male or Female): ");
        String gender = input.nextLine();
//        assert gender == "male" && gender == "female" : " You have to choose between male or female"; 
        /* Precondition: gender should be male or female */
        /* Postcondition: Gender is male or female */
        
        
        System.out.print("Please enter weight in pounds: ");
        double weight = input.nextDouble();
        assert weight > 0 : "A person should have some weight";
        /* Precondition: Weight >= 0 */
        /* Postcondition: Weight is more than 0 */
        
        
        System.out.print("Please enter height in inches: ");
        double height = input.nextDouble();
        assert height > 0 : "A person should have some height";
        /* Precondition: Height >= 0 */
        /* Postcondition: Height is more than 0 */
        
        final double kilo_per_pound = 0.45359237;
        final double meters_per_inch = 0.0254;
        
        double weight_in_kilo = weight * kilo_per_pound;
        double height_in_meters = height * meters_per_inch;
        
        double bmi = weight_in_kilo / (height_in_meters * height_in_meters);
        
        System.out.println("Your weight is " + weight_in_kilo + "(kilos)");
        System.out.println("Your height is " + height_in_meters + "(meters)");
        System.out.println(" Your BMI is : "+ bmi);
        
        assert bmi >0 : "Bmi should be greater than 0";
        
        if(bmi < 18.5)
            System.out.println(" You are in Underweight state");
        else if (bmi < 25)
            System.out.println("You have a Normal body");
        else if (bmi < 30)
            System.out.println(" You are Overweight");
        else
            System.out.println(" You are in Obese State");
        
        if (bmi < 18.5)
            System.out.println("You are very skinny, try to eat more healthy food");
        else if(bmi < 25)
            System.out.println("Your body is normal state");
        else if (bmi < 30)
            System.out.println("You have some extra weight, Becarefull with our food and get some exercise");
        else
            System.out.println("You have a lot of weight, which can be harmful for your healt. Please have a diet and exercise regularly");
        

    }
}
    

