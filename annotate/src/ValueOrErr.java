import javax.annotation.Nonnull;

public class ValueOrErr<T> {
	private final T value;
	private final String error;

	private ValueOrErr(T value, String error) {
		assert (value == null && error != null) || (value != null && error == null);
		this.value = value;
		this.error = error;
	}

	public static <T> ValueOrErr<T> ok(@Nonnull T value) {
		return new ValueOrErr<>(value, null);
	}

	public static <T> ValueOrErr<T> fail(@Nonnull String error) {
		return new ValueOrErr<>(null, error);
	}

	public boolean isSuccess() {
		return value != null;
	}

	public boolean isFailure() {
		return error != null;
	}

	@Nonnull
	public T value() {
		assert value != null;
		assert error == null;
		return value;
	}

	@Nonnull
	public String error() {
		assert value == null;
		assert error != null;
		return error;
	}
}
