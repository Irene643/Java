package com.example;
public interface ProductDAO {
    void create(Product product);
    Product read(int id);
    void update(Product product);
    void delete(int id);
}

