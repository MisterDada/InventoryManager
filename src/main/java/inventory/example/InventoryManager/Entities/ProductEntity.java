package inventory.example.InventoryManager.Entities;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "product_name", nullable = false, updatable = true)
    private String name;

    @Column(name = "description", nullable = false, updatable = true)
    private String description;

    @Column(name = "price", nullable = false, updatable = true)
    private double price;

    @Column(name = "date_added", nullable = false, updatable = true)
    private Date dateAdded;


}
