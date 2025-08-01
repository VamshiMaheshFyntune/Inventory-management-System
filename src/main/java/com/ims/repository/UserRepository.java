package com.ims.repository;

import com.ims.entity.user.User;
import com.ims.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);

    @Query("select u from User u where u.role=:role")
    List<User> findByRole(@Param("role") Role role);
}
