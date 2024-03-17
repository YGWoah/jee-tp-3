package ma.enset.jeetp3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.enset.jeetp3.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
}
