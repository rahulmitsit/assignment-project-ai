package mypack;

public class CustomeAutoClosable implements AutoCloseable {

	public void action() {
		System.out.println("performing action");
	}

	@Override
	public void close() throws Exception {
		System.out.println("auto close called");
	}

}
