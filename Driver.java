import java.util.Scanner;
interface Lucky_draw
{
void Luckydraw_details();
}
class C1 implements Lucky_draw
{
public void Luckydraw_details()
{
      Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(100 * Math.random());

        // Given K trials
        int K = 5;

        int i, guess;

        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials.");

        // Iterate over K Trials
        for (i = 0; i < K; i++) {

            System.out.println(
                "Guess the number:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                "You have exhausted"
                + " K trials.");

            System.out.println(
                "The number was " + number);
        }
    }
}
class Vehicle
{
String Vehicle_name;
String Vehiclemodel_name;
double Vehicle_price;
double Vehicle_milage;
String Vehicle_color;

Vehicle(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
this.Vehicle_name=Vehicle_name;
this.Vehiclemodel_name=Vehiclemodel_name;
this.Vehicle_price=Vehicle_price;
this.Vehicle_milage=Vehicle_milage;
this.Vehicle_color=Vehicle_color;
}

   @Override
public String toString()
{
System.out.println("Vehicle name:"+Vehicle_name);
System.out.println("Vehicle model name:"+Vehiclemodel_name);
System.out.println("Vehicle price:"+Vehicle_price);
System.out.println("Vehicle milage"+Vehicle_milage);
System.out.println("Vehicle color:"+Vehicle_color);
return" ";
}
}
class Twowheeler extends Vehicle
{
Twowheeler(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{

super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Bike extends Twowheeler
{

Bike(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Gear extends Bike
{

Gear(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Nongear extends Bike
{

Nongear(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Honda extends Gear
{

Honda(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Honda_Shine extends Honda
{

Honda_Shine(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Honda_SP125 extends Honda
{

Honda_SP125(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Yamaha extends Gear
{

Yamaha(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Yamaha_MT15 extends Yamaha
{

Yamaha_MT15(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Yamaha_YZFR15 extends Yamaha
{

Yamaha_YZFR15(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Suzuki extends Nongear
{

Suzuki(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Suzuki_Avenis extends Suzuki
{

Suzuki_Avenis(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Suzuki_Access125 extends Suzuki
{

Suzuki_Access125(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Threewheeler extends Vehicle
{
Threewheeler(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Alfa_Dx extends Threewheeler
{

Alfa_Dx(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class piaggio extends Threewheeler
{
piaggio(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Fourwheeler extends Vehicle
{

Fourwheeler(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Tata_Nexon extends Fourwheeler
{

Tata_Nexon(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Suv_Duster extends Fourwheeler
{

Suv_Duster(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Mahindra_Balero extends Fourwheeler
{

Mahindra_Balero(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Swift extends Fourwheeler
{

Swift(String Vehicle_name,String Vehiclemodel_name,double Vehicle_price,double Vehicle_milage,String Vehicle_color)
{
super(Vehicle_name,Vehiclemodel_name,Vehicle_price,Vehicle_milage,Vehicle_color);
}
}
class Driver
{
    public static void main(String[] args) {
		Lucky_draw ref = new C1();
		ref.Luckydraw_details();
		Scanner SC = new Scanner(System.in);
		System.out.println("Press 1 for Two Wheeler");
		System.out.println("Press 2 for Three Wheeler");
		System.out.println("Press 3 for Four Wheeler");
        System.out.println("Press 4 for Six Wheelers");
		System.out.println("Please enter the category you are interested in (1 to 4):");
		int n = SC.nextInt();

		switch (n) {
		case 1:
			System.out.println("You selected Two Wheeler");
			System.out.println("Press 1 for Bike");
			System.out.println("Press 2 for Scooty");
			n = SC.nextInt();
			if (n == 1) {
				System.out.println("Bike Info");
				System.out.println("Press 1 for Honda_Shine");
				System.out.println("Press 2 for Honda_SP125");
				System.out.println("Press 3 for Yamaha_MT15");
				System.out.println("Press 4 for Yamaha_YZFR15");
				n = SC.nextInt();
				switch (n) {
				case 1:
					Vehicle v = new Honda_Shine("Honda", "Honda_Shine", 68000, 65, "Black");
					System.out.println(v);
					break;
				case 2:
					Vehicle v1 = new Honda_SP125("Honda", "Honda_SP125", 74000, 60, "Gray");
					System.out.println(v1);
					break;
				case 3:
					Vehicle v2 = new Yamaha_MT15("Yamaha", "Yamaha_MT15", 98000, 130, "Royal Blue");
					System.out.println(v2);
					break;
				case 4:
					Vehicle v3 = new Yamaha_YZFR15("Yamaha", "Yamaha_YZFR15", 152000, 150, "Gray metallic");
					System.out.println(v3);
					break;
				default:
					System.out.println("Invalid selection for Bike.");
				}
			} else if (n == 2) {
				System.out.println("Scooty Info");
				System.out.println("Press 1 for Suzuki_Avenis");
				System.out.println("Press 2 for Suzuki_Access125");
				n = SC.nextInt();
				switch (n) {
				case 1:
					Vehicle v4 = new Suzuki_Avenis("Suzuki", "Suzuki_Avenis", 65000, 55, "Purple");
					System.out.println(v4);
					break;
				case 2:
					Vehicle v5 = new Suzuki_Access125("Suzuki", "Suzuki_Access125", 75000, 60, "Royal Blue");
					System.out.println(v5);
					break;
				default:
					System.out.println("Invalid selection for Scooty.");
				}
			} else {
				System.out.println("Invalid input for Two Wheeler.");
			}
			break;

		case 2:
			System.out.println("You selected Three Wheeler");
			System.out.println("Press 1 for Alfa_Dx");
			System.out.println("Press 2 for Piaggio");
			n = SC.nextInt();
			switch (n) {
			case 1:
				Vehicle v6 = new Alfa_Dx("Mahindra", "Alfa_Dx", 28000, 60, "Yellow");
				System.out.println(v6);
				break;
			case 2:
				Vehicle v7 = new piaggio("Piaggio", "Piaggio", 213000, 55, "Yellow");
				System.out.println(v7);
				break;
			default:
				System.out.println("Invalid selection for Three Wheeler.");
			}
			break;

		case 3:
			System.out.println("You selected Four Wheeler");
			System.out.println("Press 1 for Tata_Nexon");
			System.out.println("Press 2 for SUV_Duster");
			System.out.println("Press 3 for Mahindra_Bolero");
			System.out.println("Press 4 for Swift");
			n = SC.nextInt();
			switch (n) {
			case 1:
				Vehicle v8 = new Tata_Nexon("Tata", "Tata_Nexon", 1400000, 312, "Brown");
				System.out.println(v8);
				break;
			case 2:
				Vehicle v9 = new Suv_Duster("Renault", "SUV_Duster", 1500000, 320, "Gray");
				System.out.println(v9);
				break;
			case 3:
				Vehicle v10 = new Mahindra_Balero("Mahindra", "Mahindra_Bolero", 900000, 300, "Red");
				System.out.println(v10);
				break;
			case 4:
				Vehicle v11 = new Swift("Suzuki", "Swift", 800000, 250, "White");
				System.out.println(v11);
				break;
			default:
				System.out.println("Invalid selection for Four Wheeler.");
			}
			break;

		case 4:
			System.out.println("Six Wheeler is currently unavailable.");
			break;

		default:
			System.out.println("Invalid category selection.");
		}

		SC.close();
	}
}

