package program_test;

public class getmember 
{
	//전체 회원조회
	public void allmember() 
	{
		System.out.println("전체회원조회 도착");
		int length = save.arr.size();
		for(int i = 0 ; i<length ; i++)
		{
			member mb = (member)save.arr.get(i);
			System.out.println("---------------------------");
			System.out.println("입력한 사항");
			System.out.println("이름 " + mb.getName());
			System.out.println("나이 " + mb.getAge());
			System.out.println("연차 " + mb.getHoliday());
			System.out.println("전화번호 " + mb.getTel());		}
	}
	//개별 회원조회
	public void onemember() {}
}
