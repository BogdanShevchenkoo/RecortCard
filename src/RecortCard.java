
public class RecortCard {

	/**
	M���� convertGrades ��������� ���� ������������� ��������
	- ��������� ����� � ���������� ������ A, B, C,D ��� � �
	����������� �� ����� ���������.
	*/
	public static char convertGrades(int testResult){
		
	char grade;
	
	if (testResult >= 90){
	grade = 'A';
	}else if (testResult >= 80 && testResult < 90){
	grade = 'B';
	}else if (testResult >= 70 && testResult < 80){
	grade = 'C';
	}else if (testResult >= 60 && testResult < 80 ){
	grade = 'D';
	}else {
	grade = 'E';
	}
	
	return grade;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char yourGrade = convertGrades(90);
		
		System.out.println("���� ������ ������ " + yourGrade);
		yourGrade = convertGrades(79);
		System.out.println("���� ������ ������ " + yourGrade);
		yourGrade = convertGrades(49);
		System.out.println("���� ������ ������ " + yourGrade);
		yourGrade = convertGrades(87);
		System.out.println("���� ��������� ������ " + yourGrade);
		
	}

}
