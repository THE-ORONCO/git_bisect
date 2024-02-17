package the.oronco.git_bisect.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author the_oronco@posteo.net
 * @since 17/02/2024
 */
@RestController
public class AllMyAsAndCs {

    @GetMapping("/a")
    public String allMyAs() {

        var input = AllMyAsAndCs.class.getResourceAsStream("/A.txt");
        try(input){
            if (input == null) return "no As or Cs :[";

            return new String(input.readAllBytes());

        }catch (Exception e){
            return "no As or Cs :(";
        }

    }
}
