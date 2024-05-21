package com.suren.JwtImplementation.services;

import com.suren.JwtImplementation.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Suren Ale","surenale10@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ram Ale","ramale10@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Shyam Ale","shyamale10@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Sita Ale","sitaale10@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rita Ale","ritaale10@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
