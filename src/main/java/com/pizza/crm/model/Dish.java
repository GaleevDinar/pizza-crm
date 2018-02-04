package com.pizza.crm.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(name = "dish_ingredient",
//            joinColumns = @JoinColumn(name = "dish_id"),
//            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
//    private Set<Ingredient> ingredient = new HashSet<>();

    @ManyToMany(mappedBy = "dish")
    private Set<Categories> categories = new HashSet<>();

    public Dish() {
    }

    public Dish(String name) {
        this.name = name;
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

//    public Set<Ingredient> getIngredient() {
//        return ingredient;
//    }
//
//    public void setIngredient(Set<Ingredient> ingredient) {
//        this.ingredient = ingredient;
//    }

}
