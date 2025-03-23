import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Quiz q = new Quiz();
        q.logic();
    }
}

class Quiz {
    Scanner sc = new Scanner(System.in);
    int countcorrectanswer = 0;
    int countwronganswer = 0;
    public void logic() {
        
        Questions q1 = new Questions("Which statement is true about Java?",
                                        "a) Java is a sequence-dependent programming language ",
                                        "b) Java is a code dependent programming language ",
                                        "c) Java is a platform-dependent programming language ",
                                        "d) Java is a platform-independent programming language ");
        Questions q2 = new Questions("What is the extension of java code files?" ,
                                        "a) .js",
                                        "b) .txt" ,
                                        "c) .class ",
                                        "d) .java");
        Questions q3= new Questions("Who invented Java Programming?",
                                        "a) Guido van Rossum",
                                        "b) James Gosling",
                                        "c) Dennis Ritchie",
                                        "d) Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a Java feature?",
                                        "a) Object-oriented",
                                        "b) Use of pointers",
                                        "c) Portable",
                                        "d) Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?",
                                        "a) identifier & keyword",
                                        "b) identifier",
                                        "c) keyword",
                                        "d) none of the mentioned");

        Map<Questions,Character> hmap = new HashMap<>();
        hmap.put(q1,'d');
        hmap.put(q2,'d');
        hmap.put(q3,'b');
        hmap.put(q4,'b');
        hmap.put(q5,'c');

   for(Map.Entry<Questions,Character> map : hmap.entrySet()) {
            System.out.println(map.getKey().getQuestion()); 
            System.out.println(map.getKey().getoption1()); 
            System.out.println(map.getKey().getoption2()); 
            System.out.println(map.getKey().getoption3()); 
            System.out.println(map.getKey().getoption4()); 
            System.out.println(map.getKey().getoption5()); 


            System.out.println("Enter your Answer: ");
            Character ans = sc.next().charAt(0);

            int correctans = Character.compare(ans,map.getValue());

            if(correctans == 0) {
                System.out.println("Correct answer");
                countcorrectanswer++;
            }
            else 
            {
                System.out.println("Wrong answer");
                countwronganswer++;
            }
       }
       System.out.println();
       System.out.println("--------Result--------");
       System.out.println("Total number of questions "+hmap.size());
       System.out.println("Total number of correct answers "+countcorrectanswer);
       System.out.println("Total number of wrong answer "+countwronganswer);

       System.out.println("Percentage : "+(100*countcorrectanswer)/hmap.size());
    }

}
