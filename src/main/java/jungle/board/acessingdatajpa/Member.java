package jungle.board.acessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user_id;
    private String name;
    private String password;

    @Builder
    public Member(String user_id, String password, String name){
        this.user_id = user_id;
        this.password = password;
        this.name = name;
    }
}
