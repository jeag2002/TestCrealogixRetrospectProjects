package com.example.oap;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@DependsOn("springApplicationContextHolder")
//@Configuration
@Component
@Aspect
public class BeforeDAOAOPAspect {
    
    /** The logger. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    @Before("execution(* com.example.dao.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("[BEFORE-DAOAOP] after execution of {}", joinPoint);
    }

}
