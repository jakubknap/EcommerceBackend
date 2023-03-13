package pl.knap.shop.admin.category.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "category")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String slug;


}
