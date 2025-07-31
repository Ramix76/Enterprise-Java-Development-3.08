package lab.events.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "expositions")
@Data
@EqualsAndHashCode(callSuper = true)
public class Exposition extends Event {
}

