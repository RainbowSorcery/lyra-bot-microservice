package com.lyra.bot.main.application.mapper;

import com.lyra.bot.main.application.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {

    @Query(value = " select * from sign_vpn_log t1 where t1.create_date >= subdate(curdate(), interval 7 day)", nativeQuery = true)
    List<Log> get7TotalSignLog();

}
