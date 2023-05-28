package com.example.backend.service;
//Без шифрования
import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        // Логика регистрации пользователя
        // Например, проверка на уникальность имени пользователя и электронной почты
        // Сохранение пользователя в базу данных
        // Возвращение сохраненного пользователя

        return userRepository.save(user);
    }

    public User findUserByUsername(String username) {
        // Логика поиска пользователя по имени пользователя
        return userRepository.findByUsername(username);
    }

    public User findUserByEmail(String email) {
        // Логика поиска пользователя по электронной почте
        return userRepository.findByEmail(email);
    }

    // Другие методы работы с пользователями

}

/* С шифрованием
import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user) {
        // Логика регистрации пользователя
        // Например, проверка на уникальность имени пользователя и электронной почты
        // Хеширование пароля перед сохранением пользователя в базу данных
        // Возвращение сохраненного пользователя

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        return userRepository.save(user);
    }

    public User findUserByUsername(String username) {
        // Логика поиска пользователя по имени пользователя
        return userRepository.findByUsername(username);
    }

    public User findUserByEmail(String email) {
        // Логика поиска пользователя по электронной почте
        return userRepository.findByEmail(email);
    }

    // Другие методы работы с пользователями

}
*/