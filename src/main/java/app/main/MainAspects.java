package app.main;

import app.config.ProjectConfigAspect;
import foo.aspects.Comment;
import foo.aspects.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspects {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfigAspect.class);
        final CommentService comme = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Bla Bla Bla");
        comment.setAuthor("NickName");
        comme.publishComment(comment);
    }
}
