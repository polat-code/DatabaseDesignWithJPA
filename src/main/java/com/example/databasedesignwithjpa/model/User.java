package com.example.databasedesignwithjpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "tbl_Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "full_name")
    private String fullName;
    private String email;
    private String gender;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @OneToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "country_code",
            referencedColumnName = "countryId"
    )
    private Country country;
    @Column(name = "created_at")
    private String createdAt;

}
