package my.julie.springyeonjoo.components.post;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Entity
@Data
public class Post {
    @Id // PK annotation
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // AUTOINCREMENT
    private long id;

    @Size(min=1, max=100) // String length
    @NotNull // NOT NULL
    private String title;

    private String body;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Setter(AccessLevel.NONE)
    @Column(updatable=false, nullable=false)
    private Instant createdAt = Instant.now();
}
