package com.comrade.config.serdes;

import com.comrade.model.News;
import org.springframework.kafka.support.serializer.JsonSerde;

public class WordSerDe extends JsonSerde<News> {
}
