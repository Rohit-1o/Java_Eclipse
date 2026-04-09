package java_project;

public class ParameterPassing {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x = 10;
			System.out.println("Before Change : "+x);
			changeX(x);
			System.out.println("After Change : "+x);
			System.out.println("===========================================================");
			
			Account acc = new Account();
			acc.setType("Saving");
			System.out.println("Type Before Change : "+acc.getType());
			changeAccountType(acc);
			System.out.println("Type After Change : "+acc.getType());

			
		}

		private static void changeAccountType(Account accCopy) {
			// TODO Auto-generated method stub
			
			accCopy.setType("Current");
		}

		private static void changeX(int xCopy) {
			// TODO Auto-generated method stub
			xCopy=20;
			
			
		}

	}