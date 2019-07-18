package be.businesstraining.repository;

import be.businesstraining.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripsRepository extends JpaRepository<Trip,Long> {


}
