package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {
   // MemberService memberService = new MemberService();

    @Test
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("hello");

        //when
     //   Long saveId = memberService.join(member);

        //then
   //     Member findMember = memberService.findOne(saveId).get();
    //    assertThat(member.getName()).isEqualTo(findMember.getName());



    }

    @Test
    void 중복_회원_예외() {

    }

    @Test
    void findOne() {

    }
}
