/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 11:24 AM
 *  File Name : DynamicBinding.java
 * */
package definitions.bindings;

public class DynamicBinding {
    public static void main(String[] args) {

    }
}

class Airplane {
    public void display() {
        System.out.println("Airplane class.");
    }
}

class Jet extends Airplane {
    @Override
    public void display() {
        System.out.println("Jet class.");
    }
}
