package com.lyra.bot.main.application.mapper;


import com.lyra.bot.main.application.entity.VPNUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<VPNUserInfo, Long> {
    List<VPNUserInfo> findByType(String type);
}
