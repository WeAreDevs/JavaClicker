package com.wearedevs.javaclicker.shop.items.factories;

import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Factory1 extends ShopItem {

	//TODO: 10 Clicks Every 5 Seconds
	public void onPurchase() {
		//TODO: Add Factory Cycle
		ShopHandler.unlock(new Factory2());
	}

	public int getPrice() {
		return 1000;
	}

	public String getName() {
		return "Click Factory: Tier 1";
	}
}