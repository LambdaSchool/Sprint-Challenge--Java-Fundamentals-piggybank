# Instructions

We have a magical "piggy bank" 
(a piggy bank is the traditional name of a place to store coins, bills, money). 
The piggy bank is magical because it can hold unlimited amounts of money. However, 
you can not get the money out of it.

Create a collection (array, arraylist, or hashmap) to represent the piggy bank. 
The collection can hold money.  

This money can be
* A Dollar worth $1.00
* A Quarter worth $0.25
* A Dime worth $0.10
* A Nickel worth $0.05
* A Penny worth $0.01  

When creating a coin object, you can optionally give the number of coins being added. 
If no number is given, the default is 1 coin being added to the piggy bank.  

Each coin object should know 
* its value
* how many of that coin was added when that object was created
* how to print its total value which is value * number of coins added.

The main program will look something like this pseudocode (remember pseudocode is not meant to be 
syntactically correct but explain the algorithm):

* Create collection
* piggyBank.add(new Quarter())
* piggyBank.add(new Dime())
* piggyBank.add(new Dollar(5))
* piggyBank.add(new Nickel(3))
* piggyBank.add(new Dime(7))
* piggyBank.add(new Dollar())
* piggyBank.add(new Penny(10))
* Print the contents of the Piggy Bank
  * on the console should appear  
    `1 Quarter`  
    `1 Dime`  
    `$5`  
    `3 Nickels`  
    `7 Dimes`  
    `$1`  
    `10 Pennies`  
    
* Print the value of the Piggy Bank
  * on the console should appear  
    
    `The piggy bank holds $7.30`  

  * Note: 
      * In order to format the output appropriately
          * You will need to import java.text.DecimalFormat
          * At the beginning your program, initialize the format with this statement  
          `DecimalFormat fp = new DecimalFormat("$###,###.00");`
          * When you ready to print out the piggy bank value, use a statement like  
          `System.out.println("The piggy bank holds " + fp.format(myValue));`  

      * Also notice that when you have more than 1 coin, the pural of the coins name is printed.


## Stretch Goals:

* Add the ability to remove coins from the piggy bank
    * Prevent taking more coins than present in the piggy bank
    
    * subtract(1.50)
    * print contents of the Piggy Bank
      * on the console on possible out come is  
        `$4`  
        `7 Dimes`  
        `$1`  
        `10 Pennies`  
        
        
