package com.safenet.fxchange.entities;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document(collection = "stuff")
public class Stuff {
    @Id
    private ObjectId id;

    private String title;

    private String content;

    private List<String> images;

    @DBRef
    private User author;

    private int condition;

    @DBRef
    private Category category;

    @DBRef
    private Type type;

    @DBRef
    private List<Tag> tag;

    private int status;

    @Field("custom_field")
    private Map<String,Object> customField;

    @CreatedDate
    @Field("create_at")
    private Date createAt;

    @LastModifiedDate
    @Field("update_at")
    private Date updateAt;

    @DBRef
    private List<Comment> comments;

    public Stuff() {
    }

    public Stuff(String title, String content, List<String> images, User author, int condition, Category category, Type type, List<Tag> tag, int status, Map<String, Object> customField, Date createAt, Date updateAt, List<Comment> comments) {
        this.title = title;
        this.content = content;
        this.images = images;
        this.author = author;
        this.condition = condition;
        this.category = category;
        this.type = type;
        this.tag = tag;
        this.status = status;
        this.customField = customField;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.comments = comments;
    }
}
