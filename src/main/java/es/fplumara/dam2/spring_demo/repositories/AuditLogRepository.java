package es.fplumara.dam2.spring_demo.repositories;

import es.fplumara.dam2.spring_demo.domain.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> { }