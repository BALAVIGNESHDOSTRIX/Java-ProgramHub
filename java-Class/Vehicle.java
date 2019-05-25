
public class Vehicle{

    int weels = 4;
    int fuelcapcity = 100;
    String brektech = "ABS";

    void getvehicInfo(){
        System.out.println("Weels count : ");
        System.out.println(weels);
        System.out.println("Fuel Capacity :");
        System.out.println(fuelcapcity);
        System.out.println("Breaking Technology");
        System.out.println(brektech);
    }
}

class VehicleInfo{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.getvehicInfo();
    }
}