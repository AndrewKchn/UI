package dto;

import java.util.StringJoiner;
import java.util.UUID;

public class People {
    String name;
    int age;
    UUID id;

    public People(String name, int age, UUID id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", People.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("id=" + id)
                .toString();
    }
}
