# Quiz 5 Corrections: APCSA

*Question 1*

In order to implement the toString method, what annotation do you need to include?

My answer: @Private

Correct answer: @Override


Reasoning:  
`
Using the annotation @Override informs the compiler that the element is meant to override an element declared in a superclass, while using the annotation @Private indicates that the constructor is private.
`


*Question 6*

Consider the following partially implemented class.

```
public class Quiz {

    private static int id = 1;
    private int questionCount;

    public Quiz(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getId() {
        return id;
    }

    public void incrementId() {
        id++;
    }

    public int getQuestionCount() {
        return questionCount;
    }
}
```

Now, consider the following usage of the aforementioned class.

```
Quiz q1 = new Quiz(10);
Quiz q2 = new Quiz(15);
q2.incrementId();

System.out.println(q1.getId());
System.out.println(q2.getId());
System.out.println(q1.getQuestionCount());
System.out.println(q2.getQuestionCount());
```

What will be printed to the console?

My answer: 1 2 10 15

Correct answer: 2 2 10 15

Reasoning: 
`
2 will be printed first instead of 1 because although q1 and q2 have different values initialized for questionCount, when q2 is incremented, q1 will be incremented as well because int id for both variables equals 1.
`


*Question 9*

From a classification perspective, a getter method is a(n)...?

My answer: constructor

Correct answer: accessor

Reasoning:
`
An accessor returns a class's variable or value, while a constructor is used to initialize an object's state and does not return a value.
`


*Question 10*

From a classification perspective, a setter method is a(n)...?

My answer: static method

Correct answer: mutator

Reasoning: 
`
A mutator is used to set a value of a private field based on what was received as the parameter; a static method is called without creating an object of a class and is shared among all objects created from the class.
`
