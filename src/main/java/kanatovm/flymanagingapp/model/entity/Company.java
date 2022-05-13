package kanatovm.flymanagingapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flyapp_companies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price_business;

    @Column(nullable = false)
    private int price_economy;

    @OneToMany(mappedBy = "owner")
    private List<Plane> planes;
}
