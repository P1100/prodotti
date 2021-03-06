package it.polito.ai.prodotti.services;

import it.polito.ai.prodotti.dtos.IngredientDTO;
import it.polito.ai.prodotti.dtos.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProducts();

    void addProduct(ProductDTO productDTO);

    Long getAvailableProducts(String id);

    void removeProduct(String id);

    List<ProductDTO> getProductByIngredient(IngredientDTO ingredientDTO);

    void produce(ProductDTO productDTO, long n);

    void sell(ProductDTO productDTO, long n);
}
