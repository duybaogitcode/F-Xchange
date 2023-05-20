package com.safenet.fxchange.entities;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "point_history")
public class PointHistory {
    @Id
    private ObjectId id;

    private String content;

    private int change;

    @DBRef
    private User user;

    @CreatedDate
    private Date time;

    public PointHistory() {
    }

    public PointHistory(String content, int change, User user, Date time) {
        this.content = content;
        this.change = change;
        this.user = user;
        this.time = time;
    }
}
