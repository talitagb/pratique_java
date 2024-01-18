package exerciciospoo.application;



import exerciciospoo.entities.Comment;
import exerciciospoo.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramComment {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(LocalDateTime.parse("21/12/2023 11:30:47", dtf),
                "Traveling to Portugal!",
                "I'm going to visit this wonderful country!",
                12);
        
        p1.addComment(c1);
        p1.addComment(c2);
        
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(LocalDateTime.parse("21/12/2023 12:12:02", dtf),
                "Good Night guys",
                "See you tommorow",
                5);
        
        p2.addComment(c3);
        p2.addComment(c4);
        
        System.out.println(p1);
        System.out.println(p2);
    }
}