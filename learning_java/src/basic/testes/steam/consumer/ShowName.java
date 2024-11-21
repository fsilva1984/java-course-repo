package basic.testes.steam.consumer;

import java.util.function.Consumer;

public class ShowName implements Consumer<User> {
	public void accept(User u) {
		System.out.println(u.getName());
	}
}
