
public class Jiu implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public int getBudget() {
        return budget;
    }

    public void decreaseBudget(int amount) {
        budget-=amount;
    }
    
    public void visit(Vigan vigan) {
        int airFare = vigan.getAirFare();

        if (budget >= airFare) {
            System.out.println("Vigan trip air fare: " + vigan.getAirFare());
            System.out.println("Jiu's Note: A lovely day to appreciate the architecture in Vigan!");
            decreaseBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location");
        }
    }

    public void visit(Sagada sagada) {
        int airFare = sagada.getAirFare();

        if (budget >= airFare) {
            System.out.println("Sagada trip air fare: " + sagada.getAirFare());
            System.out.println("Jiu's Note: A lovely day to appreciate the mountain views and indigenous culture of Sagada!");
            decreaseBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }

    public void visit(Palawan palawan) {
        int airFare = palawan.getAirFare();

        if (budget >= airFare) {
            System.out.println("Palawan trip air fare: " + palawan.getAirFare());
            System.out.println("Jiu's Note: A lovely day to appreciate the sun-glazed beaches and extraordinary limestone cliffs of Palawan!");
            decreaseBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }
    
    public void visit(Bohol bohol) {
        int airFare = bohol.getAirFare();

        if (budget >= airFare) {
            System.out.println("Bohol trip air fare: " + bohol.getAirFare());
            System.out.println("Jiu's Note: A lovely day to visit the famous landscape of Bohol, Chocolate hills!");
            decreaseBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }

    public void visit(Cebu cebu) {
        int airFare = cebu.getAirFare();

        if (budget >= airFare) {
            System.out.println("Cebu trip air fare: " + cebu.getAirFare());
            System.out.println("Jiu's Note: A lovely day to try the local foods and enjoy a cool breeze in Cebu!");
            decreaseBudget(airFare);
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Cannot visit location" );
        }
    }
    
    public void visit(Boracay boracay) {
        int airFare = boracay.getAirFare();

        if (budget >= airFare) {
            System.out.println("Boracay trip air fare: " + boracay.getAirFare());
            System.out.println("Jiu's Note: A lovely day to visit my relatives in Boracay!");
            decreaseBudget(airFare);
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