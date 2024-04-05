package jungle.board.service;

import jungle.board.acessingdatajpa.Member;
import jungle.board.acessingdatajpa.MemberRepository;
import jungle.board.dto.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public String signIn(SignupRequest request){
        // todo 회원가입 유효성 검사
        Member member = memberRepository.save(request.toEntity());
        return member.getName();
    }
}
