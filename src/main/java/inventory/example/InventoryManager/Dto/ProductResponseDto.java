package inventory.example.InventoryManager.Dto;

import java.util.UUID;

public record ProductResponseDto(

    UUID id,
    String name,
    String description,
    double price
    
) {

    
    
}
