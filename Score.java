package classworks;

import java.util.Scanner;

class InvalidScoreException extends RuntimeException {
    InvalidScoreException(String message) {
        super(message);
    }
}

class Student {
    int score;

    void checkScore(int score) {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }
        this.score = score;
    }
}

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("enter the score of the student:");
        int score = sc.nextInt();

        try {
            s.checkScore(score);
            System.out.println("The score of the student is " + s.score);
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
