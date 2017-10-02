package com.wearedevs.javaclicker.shop.items.portal;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.shop.ShopItem;

public class Portal1 extends ShopItem {

	//TODO: 500 Clicks Every 15 Seconds
	
	public void onPurchase() {
		AutoHandler.portal = 500;
	}

	public int getPrice() {
		return 25000;
	}

	public String getName() {
		return "Click Portal: Tier 1";
	}

}
