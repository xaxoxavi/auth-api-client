package com.esliceu.dwes.authentication;

import com.esliceu.dwes.authentication.model.Authenticate;
import com.esliceu.dwes.authentication.model.User;

public interface AuthClient {

    Authenticate authenticate(User user);
}
