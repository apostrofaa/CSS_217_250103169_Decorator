This is a small project where I practiced the decorator design pattern in Java. 
The idea was to build a simple custom pizza order system without using if-else 
statements to calculate the cost or build the description.

How it works:
You start with a basic PlainPizza (dough and sauce for 5 dollars). 
Then you can wrap it with different toppings like extra cheese for 2 dollars, black olives for 1 dollar, or sweet pineapple for 1.50 dollars. 
Each topping decorator wraps the previous pizza object, adds its own price to the total, and appends itself to the description text.

How to run it:
Just open the project in IntelliJ IDEA and run Main.java, or use the terminal:
javac src/Main.java
java -cp src Main
