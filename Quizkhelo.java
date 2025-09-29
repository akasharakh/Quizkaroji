

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         Questions array
        String[] questions = {
            1. What is the capital of India,
            2. Which language is used for Android development,
            3. What is the output of 5 + 3 in Java,
            4. Which company developed Java,
            5. What does JVM stand for,
            6. Which keyword is used to inherit a class in Java,
            7. Which of these is a valid Java identifier,
            8. What is the size of int in Java,
            9. Which of the following is not a Java feature,
            10. What symbol is used to end a statement in Java
        };

         Options array for each question
        String[][] options = {
            {a) Mumbai, b) Delhi, c) Kolkata, d) Chennai},
            {a) Python, b) Java, c) Swift, d) Kotlin},
            {a) 8, b) 5+3, c) 53, d) 15},
            {a) Microsoft, b) Sun Microsystems, c) Google, d) IBM},
            {a) Java Virtual Machine, b) Java Variable Method, c) Join Virtual Machine, d) Java Verified Machine},
            {a) implements, b) extends, c) inherits, d) imports},
            {a) myVar, b) 1stVar, c) var-name, d) var name},
            {a) 2 bytes, b) 4 bytes, c) 8 bytes, d) 16 bytes},
            {a) Object-oriented, b) Platform independent, c) Use of pointers, d) Portable},
            {a) ., b) ;, c) , d) !}
        };

         Correct answers for each question
        char[] answers = {'b', 'd', 'a', 'b', 'a', 'b', 'a', 'b', 'c', 'b'};

        int score = 0;

        System.out.println(Welcome to the Java Quiz! Please answer by typing a, b, c, or d.);

        for (int i = 0; i  questions.length; i++) {
            System.out.println(questions[i]);
            for (String option  options[i]) {
                System.out.println(option);
            }
            System.out.print(Your answer );
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println(Correct!);
                score++;
            } else {
                System.out.println(Wrong. The correct answer is  + answers[i] + .);
            }
            System.out.println();
        }

        System.out.println(Quiz completed! Your score is  + score +  + questions.length);
        scanner.close();
    }
}
