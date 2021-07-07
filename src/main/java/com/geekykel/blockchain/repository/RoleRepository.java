package com.geekykel.blockchain.repository;

import com.geekykel.blockchain.model.ERole;
import com.geekykel.blockchain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Kelvin on 02/07/2021.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
