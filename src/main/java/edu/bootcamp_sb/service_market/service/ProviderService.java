package edu.bootcamp_sb.service_market.service;

import edu.bootcamp_sb.service_market.dto.ProviderDto;


import edu.bootcamp_sb.service_market.dto.reponse.ProviderCalendarResponseDto;
import edu.bootcamp_sb.service_market.dto.reponse.ProviderCategoryResponseDto;
import edu.bootcamp_sb.service_market.dto.reponse.ProviderResponseDto;
import edu.bootcamp_sb.service_market.dto.request.ProviderRegistrationDto;
import edu.bootcamp_sb.service_market.dto.request.ProviderSelectCategoriesDto;
import org.springframework.http.ResponseEntity;


import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public interface ProviderService {

    ResponseEntity<ProviderDto> persistProviders(ProviderRegistrationDto provider);

    ResponseEntity<Map<String, Object>> getAllProviders(Integer pageSize, Integer pageNumber, String keyword);

    ResponseEntity<Map<String,String>> deleteById(UUID id);

    ResponseEntity<Map<String, String>> deleteByListOfIds(Iterable<UUID>ids);

    ResponseEntity<ProviderResponseDto> updateById(ProviderDto provider);

    ResponseEntity<ProviderResponseDto> getById(UUID id);

    ResponseEntity<List<ProviderResponseDto>> getByListOfId(Iterable<UUID> id);

    ResponseEntity<List<ProviderResponseDto>> findAllByExpertise(String expertise);

    ResponseEntity<List<ProviderCategoryResponseDto>> top5Providers();

    ResponseEntity<List<ProviderCategoryResponseDto>> getAllProvidersWithCategories();

    ResponseEntity<Map<String, String>> selectACategory(ProviderSelectCategoriesDto selectCategoriesDto);

    ResponseEntity<Map<String,String>> getProviderCount();

    ResponseEntity<Map<String,String>> addDayOff(LocalDate day, String userId);

    ResponseEntity<List<ProviderCalendarResponseDto>> getProviderCalendar(UUID userId);




}
