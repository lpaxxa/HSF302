package com.lpaxxa.coffee.entity;
//tương lai @Entity @OneToMany(mapby, join column - tuần sau)
public class Category {
    private Long id; // nếu là key tự tăng, phải xài Long, wrapper class, ko đc dùng primitive long
    private String name;
    private String description;// cho vào gây nhiễu
    //nếu class tự tăng key, ko đưa vào constructor cột này!!!!
    public Category() {
    }
    public Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
