package project.blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Entity
public class User {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라감
    private int user_idx; //Auto-increment

    @Column(nullable = false, length = 20) //not null
    private String user_id;

    @Column(nullable = false, length = 50) //not null(비밀번호 암호화)
    private String user_pw;

    @Column(nullable = false, length = 50)
    private String email;

    // DB는 Role Type이라는게 없다.
    @Enumerated(EnumType.STRING)
    private RoleType role;

    @CreationTimestamp //시간 자동 입력
    private Timestamp create_date;
}
