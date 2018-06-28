/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo;

/**
 *
 * @author gc_science6
 */
public class Kangaroo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Flyers noo = new Flyers();
        noo.name = "Not Kazooie";
        noo.talk();
        
        Animal woo = new Animal();
        woo.name = "Banjo";
        woo.talk();
        
        Joey boo = new Joey();
        boo.name = "Joey";
        boo.talk();
        

    }
    
}

class Animal {
    public String name = "Animal";
    public String food = "Grass";
    
    public void talk() {
        System.out.println(name + ": Woah!");
    }
}

class Flyers extends Animal { //female kangaroo so it makes more sense
    public void talk() {
        System.out.println(name + ": Look at mah baby!");
    }
}

class Joey extends Animal{
    public void talk(){
        System.out.println(name + ": I'm a baby kangaroooo");
    }
}