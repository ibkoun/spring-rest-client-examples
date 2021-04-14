package guru.springframework.api.domain.apifaketory;
import guru.springframework.api.domain.jsonplaceholder.User;


import java.util.List;

public class UsersData {

    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
