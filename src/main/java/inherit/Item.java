package inherit;

import javax.persistence.*;

@Entity
// 조인 테이블 전략 실행 (Default : SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
// dtype 생성 (Entity 명이 생김), name항목을 줄 경우 변경 가능
// 자식 클래스에서는 DiscrimantorValue와 매핑됨
@DiscriminatorColumn
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;

}
