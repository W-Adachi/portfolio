package com.example.portfolio.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.portfolio.form.SampleForm;
// ★ import com.example.portfolio.form.Project; ← この行を削除します

@Controller
public class HomeController {

    // 共通の仮データリスト
    private final List<Project> projects = List.of(
        new Project(1L, "ポートフォリオサイト", "Java 17 / Spring Boot 3 で構築したWebサイトです。", "/img/Group 10.png"),
        new Project(2L, "生活リズムアプリ", "復職・再就職支援のためのアプリケーションです。", "/img/Group 10.png"),
        new Project(3L, "メンバー募集サイト", "ユーザー認証やカート機能を実装したサンプルアプリです。", "/img/Group 10.png")
    );

    // 1. トップページ（一覧画面）
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("projects", projects);
        model.addAttribute("sampleForm", new SampleForm());
        return "index";
    }

    // 2. 作品詳細ページ
    @GetMapping("/projects/{id}")
    public String projectDetail(@PathVariable("id") Long id, Model model) {
        Project project = projects.stream()
                .filter(p -> p.id().equals(id))
                .findFirst()
                .orElse(projects.get(0));

        model.addAttribute("project", project);
        return "project-detail";
    }
}