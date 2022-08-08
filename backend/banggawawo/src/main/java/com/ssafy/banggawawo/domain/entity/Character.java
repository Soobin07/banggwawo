package com.ssafy.banggawawo.domain.entity;

import lombok.*;

import javax.persistence.*;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Character {
    private Long chId;          //캐릭터 아이디        //전부 default 필요
    private String body;     //3d 캐릭터 몸 색상
    private String legs;     //3d 캐릭터 다리 색상
    private String glasses;  //3d 캐릭터 안경 색상
    private String mouse;    //3d 캐릭터 입 색상
    private String dress;    //3d 캐릭터 드레스 색상
    private String bag;      //3d 캐릭터 방 색상

}




