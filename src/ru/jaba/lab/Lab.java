package ru.jaba.lab;

import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon p1 = new Pichu("A",20);
		Pokemon p2 = new Darumaka("B",1);
		Pokemon p3 = new Pikachu("C",2);
		Pokemon p4 = new Raichu("D",1);
		Pokemon p5 = new ShayminLand("E",1);
		Pokemon p6 = new Pichu("T",1);
		Pokemon p7 = new DarmanitanStandard("R",1);
		
		b.addAlly(p1);
		b.addFoe(p2);

		b.addAlly(p3);
		b.addFoe(p4);

		b.addAlly(p5);
		b.addFoe(p6);
		
		b.addAlly(p7);
		
		b.go();		
	}
}
