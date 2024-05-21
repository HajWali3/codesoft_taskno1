import java.util.Random;
import java.util.Scanner;

class Quiz {
        int numOfQsts;
        String CheckAnswer;
        int marks;

        public void mainMenu() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Java Quiz.\n");
                System.out.println("Select he number of quesions you want to attempt");
                numOfQsts = sc.nextInt();
        }

        public int randomNum() {
                Random num = new Random();
                return num.nextInt(20);
        }

        public void quesions(int key) {
                Scanner sc = new Scanner(System.in);
                String[] questions = {
                                // Question 1
                                "Which keyword is used to declare a class in Java?\n" +
                                                "a) class\n" +
                                                "b) int\n" +
                                                "c) void\n" +
                                                "d) String\n",

                                // Question 2
                                "What is the data type used to store whole numbers in Java?\n" +
                                                "a) float\n" +
                                                "b) double\n" +
                                                "c) char\n" +
                                                "d) int\n",

                                // Question 3
                                "Which access modifier makes a class member accessible from anywhere in the program?\n"
                                                +
                                                "a) private\n" +
                                                "b) protected\n" +
                                                "c) public\n" +
                                                "d) default\n",

                                // Question 4
                                "What statement is used to control the flow of execution based on a condition?\n" +
                                                "a) if\n" +
                                                "b) while\n" +
                                                "c) for\n" +
                                                "d) switch\n",

                                // Question 5
                                "Which loop iterates a specific number of times based on a counter variable?\n" +
                                                "a) while\n" +
                                                "b) do-while\n" +
                                                "c) for\n" +
                                                "d) foreach\n",

                                // Question 6
                                "What is the keyword used to create a method within a class?\n" +
                                                "a) function\n" +
                                                "b) procedure\n" +
                                                "c) method\n" +
                                                "d) define\n",

                                // Question 7
                                "What is the process of converting a variable from one data type to another?\n" +
                                                "a) conversion\n" +
                                                "b) casting\n" +
                                                "c) transformation\n" +
                                                "d) adaptation\n",

                                // Question 8
                                "What refers to the ability of an object to take on different forms at runtime?\n" +
                                                "a) abstraction\n" +
                                                "b) inheritance\n" +
                                                "c) encapsulation\n" +
                                                "d) polymorphism\n",

                                // Question 9
                                "Which keyword is used to inherit properties and methods from another class?\n" +
                                                "a) extends\n" +
                                                "b) implements\n" +
                                                "c) inherits\n" +
                                                "d) derives\n",

                                // Question 10
                                "What is the wrapper class for the primitive data type int?\n" +
                                                "a) Double\n" +
                                                "b) Float\n" +
                                                "c) Integer\n" +
                                                "d) Character\n",

                                // Question 11
                                "What is the keyword used to declare an interface in Java?\n" +
                                                "a) interface\n" +
                                                "b) abstract\n" +
                                                "c) define\n" +
                                                "d) contract\n",

                                // Question 12
                                "Which access modifier restricts access to a class member within the same package?\n" +
                                                "a) private\n" +
                                                "b) protected\n" +
                                                "c) public\n" +
                                                "d) default\n",

                                // Question 13
                                "What is the process of hiding the internal implementation details of a class?\n" +
                                                "a) polymorphism\n" +
                                                "b) abstraction\n" +
                                                "c) inheritance\n" +
                                                "d) encapsulation\n",

                                // Question 14
                                "Which statement is used to iterate over elements in a collection?\n" +
                                                "a) for\n" +
                                                "b) while\n" +
                                                "c) foreach\n" +
                                                "d) each\n",

                                // Question 15
                                "What is a special type of method that doesn't return a value?\n" +
                                                "a) function\n" +
                                                "b) procedure\n" +
                                                "c) method\n" +
                                                "d) void method\n",

                                // Question 16
                                "What is the keyword used to define a constructor in a class?\n" +
                                                "a) create\n" +
                                                "b) init\n" +
                                                "c) constructor\n" +
                                                "d) The class name\n",

                                // Question 17
                                "What refers to the ability to define general classes and specialize them into more specific ones?\n"
                                                +
                                                "a) polymorphism\n" +
                                                "b) inheritance\n" +
                                                "c) encapsulation\n" +
                                                "d) abstraction\n",

                                // Question 18
                                "Which keyword is used to define an exception in Java?\n" +
                                                "a) error\n" +
                                                "b) exception\n" +
                                                "c) problem\n" +
                                                "d) issue\n",

                                // Question 19
                                "What statement is used to handle exceptions in a program?\n" +
                                                "a) if\n" +
                                                "b) while\n" +
                                                "c) try-catch\n" +
                                                "d) for\n",

                                // Question 20
                                "What is the keyword used to access a static member of a class?\n" +
                                                "a) public\n" +
                                                "b) static\n" +
                                                "c) class\n" +
                                                "d) All of the above\n",

                                // Question 21
                                "Which method is called automatically when an object is created in Java?\n" +
                                                "a) main\n" +
                                                "b) finalize\n" +
                                                "c) constructor\n" +
                                                "d) init\n",

                                // Question 22
                                "What is the keyword used to refer to the current object within a method or constructor?\n"
                                                +
                                                "a) self\n" +
                                                "b) current\n" +
                                                "c) this\n" +
                                                "d) here\n",

                                // Question 23
                                "Which collection class allows you to store elements in a key-value pair?\n" +
                                                "a) ArrayList\n" +
                                                "b) HashSet\n" +
                                                "c) HashMap\n" +
                                                "d) LinkedList\n",

                                // Question 24
                                "What is the default value of a boolean variable in Java?\n" +
                                                "a) true\n" +
                                                "b) false\n" +
                                                "c) null\n" +
                                                "d) 0\n",

                                // Question 25
                                "Which keyword is used to create a new object in Java?\n" +
                                                "a) make\n" +
                                                "b) new\n" +
                                                "c) create\n" +
                                                "d) build\n",

                                // Question 26
                                "What is the superclass of all classes in Java?\n" +
                                                "a) java.lang.Class\n" +
                                                "b) java.lang.Object\n" +
                                                "c) java.lang.String\n" +
                                                "d) java.lang.System\n",

                                // Question 27
                                "Which method is used to get the length of a string in Java?\n" +
                                                "a) size()\n" +
                                                "b) getLength()\n" +
                                                "c) length()\n" +
                                                "d) count()\n",

                                // Question 28
                                "Which keyword is used to stop a loop or switch statement in Java?\n" +
                                                "a) halt\n" +
                                                "b) exit\n" +
                                                "c) stop\n" +
                                                "d) break\n",

                                // Question 29
                                "Which keyword is used to define a constant variable in Java?\n" +
                                                "a) static\n" +
                                                "b) constant\n" +
                                                "c) final\n" +
                                                "d) immutable\n",

                                // Question 30
                                "Which method can be used to convert a string to an integer in Java?\n" +
                                                "a) parseInt()\n" +
                                                "b) toInt()\n" +
                                                "c) convertInt()\n" +
                                                "d) valueOfInt()\n",

                                // Question 31
                                "What is used to define a block of code that can handle exceptions in Java?\n" +
                                                "a) try-catch\n" +
                                                "b) try-catch-finally\n" +
                                                "c) catch-finally\n" +
                                                "d) try-finally\n",

                                // Question 32
                                "Which operator is used to concatenate two strings in Java?\n" +
                                                "a) &\n" +
                                                "b) +\n" +
                                                "c) &&\n" +
                                                "d) ||\n",

                                // Question 33
                                "Which loop is guaranteed to execute at least once?\n" +
                                                "a) for\n" +
                                                "b) while\n" +
                                                "c) do-while\n" +
                                                "d) for-each\n",

                                // Question 34
                                "What is the keyword used to define an enumeration in Java?\n" +
                                                "a) enum\n" +
                                                "b) enumerate\n" +
                                                "c) list\n" +
                                                "d) type\n",

                                // Question 35
                                "Which method is used to convert a string to lowercase in Java?\n" +
                                                "a) toLowerCase()\n" +
                                                "b) lower()\n" +
                                                "c) toLower()\n" +
                                                "d) downcase()\n",

                                // Question 36
                                "What is the term for a method that has the same name but different parameters?\n" +
                                                "a) overriding\n" +
                                                "b) overloading\n" +
                                                "c) polymorphism\n" +
                                                "d) inheritance\n",

                                // Question 37
                                "Which keyword is used to prevent a class from being inherited?\n" +
                                                "a) final\n" +
                                                "b) static\n" +
                                                "c) abstract\n" +
                                                "d) sealed\n",

                                // Question 38
                                "What is the keyword used to call the superclass constructor?\n" +
                                                "a) super\n" +
                                                "b) base\n" +
                                                "c) parent\n" +
                                                "d) this\n",

                                // Question 39
                                "Which interface is used to compare objects for natural ordering?\n" +
                                                "a) Comparator\n" +
                                                "b) Comparable\n" +
                                                "c) ComparatorInterface\n" +
                                                "d) Ordered\n",

                                // Question 40
                                "Which method is used to get the current time in milliseconds?\n" +
                                                "a) System.time()\n" +
                                                "b) System.currentTimeMillis()\n" +
                                                "c) System.now()\n" +
                                                "d) System.getTime()\n"
                };

                System.out.println(questions[key]);

                boolean validInput = false;
                while (!validInput) {
                        System.out.println("Choose the best option from a, b, c or d");
                        CheckAnswer = sc.nextLine();
                        if (CheckAnswer.length() == 1 && Character.isLetter(CheckAnswer.charAt(0))) {
                                if (CheckAnswer.charAt(0) >= 'a' && CheckAnswer.charAt(0) <= 'd') {
                                        validInput = true;
                                } else {
                                        System.out.println("Choose letters between a and b");
                                }
                        } else {
                                System.out.println("Enter a valid letter");
                        }
                }

        }

        public void answers(int key) {
                char[] correctAns = { 'a', 'd', 'c', 'a', 'c', 'c', 'b', 'd', 'a', 'c', 'a', 'b', 'd', 'c', 'd', 'c',
                                'b', 'b',
                                'c', 'd', 'a', 'd', 'c', 'a', 'd', 'b', 'c', 'b', 'b', 'c', 
                                'a', 'b', 'c', 'c', 'a', 'b', 'b', 'a', 'b', 'b' };
                String[] validAns = { "class", "int", "public", "if", "for", "method", "casting", "polymorphism",
                                "extends",
                                "Integer", "interface", "protected", "encapsulation", "foreach", "void method",
                                "constructor",
                                "inheritance", "exception", "try-catch", "All of the above", "class", "int", "public", "if", "for", "method", "casting", "polymorphism",
                                "extends", "Integer", "interface", "protected", "encapsulation", "foreach", "void method",
                                "constructor", "inheritance", "exception", "try-catch", "All of the above",
                                "constructor", "this", "HashMap", "false", "new", "java.lang.Object", "length()", "break",
                                "final", "parseInt()", "try-catch-finally", "+", "do-while", "enum", "toLowerCase()",
                                "overloading", "final", "super", "Comparable", "System.currentTimeMillis()" };

                if (correctAns[key] == CheckAnswer.charAt(0)) {
                        marks++;
                        System.out.println("Right answer. Correct Answer: " + CheckAnswer + ") " + validAns[key]);
                } else
                        System.out.println("Wrong answer. Correct Answer: " + CheckAnswer + ") " + validAns[key]);
        }
}

public class Task4 {
        public static void main(String[] args) {
                Quiz user1 = new Quiz();
                user1.mainMenu();
                for (int i = 0; i < user1.numOfQsts; i++) {
                        int randoNum = user1.randomNum();
                        user1.quesions(randoNum);
                        user1.answers(randoNum);
                        System.out.println("Marks = " + user1.marks + "\n");
                }
        }
}
