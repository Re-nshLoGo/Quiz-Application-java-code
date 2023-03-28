import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Quiz {
    int correctAns = 0;
    int wrongAns  = 0;
    Scanner sc = new Scanner(System.in);
    public void logic(){
        Questions qu1 = new Questions("When an array is passed to a method, what does the method receive?", "A. The reference of the array", "B. A copy of the array", "C. Length of the array", "D. Copy of first element");
        Questions qu2 = new Questions("What is the extension of java code files?", "A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Questions qu3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Questions qu4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Questions qu5 = new Questions("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");
        Questions qu6 = new Questions("Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Map<Questions,Character> hm=new HashMap<>();
        hm.put(qu1, 'A');
        hm.put(qu2, 'D');
        hm.put(qu3, 'B');
        hm.put(qu4, 'B');
        hm.put(qu5, 'C');
        hm.put(qu6, 'D');
        for(Map.Entry<Questions,Character> value : hm.entrySet()){
            System.out.println(value.getKey().getQuestion());
            System.out.println(value.getKey().getOpt1());
            System.out.println(value.getKey().getOpt2());
            System.out.println(value.getKey().getOpt3());
            System.out.println(value.getKey().getOpt4());

            System.out.println("Enter Your Answer: ");
            Character ans=sc.next().charAt(0);

            int cans=Character.compare(ans,value.getValue());
            if(cans==0){
                System.out.println("Correct");
                correctAns++;
            }
            else{
                System.out.println("Wrong");
                wrongAns++;
            }
        }
        System.out.println();
        System.out.println("--------Result---------");
        System.out.println("Total Questions: "+hm.size());
        System.out.println("Correct Answered Questions : "+correctAns);
        System.out.println("Wrong Answered Questions : "+wrongAns);
        int percentage=(100*correctAns)/hm.size();
        System.out.println("Percentage : "+percentage);
        if(percentage>95){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }


    }
  
    
}
