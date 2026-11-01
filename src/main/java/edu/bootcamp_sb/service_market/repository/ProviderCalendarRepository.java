package edu.bootcamp_sb.service_market.repository;

import edu.bootcamp_sb.service_market.entity.ProviderCalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.UUID;

public interface ProviderCalendarRepository extends JpaRepository<ProviderCalendarEntity,Long> {

    void deleteByProviderIdAndCalendarDate(UUID providerId, Instant calendarDate);
}
