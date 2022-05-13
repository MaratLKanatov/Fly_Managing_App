package kanatovm.flymanagingapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flyapp_planes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long plane_id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private int countBusinessSeating;

    @Column(nullable = false)
    private int countEconomySeating;

    @OneToMany(mappedBy = "plane")
    private List<Route> routes;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Company owner;
}
