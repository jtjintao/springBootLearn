package com.mybatis.studybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User1 {
    Integer id;
    String name;
    Integer age;
    String email;
}
