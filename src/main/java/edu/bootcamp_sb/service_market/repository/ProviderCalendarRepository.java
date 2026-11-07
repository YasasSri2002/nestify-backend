package edu.bootcamp_sb.service_market.repository;

import edu.bootcamp_sb.service_market.entity.ProviderCalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface ProviderCalendarRepository extends JpaRepository<ProviderCalendarEntity,Long> {

    void deleteByProviderIdAndCalendarDate(UUID providerId, Instant calendarDate);

    List<ProviderCalendarEntity> findAllByProviderId(UUID providerId);

    @Modifying
    @Transactional
    @Query("""
            DELETE FROM ProviderCalendarEntity pc
            WHERE pc.calendarDate < CURRENT_DATE
            """)
    void deleteOldDays();

}
