package Day8;

class Vehicle{
    String brand,colour;
    int speed;
    double price;
    
    Vehicle(String brand, String colour, int speed, double price){
        this.brand=brand;
        this.colour=colour;
        this.speed=speed;
        this.price=price;
    }

    void display(){
        System.out.println("Brand Name:" +brand);
        System.out.println("colour of a car:" +colour);
        System.out.println("speed : " +speed);
        System.out.println("price: " +price);

    }

}

class Car extends Vehicle{
    int seats;
    String FuelType;
     Car(String brand, String colour, int speed, double price, int seats, String FuelType){
       super(brand, colour, speed, price);
       this.seats=seats;
       this.FuelType=FuelType;
     }

     void showcar(){
        super.display();
        System.out.println("No.of Seats :"+ seats);
        System.out.println("FuelType: "+FuelType);
     }
}

class Bike extends Car{
    int engineCC;
    boolean hasgear;
    Bike(String brand, String colour, int speed, double price, int seats, String FuelType, int engineCC, boolean hasgear){
        super(brand,colour,speed,price,seats,FuelType);
        this.engineCC=engineCC;
        this.hasgear=hasgear;
    }
    void showBike(){
        super.showcar();
        System.out.println("engineCC: " +engineCC);
        System.out.println("hasgear: " +hasgear);
    }
}

class Truck extends Bike{
    int loadcapacity;
    int wheels;

     Truck(String brand, String colour, int speed, double price,int seats, String fuelType, int engineCC,
        boolean hasGear, int loadCapacity, int wheels) {

        super(brand, colour, speed, price, seats, fuelType,engineCC, hasGear);

        this.loadcapacity = loadcapacity;
        this.wheels = wheels;
    }
    
        void showTruck(){
            super.showBike();
            System.out.println("loadcapacity : " +loadcapacity);
            System.out.println("No.of wheels: " +wheels );
        }

}
    

public class VehicleManagementSystem {
    public static void main(String args[]){
      Car c=new Car("Tata","Blue",100,1000000,5,"Petrol");
      Bike b=new Bike("Yamaha","Black",140,180000,155,"Petrol",250,true);
      Truck t=new Truck("Tata","Red",150,2000000,20,"Petrol",500,true,100,6);
      c.showcar();
      b.showBike();
      t.showTruck();

    }
}
