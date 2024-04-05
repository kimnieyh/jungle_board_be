package jungle.board.dto;

import jungle.board.acessingdatajpa.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SignupRequest {
    private String id;
    private String password;
    private String name;

    public Member toEntity(){
        return Member.builder()
                .user_id(id)
                .password(password)
                .name(name)
                .build();
    }
}
