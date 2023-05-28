package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invitations")
public class InvitationsController {

    @GetMapping("/available-positions")
    public String getAvailablePositions() {
        // Ваш код для получения доступных мест стажировки в органах власти
        return "Список доступных мест стажировки";
    }

    @PostMapping("/send-test-task")
    public String sendTestTask(@RequestBody String task) {
        // Ваш код для отправки тестового задания
        return "Тестовое задание отправлено";
    }

    @GetMapping("/check-task-status")
    public String checkTaskStatus() {
        // Ваш код для проверки статуса проверки задания
        return "Статус проверки задания";
    }

    @PostMapping("/accept-invitation")
    public String acceptInvitation() {
        // Ваш код для подтверждения принятия приглашения на стажировку
        return "Приглашение на стажировку принято";
    }
}
