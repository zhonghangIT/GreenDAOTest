package com.education.greendaotest;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by zhonghang on 2016/10/19.
 */
@Entity(nameInDb = "student")
public class Student {
    @Id
    private Long id;
    @NotNull
    private String name;
    private String clazz;
    private String sex;

    @Generated(hash = 1746731621)
    public Student(Long id, @NotNull String name, String clazz, String sex) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.sex = sex;
    }

    @Generated(hash = 1556870573)
    public Student() {
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

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
