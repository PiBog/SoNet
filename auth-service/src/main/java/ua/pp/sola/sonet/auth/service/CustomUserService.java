package ua.pp.sola.sonet.auth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ua.pp.sola.sonet.auth.entity.User;
import ua.pp.sola.sonet.auth.repository.UserRepository;

public class CustomUserService implements UserService {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository repository;

    @Override
    public void create(User user) {



    }
}
