package by.academy.classwork.lesson6;

public class EnumDemo {

	public static void main(String[] args) {
	Seasons faforitSeasons = Seasons.AUTUMN;
	System.out.println(faforitSeasons.name());
	faforitSeasons.compare(faforitSeasons);
	
	}
}
