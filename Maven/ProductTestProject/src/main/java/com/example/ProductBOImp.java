package com.example;

public class ProductBOImp implements ProductBO {
    private static ProductDAO dao = new ProductDAOImpl();
    @Override
    public void create(Product product) {
        dao.create(product);
    }

    @Override
    public Product findProduct(int id) {
        return dao.read(id);
    }

}
