package edu.bootcamp_sb.service_market.schedule;

import edu.bootcamp_sb.service_market.repository.ProviderCalendarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ClearPastDayoffSchedule {

    private final ProviderCalendarRepository providerCalendarRepository;

    @Scheduled(cron = "0 0 0 * * *")
    private void clearPastDays(){
        providerCalendarRepository.deleteOldDays();
        log.debug("[SCHEDULER] deleted old day offs");
    }


}
