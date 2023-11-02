package ma.mundi.ormjdbcjpa_tp2.repositorise;

import ma.mundi.ormjdbcjpa_tp2.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
