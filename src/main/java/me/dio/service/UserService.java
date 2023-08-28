package me.dio.service;

import me.dio.domain.Model.User;


public interface UserService {

    User findById(Long id);

    User create(User userTocreate);

    void deleteById(Long id);

}
