package hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.main.integrationtests.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

public class TestUtils {

	public static <T> T singleResult(Collection<T> collection) {
		assertThat("should be single result", collection.size(), is(1));
		return collection.iterator().next();
	}

}
