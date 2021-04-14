package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.jsonplaceholder.User;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ApiServiceImpl implements ApiService {
    private static final String APIFAKETORY = "http://private-anon-7c32e82f95-apifaketory.apiary-mock.com/api/user?limit=";
    private static final String JSONPLACEHOLDER = "https://jsonplaceholder.typicode.com/users?_limit=";
    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        List<User> usersData = restTemplate.getForObject(JSONPLACEHOLDER + limit, List.class);
        return usersData;
    }
}
