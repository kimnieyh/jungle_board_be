package jungle.board.acessingdatajpa;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface MemberRepository extends CrudRepository<Member,Long> {

    List<Member> findByName(String name);
    Member findById(long id);
}
