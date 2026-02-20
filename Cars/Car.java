package Cars;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;


    public String getInfo() {
        return "VIN Number: " + vinNumber +
                "\nMake: " + make +
                "\nModel: " + model +
                "\nMileage: " + mileage + " miles";
    }

    public Car(String vinNumber,String make,String model,int mileage){
        this.vinNumber=vinNumber;
        this.make=make;
        this.model=model;
        this.mileage=mileage;
    }
    public String getVinNumber(){
        return vinNumber;
    }
    public  String  getMake(){
        return make;
    }
    public  String getModel(){
        return model;
    }
    public int getMileage(){
        return  mileage;
    }
    public void setVinNumber(String vinNumber){
        if(vinNumber==null){
            System.err.println("The VinNumber cannot be null");
        }
        else {
            this.vinNumber=vinNumber;
        }
    }
    public void setMake(String make){
        if(make==null){
            System.err.println("The make(brand)'s name cannot be null");
        }
        else {
            this.make=make;
        }
    }
    public void setModel(String model){
        if(model==null){
            System.err.println("The model name of car cannot be null");
        }
        else{
            this.model=model;
        }
    }
    public void setMileage(int mileage){
        if(mileage<0){
            System.err.println("The mileage cannot be less than 0");
        }
        else{
            this.mileage=mileage;
        }
    }
}

