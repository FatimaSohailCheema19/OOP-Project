public class admin extends person {
    private String email;

    
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }


     public admin(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public admin() {
        super(0, "null");
        this.email = "null";
    }

    public admin(admin a) {
        super(a.getid(), a.getname());
        this.email = a.email;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Email: " + email);
    }


    @Override
    public String toString() {
        return  "ID : " + getid() + ", name : " + getname() +  ", email : " + email;
    }


   
   public void makePackage(Package pkg) {
        
        System.out.println("Admin " + getName() + " is creating a package...");
        pkg.setPackageId(123);  
        pkg.setPrice(5000.0);
        pkg.setHotel("Hotel ABC");
        pkg.setTransport("Bus");
        pkg.setDays(7);

        System.out.println("Package created successfully:");
        System.out.println("Package ID: " + pkg.getPackageId());
        System.out.println("Price: " + pkg.getPrice());
        System.out.println("Hotel: " + pkg.getHotel());
        System.out.println("Transport: " + pkg.getTransport());
        System.out.println("Days: " + pkg.getDays());
    }

  
    public void contactCustomer(Customer customer) {
        // Basic logic for contacting a customer
        System.out.println("Admin " + getName() + " is contacting customer " + customer.getName() + "...");
        String contactMessage = "Dear " + customer.getName() + ",\nWe would like to inform you about our new tour packages!";
        
        // Simulate sending an email or SMS
        System.out.println("Sending email to: " + customer.getEmail());
        System.out.println("Message: " + contactMessage);
        
        // Simulate logging the contact
        System.out.println("Contact logged for customer " + customer.getName() + " with ID: " + customer.getId());
    }



}



// Admin admin1 = new Admin(101, "Alice", "alice@example.com");

// // Creating a package
// Package pkg = new Package();
// admin1.makePackage(pkg);

// // Contacting a customer
// Customer customer = new Customer(202, "Bob", "pass123", "987-65-4321", "123-4567", "bob@example.com", new ArrayList<>());
// admin1.contactCustomer(customer);

