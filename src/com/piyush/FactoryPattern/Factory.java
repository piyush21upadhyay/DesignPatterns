package com.piyush.FactoryPattern;

public class Factory {

	public static void main(String[] args) {
		String country = args[0];
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
	}

}
