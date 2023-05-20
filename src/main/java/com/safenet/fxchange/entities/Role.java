package com.safenet.fxchange.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "roles")
public class Role {
    @Id
    private int id;
    private String name;
    @DBRef
    private List<Permission> permissions;

    public Role() {
    }

    public Role(int id, String name, List<Permission> permissions) {
        this.id = id;
        this.name = name;
        this.permissions = permissions;
    }
}
