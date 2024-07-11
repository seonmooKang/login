package social.login.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import social.login.dto.MemberDTO;

@Entity
@Setter
@Getter
@Table(name = "Member_table")
public class MemberEntity {
    @Id // pk: primary key 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto_increment
    private Long id;

    @Column(unique = true) // unique = 제약조건 추가
    private String memberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }
}
