package ma.mundi.ormjdbcjpa_tp2.entites;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity //Entite JPA
@Data @NoArgsConstructor @AllArgsConstructor //data ajouter les gettrers et setters
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date dataNaissance;
    private boolean malade;
    private int score;
}
