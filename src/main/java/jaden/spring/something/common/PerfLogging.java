package jaden.spring.something.common;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 성능 로깅 어노테이션
 */
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {
}
