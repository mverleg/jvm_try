import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;

// The conclusion is that I can't make an early-exit annotation, because annotations don't work on expressions.

public class Main {
	public static void main(String[] args) {
		new Main().doThing();
	}

	@Nonnull
	@CheckReturnValue
	public ValueOrErr<Integer> doThing() {
		Integer res1 = ValueOrErr.ok(1).value();
		Integer res2 = ValueOrErr.ok(res1 + 1).value();
		// @EarlyExit
		return ValueOrErr.ok(res2 + 1);
	}
}
