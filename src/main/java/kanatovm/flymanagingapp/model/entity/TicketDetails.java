package kanatovm.flymanagingapp.model.entity;

import kanatovm.flymanagingapp.model.enums.PassengerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "flyapp_ticket_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TicketDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticket_details_id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String telephone_number;

    @Enumerated(EnumType.STRING)
    private PassengerType passenger_class;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
