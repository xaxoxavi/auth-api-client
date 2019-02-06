package com.esliceu.dwes.authentication;

import com.esliceu.dwes.authentication.model.Authenticate;
import com.esliceu.dwes.authentication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AuthClientRest implements AuthClient{

    @Autowired
    public AuthClientRest(RestTemplate restTemplate, @Value("${api.url}") String url){
        this.restTemplate= restTemplate;
        this.apiUrl = url;
    }

    private RestTemplate restTemplate;
    private String apiUrl;



    public Authenticate authenticate(User user){

        return this.restTemplate.postForObject(apiUrl,user, Authenticate.class);
    }
}
