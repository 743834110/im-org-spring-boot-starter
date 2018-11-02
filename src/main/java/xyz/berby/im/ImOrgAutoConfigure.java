package xyz.berby.im;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 *
 *
 */

@EnableAutoConfiguration(exclude = ImOrgAutoConfigure.class)
@ComponentScan
public class ImOrgAutoConfigure {

    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ImOrgAutoConfigure.class);
    }
}
