package validaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CPostalPichinchaValidacion.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CPostalPichincha {
	public String value()default "17";

	String message() default "* codigo postal para PICHINCHA empieza por 17";
	Class<?>[]groups() default{};
	Class<? extends Payload >[] payload() default{};
	
}
