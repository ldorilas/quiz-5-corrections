# Quiz 5 Corrections: APCSA

*Question 1*

In order to implement the toString method, what annotation do you need to include?

My answer: @Private

Correct answer: @Override

Reasoning: 
`
look up what both annotations mean
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
go through code and carefully analyze what is going on at each step
`


*Question 9*

From a classification perspective, a getter method is a(n)...?

My answer: constructor

Correct answer: accessor

Reasoning:
`
look up what both things mean
`


*Question 10*

From a classification perspective, a setter method is a(n)...?

My answer: static method

Correct answer: mutator

Reasoning: 
`
look up what both things mean
`
