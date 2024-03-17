package ma.enset.jeetp3.repositories;

import com.example.demo.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
}
