package kanatovm.flymanagingapp.model.entity;

import kanatovm.flymanagingapp.model.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flyapp_tickets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long ticket_id;

    @Enumerated(EnumType.STRING)
    private TicketType ticketType;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @Column(nullable = false)
    private Long total_sum;

    @OneToMany(mappedBy = "ticket")
    private List<TicketDetails> ticketDetails;
    // TODO calculate
}
