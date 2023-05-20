package com.safenet.fxchange.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "permissions")
public class Permission {
    @Id
    private Integer id;

    private Boolean read;
    private Boolean write;

    @Field("resource_urls")
    private List<String> resourceUrls;

    public Permission() {
    }

    public Permission(Integer id, Boolean read, Boolean write, List<String> resourceUrls) {
        this.id = id;
        this.read = read;
        this.write = write;
        this.resourceUrls = resourceUrls;
    }
}
