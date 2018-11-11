package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Component
@Validated
//@ConfigurationProperties(prefix = "person")
@PropertySource(value = {"classpath:person.properties"})
public class Person {

    private String favorite;

    private String hate;

    @Email
    @Value("${person.name}")
    private String name;

    private Date birth;

    @Value("#{2+5}")
    private int age;

    private List<String> address;

    private Map<String,String> childrens;

    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, String> getChildrens() {
        return childrens;
    }

    public void setChildrens(Map<String, String> childrens) {
        this.childrens = childrens;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getHate() {
        return hate;
    }

    public void setHate(String hate) {
        this.hate = hate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "favorite='" + favorite + '\'' +
                ", hate='" + hate + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", age=" + age +
                ", address=" + address +
                ", childrens=" + childrens +
                ", dog=" + dog +
                '}';
    }
}
