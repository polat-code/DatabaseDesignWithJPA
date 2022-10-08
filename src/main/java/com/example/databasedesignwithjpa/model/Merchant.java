package com.example.databasedesignwithjpa.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_merchants")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long merchantId;
    @Column(name = "merchant_name")
    private String name;
    @Column(name = "created_at")
    private String createdAt;

    @OneToOne(

    )
    @JoinColumn(
            name = "country_code",
            referencedColumnName = "countryId"
    )
    private Country country;

    @OneToOne()
    @JoinColumn(
            name = "admin_id",
            referencedColumnName = "userId"
    )
    private User admin;

}
