package jaden.spring.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Hello 로그를 남겨주는 annotation
 */
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface HelloLog {
}
