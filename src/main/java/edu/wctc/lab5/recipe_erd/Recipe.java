package edu.wctc.lab5.recipe_erd;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="PHOTO")


public class Recipe {
    @Id //primary key
    @Column(name = "recipe_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private Chef chefId;

    @Column(name="recipe_title")
    private String title;

    @Column(name="recipe_description")
    private String description;
}
