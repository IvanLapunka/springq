package foo.aspects;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Data
@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());
    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }
}
