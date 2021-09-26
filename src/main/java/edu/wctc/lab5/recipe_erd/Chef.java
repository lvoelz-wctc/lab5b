package edu.wctc.lab5.recipe_erd;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="PHOTO")

public class Chef {
    @Id //primary key
    @Column(name = "chef_id")
    private int id;

    @Column(name="chef_firstname")
    private String firstName;

    @Column(name="chef_lastname")
    private String lastName;

    @Column(name="chef_avatar")
    private String avatar;
}