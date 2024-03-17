package ma.enset.jeetp3.repositories;

import ma.enset.jeetp3.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ConsultationRepository extends JpaRepository<Consultation, Long>{
}
