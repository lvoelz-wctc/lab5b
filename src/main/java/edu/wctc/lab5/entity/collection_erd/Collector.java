package edu.wctc.lab5.entity.collection_erd;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="COLLECTOR")

public class Collector {

    @Id
    @Column(name="collector_id")
    private int collector_id;

    @Column(name="collector_firstname")
    private String firstname;

    @Column(name="collector_lastname")
    private String lastname;

    @Column(name="collector_avatar")
    private String avatar;
}
