package com.example.backend.form;

//Класс модели для данных формы регистрации
public class RegistrationForm {
private String username;
private String email;
private String password;

// Геттеры и сеттеры для полей модели
// Можно использовать генерацию автоматических геттеров и сеттеров в Eclipse

public String getUsername() {
 return username;
}

public void setUsername(String username) {
 this.username = username;
}

public String getEmail() {
 return email;
}

public void setEmail(String email) {
 this.email = email;
}

public String getPassword() {
 return password;
}

public void setPassword(String password) {
 this.password = password;
}
}