package it.balax85.examples.spe;

import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertNotNull;

/**
 * Created by andrea on 30/10/16.
 */
public class BaseControllerTest extends DbUnitTest {

    protected MockMvc mockMvc;

    public void init(Object controller) {
        assertNotNull("Controller was not injected", controller);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    public MvcResult performRequest(RequestBuilder rb) throws Exception {
        return this.performRequest(rb, HttpStatus.OK, true);
    }

    public MvcResult performRequest(RequestBuilder rb, boolean printResult) throws Exception {
        return this.performRequest(rb, HttpStatus.OK, printResult);
    }

    public MvcResult performRequest(RequestBuilder rb, HttpStatus expectedStatus) throws Exception {
        return this.performRequest(rb, expectedStatus, true);
    }

    public MvcResult performRequest(RequestBuilder rb, HttpStatus expectedStatus, boolean printResult) throws Exception {
        ResultActions ra = mockMvc.perform(rb);
        if (printResult && logger.isDebugEnabled()) {
            ra.andDo(MockMvcResultHandlers.print());
        }
        if (expectedStatus != null) {
            ra.andExpect(MockMvcResultMatchers.status().is(expectedStatus.value()));
        }
        return ra.andReturn();
    }

}
