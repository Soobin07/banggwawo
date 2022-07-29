package com.ssafy.banggawawo.domain.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
public class Like {
    @Id
    @GeneratedValue
    private long l_id;    //좋아요 아이디
    private long r_id;    //요청 아이디
    private long s_id;    //학생 아이디
}
