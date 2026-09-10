package com.example.portfolio.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 成果物データの形式を定義（タイトル、説明文、画像パス）
    public record Project(String title, String description, String imagePath) {}

    @GetMapping("/")
    public String index(Model model) {
        // 表示したいカードのリストを作成
        List<Project> projects = List.of(
            new Project("ポートフォリオサイト", "Java 17 / Spring Boot 3 で構築したWebサイトです。", "/img/Group 10.png"),
            new Project("生活リズムアプリ", "復職・再就職支援のためのアプリケーションです。", "/img/Group 10.png"),
            new Project("メンバー募集サイト", "ユーザー認証やカート機能を実装したサンプルアプリです。", "/img/Group 10.png")
        );

        // HTML 側へ "projects" という名前でリストを渡す
        model.addAttribute("projects", projects);

        return "index";
    }
}