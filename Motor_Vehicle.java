class Motor_Vehicle {
    String model;
    int No_Pass;
    String Company;

    Motor_Vehicle() {
        model = "xen";
        No_Pass = 4;
        Company = "Maruti";

    }

}

class Bike extends Motor_Vehicle {
    String bikeModel;
    int bikePass;
    String bikeCompany;

    Bike() {
        bikeModel = "250";
        bikePass = 3;
        bikeCompany = "KTM";
    }

    void show() {
        System.out.println("The model is " + model + " and capacity of No of Passenger is " + No_Pass
                + " & is company of " + Company + " & also Bike Model is " + bikeModel + " No of passenger is "
                + bikePass + " & Company of Bike is " + bikeCompany);

    }

    public static void main(String args[]){

        Bike obj = new Bike();
        obj.show();

    }
}
