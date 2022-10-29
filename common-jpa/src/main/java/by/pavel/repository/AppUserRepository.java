package by.pavel.repository;

import by.pavel.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findAppUserByTelegramUserId(Long id);

}
