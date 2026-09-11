# ポートフォリオ Web アプリケーション

## 概要
Spring Boot と Thymeleaf を使用して構築した、保守性と拡張性を意識した Web アプリケーション。

## 使用技術（Tech Stack）
- **Language:** Java 17
- **Framework:** Spring Boot 3.2.3
- **Template Engine:** Thymeleaf
- **Frontend:** HTML5, CSS3, JavaScript
- **Build Tool:** Gradle (または Maven)
- **Version Control:** Git / GitHub

## 主な機能・画面一覧
- **トップページ / 一覧画面:** データの可視化およびナビゲーション
- **入力フォーム画面:** ユーザー入力およびリアルタイム・サーバーサイドバリデーション（※実装中）

## 保守性・設計上の工夫
- Thymeleaf の `th:fragment` を活用した共通部品（ヘッダー・フッター等）のモジュール化
- レスポンシブデザインによる複数デバイスへの適応

## 今後の拡張予定（Roadmap）

現在、段階的な機能拡張を行っています。

- [x] Thymeleaf による画面共通パーツのモジュール化（`th:fragment`）
- [ ] フォーム入力時のバリデーション処理およびエラーハンドリング
- [ ] **GitHub REST API によるリポジトリ自動連動**
  - GitHub REST API を経由して自身の GitHub リポジトリ情報を動的に取得
  - README の技術スタックやトピックタグを解析し、成果物カードの自動生成・タグ絞り込み機能の実装
     
  ## 🛠️ 技術スタック & バッジ
![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-green?style=flat-square&logo=springboot)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-005F0F?style=flat-square&logo=thymeleaf)
![Gradle](https://img.shields.io/badge/Gradle-8.x-02303A?style=flat-square&logo=gradle)

## 📁 ディレクトリ構造（主要部分）
```text
src/main/
├── java/com/example/portfolio/
│   ├── controller/      # リクエスト処理・画面制御
│   ├── form/            # フォームオブジェクト・バリデーション定義
│   └── service/         # ビジネスロジック
└── resources/
    ├── templates/       # Thymeleaf HTMLテンプレート
    │   ├── fragments/   # 共通パーツ（header, footerなど）
    │   └── index.html   # メイン画面
    └── static/          # CSS, JS, 画像ファイル
```
