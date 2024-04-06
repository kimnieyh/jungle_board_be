package jungle.board.controller;

import jungle.board.dto.SigninRequest;
import jungle.board.dto.SignupRequest;
import jungle.board.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;
    @PostMapping("/sign-up")
    public String signUp(@RequestBody SignupRequest request){
        return memberService.signUp(request);
    }

    @GetMapping("/sign-in")
    public boolean signIn(@RequestBody SigninRequest request){
        return memberService.signIn(request);
    }
}
