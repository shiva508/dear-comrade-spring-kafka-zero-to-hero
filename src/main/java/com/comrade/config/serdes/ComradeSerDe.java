package com.comrade.config.serdes;

import com.comrade.model.ComradeEvent;
import org.springframework.kafka.support.serializer.JsonSerde;

public class ComradeSerDe extends JsonSerde<ComradeEvent> {
}
