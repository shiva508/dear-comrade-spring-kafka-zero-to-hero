package com.comrade.config.serdes;

import com.comrade.model.WordCount;
import org.springframework.kafka.support.serializer.JsonSerde;

public class WordCountSerDe extends JsonSerde<WordCount> {
}
