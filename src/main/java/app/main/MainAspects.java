package app.main;

import app.config.ProjectConfigAspect;
import foo.aspects.Comment;
import foo.aspects.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class MainAspects {
    private static Logger logger = Logger.getLogger(MainAspects.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfigAspect.class);
        final CommentService comme = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Bla Bla Bla");
        comment.setAuthor("NickName");
        final String s = comme.publishComment(comment);
        logger.info(s);

        Comment comment2 = new Comment();
        comment.setText("Delete this text");
        comment.setAuthor("Anonime");
        comme.deleteComment(comment2);
    }
}
