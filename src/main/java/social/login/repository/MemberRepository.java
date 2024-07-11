package social.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.login.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
