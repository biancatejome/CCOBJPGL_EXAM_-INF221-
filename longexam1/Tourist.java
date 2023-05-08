interface Tourist {

    int budget = 0;

    void visit();

    void visit(Vigan vigan);

    void visit(Sagada sagada);

    void visit(Palawan palawan);
   
    void visit(Bohol bohol);

    void visit(Cebu cebu);

    void visit(Boracay boracay);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}