package com.example.portfolio.form;

//import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SampleForm {
    @NotBlank(message = "タイトルは必須入力です")
    @Size(max = 50, message = "タイトルは50文字以内で入力してください。")
    private String title;

    @NotBlank(message = "詳細内容は必須です")
    private String detail;
}
