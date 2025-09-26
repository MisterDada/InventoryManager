package inventory.example.InventoryManager.Mapper;

import org.springframework.stereotype.Component;

import inventory.example.InventoryManager.Dto.ProductRequestDto;
import inventory.example.InventoryManager.Dto.ProductResponseDto;
import inventory.example.InventoryManager.Entities.ProductEntity;

@Component
public class ProductDtoMapper {
    
    public ProductEntity toEntity( ProductRequestDto dto ){
        return new ProductEntity(
            null, 
            dto.name(),
            dto.description(),
            dto.price(),
            null
        );
    }

    public ProductResponseDto toResponse( ProductEntity product ){
        return new ProductResponseDto(
            product.getId(), 
            product.getName(), 
            product.getDescription(), 
            product.getPrice()
        );
    }
}
