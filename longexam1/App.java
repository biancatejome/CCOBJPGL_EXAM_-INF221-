public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        System.out.println("JIU'S TRAVEL AGENDA!");

        System.out.println(" ");
        
        Locations vigan = new Vigan();
        Locations sagada = new Sagada();
        Locations palawan = new Palawan();
        Locations bohol = new Bohol();
        Locations cebu = new Cebu();
        Locations boracay = new Boracay();

        Tourist tourist = new Jiu();

        vigan.accept(tourist); 
        sagada.accept(tourist); 
        palawan.accept(tourist); 
        bohol.accept(tourist); 
        cebu.accept(tourist); 
        boracay.accept(tourist); 
    }
}