package com.example.ProductCatalog;

//Задание:
//Сделать проект "Интернет-каталог товаров"
//Главная страница - таблица со списком всех товаров
//каждый товар в списке это название, на которое можно нажать,
// что приведет на страницу конкретного товара.
// У товара должен быть уникальный id,
// который подставляется в ссылку в общей таблице, например
//<a href="/product?id=123456>Микроволновка "Победа"</a>


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProductCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogApplication.class, args);
    }

}


