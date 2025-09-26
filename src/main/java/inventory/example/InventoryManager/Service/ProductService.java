package inventory.example.InventoryManager.Service;

import org.springframework.stereotype.Service;

import inventory.example.InventoryManager.Repository.ProductRepository;


@Service
public class ProductService {
    
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    

}
