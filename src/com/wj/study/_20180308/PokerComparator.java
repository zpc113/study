package com.wj.study._20180308;

import java.util.Comparator;

public class PokerComparator implements Comparator<Poker> {

	@Override
	public int compare(Poker o1, Poker o2) {
		// TODO Auto-generated method stub
		return o1.huaSe.compareTo(o2.huaSe);
	}

}
