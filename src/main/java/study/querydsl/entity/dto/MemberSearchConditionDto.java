package study.querydsl.entity.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class MemberSearchConditionDto {
    private final String username;
    private final String teamName;
    private final Integer ageGoe;
    private final Integer ageLoe;

    @Builder
    private MemberSearchConditionDto(String username,
                                    String teamName,
                                    Integer ageGoe,
                                    Integer ageLoe) {
        this.username = username;
        this.teamName = teamName;
        this.ageGoe = ageGoe;
        this.ageLoe = ageLoe;
    }
}
