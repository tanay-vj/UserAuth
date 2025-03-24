package org.example.userauthenticationservice_feb2025.repos;

import org.example.userauthenticationservice_feb2025.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
