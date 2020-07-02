package jaden.spring.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 메소드 정상 수행 시, 정상수행 로그를 찍어주는 annotation
 */
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface AfterReturn {
}
