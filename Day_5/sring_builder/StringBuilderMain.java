package sring_builder;

public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Today is day ");
		builder.append(5);
		builder.append( ", It is around ");
		builder.append(1.35f);
		builder.append(" pm, Let's have a break for lunch, do you agree..?? ");
		builder.append(true);
		
		System.out.println(builder);

	}

}
