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

    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public Page<UserDto> findAll(Pageable pageable) {
        Page<User> result = userRepository.findAll(pageable);
        return result.map(UserDto::new);
    }

    @Transactional(readOnly = true)
    public Page<UserDto> findOne(Long id) {}

    @Transactional
    public UserDto save(UserDto userDto) {
        User user = new User(userDto.getName(), userDto.getPhone(), userDto.getMail(), userDto.getLogin(),
                userDto.getPassword());
        user = userRepository.save(user);
        return new UserDto(user);
    }

    @Transactional
    public UserDto update(Long id) {}

    @Transactional
    public UserDto delete(Long id) {}
}
