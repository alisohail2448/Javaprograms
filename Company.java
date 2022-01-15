class Company {
    String model;
    int No_Pass;
    int Since;

    Company() {
        model = "xen";
        No_Pass = 4;
        Since = 1991;

    }    
    void Show() {
        
        System.out.println("The model is " + model + " and capacity of No of Passenger is " + No_Pass
                + " & is company of " + Since);

    }

}
