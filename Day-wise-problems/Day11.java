/* Day 11 - Revision for the day - 14.07.2025

A fruit vendor stacks fruits in a basket one over another — like a stack. Fruits are added (pushed) to the basket and removed (popped) from the top only. The vendor wants a software system to help manage the fruit stack.

Design a Java program to simulate a Fruit Basket using a Stack data structure with the following operations:

addFruit(String fruit) – Add a fruit to the top of the basket.

removeFruit() – Remove the top fruit from the basket.

peekTopFruit() – Show the fruit at the top without removing it.

isBasketEmpty() – Check if the basket is empty.

displayFruits() – Display all fruits from top to bottom. */

public class pltDayEleven 
{
    
    public static void main(String[] args) 
    {
        FruitBasket basket = new FruitBasket();
        
        basket.addFruit("Apple");
        basket.addFruit("Banana");
        basket.addFruit("Cherry");
        
        System.out.println("Top fruit: " + basket.peekTopFruit());
        
        System.out.println("Fruits in the basket:");
        basket.displayFruits();
        
        System.out.println("Removing top fruit: " + basket.removeFruit());
        
        System.out.println("Is the basket empty? " + basket.isBasketEmpty());
        
        System.out.println("Fruits in the basket after removal:");
        basket.displayFruits();
    }

    static class FruitBasket 
    {
        private java.util.Stack<String> stack;

        public FruitBasket() 
        {
            stack = new java.util.Stack<>();
        }

        public void addFruit(String fruit) 
        {
            stack.push(fruit);
        }

        public String removeFruit() 
        {
            if (!stack.isEmpty()) {
                return stack.pop();
            } 
            else 
            {
                return "Basket is empty!";
            }
        }

        public String peekTopFruit() {
            if (!stack.isEmpty())
             {
                return stack.peek();
            } 
            else 
            {
                return "Basket is empty!";
            }
        }

        public boolean isBasketEmpty() {
            return stack.isEmpty();
        }

        public void displayFruits() {
            if (stack.isEmpty()) 
            {
                System.out.println("Basket is empty!");
                return;
            }
            for (String fruit : stack)
             {
                System.out.println(fruit);
            }
        }
    }

    

}
