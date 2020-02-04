import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// The conclusion is that I can't make an early-exit annotation, because annotations don't work on expressions.

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.SOURCE)
public @interface EarlyExit {}
