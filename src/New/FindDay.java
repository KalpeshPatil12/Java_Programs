package New;

public class FindDay {
	
		static class Date
		{
			int d, m, y;

			public Date(int d, int m, int y)
			{
				this.d = d;
				this.m = m;
				this.y = y;
			}

		};
	       static int monthDays[] = {31, 28, 31, 30, 31, 30,
								31, 31, 30, 31, 30, 31};
	      
		  static int countLeapYears(Date d)
		{
			int years = d.y;

			if (d.m <= 2)
			{
				years--;
			}

			return years / 4 - years / 100 + years / 400;
		}

		static int getDifference(Date dt1, Date dt2)
		{
			int n1 = dt1.y * 365 + dt1.d;

			
			for (int i = 0; i < dt1.m - 1; i++)
			{
				n1 += monthDays[i];
			}

			n1 += countLeapYears(dt1);

			
			int n2 = dt2.y * 365 + dt2.d;
			for (int i = 0; i < dt2.m - 1; i++)
			{
				n2 += monthDays[i];
			}
			n2 += countLeapYears(dt2);

			
			return (n2 - n1);
		}

		
		public static void main(String[] args)
		{
			Date dt1 = new Date(31, 8, 2016);
			Date dt2 = new Date(5, 9, 2016);
			System.out.println("Difference between two dates is " +
								getDifference(dt1, dt2));
		}
	}

