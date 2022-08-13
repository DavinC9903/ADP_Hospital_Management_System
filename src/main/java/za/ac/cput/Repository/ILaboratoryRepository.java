package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Entity.Laboratory;

import java.util.Set;

/**
 * Chuma Nxazonke
 * Student Number: 219181187
 * Date: 08 July 2022
 * This is an updated version
 */
@Repository
public interface ILaboratoryRepository extends JpaRepository<Laboratory, String> {

    public Set<Laboratory> getAll();
}