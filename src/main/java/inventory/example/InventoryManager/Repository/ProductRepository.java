package inventory.example.InventoryManager.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import inventory.example.InventoryManager.Entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
    
}
