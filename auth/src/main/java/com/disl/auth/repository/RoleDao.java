package com.disl.auth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disl.auth.enums.RoleType;
import com.disl.auth.models.Role;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String roleName);
    
    Optional<Role> findByRoleType(RoleType roleType);
    
    List<Role> findAllByRoleType(RoleType roleType);
}