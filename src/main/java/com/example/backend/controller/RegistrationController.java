// Ваш пакет
package com.example.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.form.RegistrationForm;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RegistrationController {
  
  // Метод для отображения страницы регистрации
  // Данный метод будет вызываться при обращении к URL "/registration"
  @GetMapping("/registration")
  public String showRegistrationPage() {
    return "registration";
  }
  
  // Метод для обработки данных формы регистрации
  // Данный метод будет вызываться при отправке данных формы регистрации методом POST на URL "/registration"
  @PostMapping("/registration")
  public String processRegistrationForm(@RequestBody RegistrationForm registrationForm) {
    // Ваша логика обработки данных формы регистрации
    // Например, вы можете получить данные из объекта RegistrationForm и сохранить их в базе данных
    
    return "success";
  }
}
