import java.util.Optional;
import static java.lang.String.format;
import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

public class Empty {

  public static void main(String... args) {
    Optional<String> empty = empty();

		System.out.println(format("present: %s", empty.isPresent()));

		String name = "peter";
		Optional<String> opt = ofNullable(name);
		System.out.println(format("present: %s", opt.isPresent()));
		opt.ifPresent(System.out::println);

		String nullable = null;
		Optional<String> nullOpt = ofNullable(nullable);
		System.out.println(format("present: %s", nullOpt.isPresent()));
	}
}
