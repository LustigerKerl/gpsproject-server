package com.wong.gps;

import com.wong.gps.dto.GpsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GpsRepository extends JpaRepository<GpsDTO,Long> {
    @Query(value = "SELECT * FROM gps_table",nativeQuery = true)
    List<GpsDTO> findByNews();

    @Query(value = "SELECT * FROM  gps where name = ?1 and now_location = ?2",nativeQuery = true)
    GpsDTO findByIdAndNowLocation(String name,String nowLocation);

}
