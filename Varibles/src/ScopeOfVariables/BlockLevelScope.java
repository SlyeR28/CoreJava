package ScopeOfVariables;

public class BlockLevelScope {
    public static void main(String[] args) {
        // block level scope
        {
      // the variable scope X is only accessable in this block only {}
            int X = 10;
            System.out.println(X);

        }
        //System.out.println(X);
        // as soon as i uncomment this line this will give compile time error
        //b/c we cannot access the variable outside the bock;
    }
}
