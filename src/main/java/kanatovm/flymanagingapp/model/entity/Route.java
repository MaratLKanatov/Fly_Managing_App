package kanatovm.flymanagingapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "flyapp_routes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long route_id;

    @ManyToOne
    @JoinColumn(name = "plane_id", nullable = false)
    private Plane plane;

    @Column(nullable = false)
    private Time departureTime;

    @Column(nullable = false)
    private Time arrivalTime;

    @ManyToOne
    @JoinColumn(name = "departure_city_id", nullable = false)
    private City departureCity;

    @ManyToOne
    @JoinColumn(name = "arrival_city_id", nullable = false)
    private City arrivalCity;

    @Column(nullable = false)
    private int modifier_price_basic;

    @Column(nullable = false)
    private int modifier_price_date;

    @Column(nullable = false)
    private float step_per_day;

    @OneToMany(mappedBy = "route")
    private List<Flight> flights;
}