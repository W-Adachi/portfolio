package com.example.portfolio.controller;

public record Project(
    Long id,
    String title,
    String description,
    String imagePath
) {}