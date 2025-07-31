package lab.events.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "speakers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentationDuration; // minutos

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}

