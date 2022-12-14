package cg.wbd.grandemonstration.logger;

import cg.wbd.grandemonstration.model.Customer;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    @AfterThrowing(pointcut = "execution(public * cg.wbd.grandemonstration.service.CustomerService.*(..))",throwing = "e")
    public void log(Exception e){
        System.out.println("[CMS] co loi xay ra :" +e.getMessage());
    }
    public void error(){
        System.out.println("[CMS] ERROR !");
    }

}
