package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.jsonplaceholder.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() {

    }

    @Test
    public void testGetUsers() {
        assertNotNull(apiService);
        int limit = 5;
        List<User> users = apiService.getUsers(limit);
        assertEquals(limit, users.size());
    }
}