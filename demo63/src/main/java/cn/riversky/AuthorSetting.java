package cn.riversky;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 添加类型安全检查
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSetting {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
