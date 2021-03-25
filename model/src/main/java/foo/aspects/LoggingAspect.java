package foo.aspects;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* foo.aspects.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        final String methodName = joinPoint.getSignature().getName();
        final Object[] args = joinPoint.getArgs();
        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(args) +
                " will execute");
        final Object proceed = joinPoint.proceed();
        logger.info("Method executed and returned " + proceed);
        return proceed;
    }
}
