package jungle.board.dto;

import jungle.board.acessingdatajpa.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SigninRequest {
    private String id;
    private String password;

    public Member toEntity(){
        return Member.builder()
                .userId(id)
                .password(password)
                .build();
    }
}
