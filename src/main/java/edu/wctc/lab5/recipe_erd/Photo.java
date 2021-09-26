package edu.wctc.lab5.recipe_erd;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="PHOTO")

public class Photo {
    @Id //primary key
    @Column(name = "photo_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "photo_recipe_id")
    private Recipe recipeId;

    @Column(name="photo_filename")
    private String filename;

    @Column(name="photo_caption")
    private String caption;

    @Column(name="photo_datestamp")
    private LocalDateTime datestamp;

    @Column(name="photo_visible")
    private boolean visible;
}