package com.gregory.backend.services;

import com.gregory.backend.dto.UserDto;
import com.gregory.backend.entities.User;
import com.gregory.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private User userUpdate;

    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public Page<UserDto> findAll(Pageable pageable) {
        Page<User> result = userRepository.findAll(pageable);
        return result.map(UserDto::new);
    }

    @Transactional(readOnly = true)
    public UserDto findOne(Long id) {
        User result = userRepository.getOne(id);
        return new UserDto(result);
    }

    @Transactional
    public UserDto save(UserDto userDto) {
        User user = new User(userDto.getName(), userDto.getPhone(), userDto.getMail(),
                userDto.getLogin(), userDto.getPassword());
        user = userRepository.save(user);
        return new UserDto(user);
    }

    @Transactional
    public UserDto update(Long id, UserDto userDto) {
        var user = userRepository.findById(id);
        if (user.isPresent()) {
            userUpdate = user.get();
            userUpdate.setName(userDto.getName());
            userUpdate.setPhone(userDto.getPhone());
            userUpdate.setMail(userDto.getMail());
            userUpdate.setLogin(userDto.getLogin());
            userUpdate.setPassword(userDto.getPassword());
        }
        userUpdate = userRepository.save(userUpdate);
        return new UserDto(userUpdate);
    }

    @Transactional
    public void delete(Long id) {
        var user = userRepository.findById(id);
        if (user.isPresent()) {
            var userDelete = user.get();
            userRepository.delete(userDelete);
        }
    }
}
