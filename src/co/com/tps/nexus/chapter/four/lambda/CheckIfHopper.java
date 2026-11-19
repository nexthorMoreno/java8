package co.com.tps.nexus.chapter.four.lambda;

public class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}