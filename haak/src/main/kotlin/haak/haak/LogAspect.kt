package haak.haak

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.stereotype.Component
import java.time.LocalDateTime


@Aspect
@Component
class LogAspect {

    private val logger=LoggerFactory.getLogger(this::class.java)
    @Pointcut("excution(*gys.andbooks.*.*(.._")
    fun doPointcut(){
        logger.info("포인트컷")
    }

    @Before("doPointcut()")
    fun logBefore(joinpoint: JoinPoint){
        val now= LocalDateTime.now();
        println("[$now] Before ")
    }

    @After("doPointcut()")
}