package pl.knap.shop.admin.product.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;
import pl.knap.shop.admin.product.model.AdminProductCurrency;

import java.math.BigDecimal;

@Getter
public class AdminProductDto {

    @NotBlank
    @Length(min = 4)
    private String name;
    @NotBlank
    @Length(min = 4)
    private String category;
    @NotNull
    @Length(min = 4)
    private String description;

    @Min(0)
    private BigDecimal price;
    private AdminProductCurrency currency;
    private String image;
}
