
public class Jiu implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public int getBudget() {
        return budget;
    }

    public void TravelBudget(int amount) {
        budget = budget - amount;
    }
    
    public void visit(Vigan vigan) {
        int airFare = vigan.getAirFare();

        System.out.println("Vigan trip air fare: " + vigan.getAirFare());

        // Define your visit

        if (budget > airFare) {
            System.out.println("Jiu's Note: A lovely day to appreciate the architecture in Vigan!");
            TravelBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location");
        }
    }

    public void visit(Sagada sagada) {
        int airFare = sagada.getAirFare();

        System.out.println("Sagada trip air fare: " + sagada.getAirFare());

        // Define your visit

        if (budget > airFare) {
            System.out.println("Jiu's Note: A lovely day to appreciate the mountain views and indigenous culture of Sagada!");
            TravelBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }

    public void visit(Palawan palawan) {
        int airFare = palawan.getAirFare();

        System.out.println("Palawan trip air fare: " + palawan.getAirFare());

        // Define your visit

        if (budget > airFare) {
            System.out.println("Jiu's Note: A lovely day to appreciate the sun-glazed beaches and extraordinary limestone cliffs of Palawan!");
            TravelBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }
    
    public void visit(Bohol bohol) {
        int airFare = bohol.getAirFare();

        System.out.println("Bohol trip air fare: " + bohol.getAirFare());

         // Define your visit

        if (budget > airFare) {
            System.out.println("Jiu's Note: A lovely day to visit the famous landscape of Bohol, Chocolate hills!");
            TravelBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }

    public void visit(Cebu cebu) {
        int airFare = cebu.getAirFare();

        System.out.println("Cebu trip air fare: " + cebu.getAirFare());

        // Define your visit

        if (budget > airFare) {
            System.out.println("Jiu's Note: A lovely day to try the local foods and enjoy a cool breeze in Cebu!");
            TravelBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }
    
    public void visit(Boracay boracay) {
        int airFare = boracay.getAirFare();

        System.out.println("Boracay trip air fare: " + boracay.getAirFare());

        // Define your visit

        if (budget > airFare) {
            System.out.println("Jiu's Note: A lovely day to visit my relatives in Boracay!");
            TravelBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }
}
