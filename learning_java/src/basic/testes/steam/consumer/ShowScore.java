package basic.testes.steam.consumer;

import java.util.function.Consumer;

public class ShowScore implements Consumer<User> {
	public void accept(User s) {
		System.out.println(s.getScore());
	}
}
