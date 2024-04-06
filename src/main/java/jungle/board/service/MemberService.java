package jungle.board.service;

import jungle.board.acessingdatajpa.Member;
import jungle.board.acessingdatajpa.MemberRepository;
import jungle.board.dto.SigninRequest;
import jungle.board.dto.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public String signUp(SignupRequest request){
        if(!userIdValidation(request.getId()))
            return null;
        Member member = memberRepository.save(request.toEntity());
        return member.getName();
    }
    public boolean signIn(SigninRequest request){
        Member userInfo = request.toEntity();
        userInfo = memberRepository.findTopByUserId(userInfo.getUserId());
        return Objects.equals(userInfo.getPassword(), request.getPassword());
    }
    public boolean userIdValidation(String id){
        return !memberRepository.existsByUserId(id);
    }
}
