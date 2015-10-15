package uk.ac.ebi.biosd.ebisc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * This is the class that Spring uses to base its annotation configuration off of.
 * 
 * This is also the main application class for the executable jar file.
 * @author faulcon
 *
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ApplicationMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
