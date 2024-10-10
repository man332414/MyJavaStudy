package chapter8_1;

public class exam_56 {

	public static void main(String[] args) 
	{
		exam_56_MyCellPhone phone1 = new exam_56_MyCellPhone();
		exam_56_Camera phone2 = new exam_56_MyCellPhone();
		exam_56_Call phone3 = new exam_56_MyCellPhone();
		exam_56_Memo phone4 = new exam_56_MyCellPhone();
		exam_56_Clock phone5 = new exam_56_MyCellPhone();
		exam_56_PhoneUser user1 = new exam_56_PhoneUser();
		user1.call(phone3);
		user1.call(phone1);
	}

}
