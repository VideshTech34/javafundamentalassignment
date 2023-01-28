//Fundamental of Java

1 What is programming Language?
Ans->
Making a set of instructions that instruct a computer how to carry out a task is
the process of programming. There are numerous computer programming
languages available for use in programming.
2. Why do we need a programming language

Ans->
● Due to programmes developed by computer programming, you can conduct
online banking and purchase your ticket while travelling by train or aeroplane.
It's true that your washing machine has a few different kinds of computer
programmes. Programming makes it possible for all of these things and many

3. What are the features of java?
Ans->
The primary objective of java programming language creation was to make it portable, simple, and secure programmin language.
The important features of java are:
* Simple
* Secured
* Platform Independent
* Robust
* Portable
* Architecture Neutral
* Dynamic
* Interpreted
* High Performance
* Multithreaded
* Object Oriented Programming Language

4. What is an Object?
 *Object is an instance of class
 *Object is the real world entity.
 *Accomplishes specific tasks.
 *Provide Practical basis for computer application.
  ex Name, Car, Student etc.
 Car c = new Car();

5. What is class?
Ans-> 
* Class defines an entity in terms of common  characteristics and actions.
* Class is mechanism used to group properties and actions commont to various objects.
Note: A class is a blue print for a groupt of objects that have common properties and behavior.

6. Explain about main method in Java?
Ans->
The main() method is the starting point of the program. JVM starts the execution of program starting from the main() method.

Syntax of main() method:

public static void main(String args[])
public: We have already learned in the access specifier tutorial that public access specifier allows the access of the method outside the program, since we want the JVM to identify the main method and start the execution from it, we want it to be marked “public”. If we use other access modifier like private, default or protected, the JVM wouldn’t recognise the main() method and the program won’t start the execution.

static: The reason the main() method is marked static so that it can be invoked by JVM without the need of creating an object. In order to invoke the normal method, we need to create the object first. However, to invoke the static method we don’t need an object. Learn more about static method here.

void: This is the return type. The void means that the main() method will not return anything.

main(): This the default signature which is predefined by JVM. When we try to execute a program, the JVM first identifies the main() method and starts the execution from it. As stated above, the name of this method suggests that it is the “main” part of the program.

String args[]: The main method can also accepts string inputs that can be provided at the runtime. These string inputs are also known as command line arguments. These strings inputs are stored in the array args[] of String type.