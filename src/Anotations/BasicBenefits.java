package Anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotations : Annotations are used to provide the meta - data about the code and it
// reduce the effort of writing code.
// It defines when our Annotation get execute
@Retention(RetentionPolicy.RUNTIME)
// It defines on which type our Annotation get worked
@Target(ElementType.TYPE)
// To create an annotation used @interface keyword
// Marker Annotation : An annotation with blank property called Marker Annotation.
// This is not marker annotation
public @interface BasicBenefits {
    // method declaration with default values
    String bId() default "B-101";
    String bName() default "General class A Employees";
}
