package com.comrade.repository.kafkauserprofile;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;
import com.comrade.modal.KafkaUserprofile;

@Repository
public interface KafkaUserprofileRepository extends JpaRepository<KafkaUserprofile, Integer> {

}
