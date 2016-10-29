/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package science.raketen.helloprobe;

import java.util.concurrent.atomic.AtomicInteger;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Stephan Knitelius {@literal <stephan@knitelius.com>}
 */
@ApplicationScoped
public class HelloService {
    
    private AtomicInteger serviceCalls = new AtomicInteger();
    
    public String sayHello(String name) {
        return String.format("Hello %s! Number of service calls %d.", name, serviceCalls.getAndIncrement());
    }
}
