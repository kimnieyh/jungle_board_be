package jungle.board.util;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("게시판 프로젝트 API")
                        .description("로그인, 회원가입 기능을 제공합니다.")
                        .version("1.0.0"));
    }
}
