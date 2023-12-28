package jp.co.sss.training.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class LoginValidator implements ConstraintValidator<Login, Object> {

    private String userId; 
    private String password; 
 
    public void initialize(Login annotation) { 
        this.userId = annotation.fieldUserId(); 
        this.password = annotation.fieldPassword(); 
    } 
  
    public boolean isValid(Object value, ConstraintValidatorContext context) { 
        BeanWrapper beanWrapper = new BeanWrapperImpl(value); 
 
        String userId = (String) beanWrapper.getPropertyValue(this.userId); 
        String password = (String) beanWrapper.getPropertyValue(this.password); 
 
        if ("123".equals(userId) && "aaa".equals(password)) { 
            return true; 
        } else { 
            return false; 
        } 
    } 
    
    
}
