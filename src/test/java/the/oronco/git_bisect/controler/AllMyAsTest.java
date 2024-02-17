package the.oronco.git_bisect.controler;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author the_oronco@posteo.net
 * @since 17/02/2024
 */
@SpringBootTest
@AutoConfigureMockMvc
class AllMyAsTest {

    @Test
    void allMyAs(@Autowired MockMvc mvc) throws Exception {
        mvc.perform(get("/a"))
           .andExpect(status().isOk());
    }
}