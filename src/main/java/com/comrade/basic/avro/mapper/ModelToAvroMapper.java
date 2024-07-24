package com.comrade.basic.avro.mapper;

import com.comrade.basic.avro.model.WikiAnalyticsAvroModel;
import com.comrade.basic.avro.model.WikiModel;

public class ModelToAvroMapper {
    public WikiAnalyticsAvroModel toWikiAnalyticsAvroModel(WikiModel wikiModel){
        return WikiAnalyticsAvroModel.newBuilder()
                .setId(wikiModel.getId())
                .setComment(wikiModel.getComment())
                .setMinor(wikiModel.getMinor())
                .setType(wikiModel.getType())
                .setUser(wikiModel.getUser())
                .setNotifyUrl(wikiModel.getNotifyUrl())
                .build();
    }
}
