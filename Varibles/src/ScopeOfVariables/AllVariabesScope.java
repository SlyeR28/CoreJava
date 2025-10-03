package ScopeOfVariables;

public class AllVariabesScope {
    //instance variable belongs to each object
    private int instancevar = 10;
    // static Variable (shared among all instances)
    static int   staticvar = 100;

    //Constructor Demonstrating parameter scope
    public AllVariabesScope(int instancevar){
//        Parameter  scope
        //using this(keyword) to refer to instance variable
        this.instancevar = instancevar;
    }
    //Method to demonstrate local ,parameter and block scope
}
