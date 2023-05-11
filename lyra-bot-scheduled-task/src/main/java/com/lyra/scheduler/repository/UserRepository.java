package com.lyra.scheduler.repository;


import com.lyra.scheduler.entity.VPNUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<VPNUserInfo, Long> {
    List<VPNUserInfo> findByType(String type);
}
