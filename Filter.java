import java.util.Optional;
import static java.lang.String.format;
import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

public class Filter {

  public static void main(String... args) {
		String name = "peter";
		Optional<String> opt = ofNullable(name).filter(n -> n.contains("s"));
		System.out.println(format("present: %s", opt.isPresent()));
		opt.ifPresent(System.out::println);

		String nullable = null;
		Optional<String> nullOpt = ofNullable(nullable);
		System.out.println(format("present: %s", nullOpt.isPresent()));
	}
}
