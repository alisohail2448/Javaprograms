class Item extends Company {
    String ItemModel;
    int ItemPass;
    String ItemCompany;

    Item() {
        ItemModel = "250";
        ItemPass = 3;
        ItemCompany = "KTM";
    }

    void Show() {
        super.Show();
        System.out.println(" Item Model is " + ItemModel + " No of passenger is "
                + ItemPass + " & Company of Item is " + ItemCompany);

    }

    public static void main(String args[]) {

        Item obj = new Item();
        obj.Show();

    }
}
