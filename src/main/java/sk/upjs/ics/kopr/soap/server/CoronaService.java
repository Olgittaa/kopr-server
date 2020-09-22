package sk.upjs.ics.kopr.soap.server;
 
import java.util.Date;
import java.util.List;
 
import javax.jws.WebService;
 
@WebService
public class CoronaService {
        public List<Person> getListOfInfected(Date date) {
                var p1 = new Person();
                p1.setName("John");
                p1.setSurname("Wick");
                p1.setId(12435);
 
                var p2 = new Person();
                p2.setName("Jame");
                p2.setSurname("Doe");
                p2.setId(12435);
 
                return List.of(p1, p2);
        }
}