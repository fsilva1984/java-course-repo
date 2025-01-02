package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Browser {
	public Queue<String> cache = new LinkedList<>();;

	public void dataCache(String data) {
		if (!cache.contains(data))
			cache.add(data);

	}

	public void showDataCache() {
		cache.forEach(System.out::println);
	}

}
