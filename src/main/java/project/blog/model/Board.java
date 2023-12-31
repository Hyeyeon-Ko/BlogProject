package project.blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Entity
public class Board {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int board_idx;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob //대용량 데이터
    private String content;

    @ColumnDefault("0")
    private int count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userId")
    private User user;

    @OneToMany(mappedBy = "board", fetch=FetchType.EAGER)
    private List<Reply> reply;

    @CreationTimestamp
    private Timestamp create_date;
}
