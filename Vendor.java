package com.jbevents.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "vendors")
public class Vendor {

    @Id
    private String id;

    private String name;

    // This should be a list since multiple categories can be selected
    private List<String> category;

    private String contact;

    // Constructors, getters, setters
    public Vendor() {}

    public Vendor(String name, List<String> category, String contact) {
        this.name = name;
        this.category = category;
        this.contact = contact;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getCategory() { return category; }
    public String getContact() { return contact; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCategory(List<String> category) { this.category = category; }
    public void setContact(String contact) { this.contact = contact; }
}
