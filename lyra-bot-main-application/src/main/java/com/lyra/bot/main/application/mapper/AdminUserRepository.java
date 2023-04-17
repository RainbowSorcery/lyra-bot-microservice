package com.lyra.bot.main.application.mapper;

import com.lyra.bot.main.application.entity.AdminUser;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends ListPagingAndSortingRepository<AdminUser, Long> {
}
