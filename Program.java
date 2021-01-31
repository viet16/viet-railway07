package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Program {
 public static void main(String[] args) {
	 // create Department
	 Department department1 = new Department() ;
	 department1.departmentId = 1 ;
	 department1.departmentName = "Sale" ;
	 Department department2 = new Department() ;
	 department2.departmentId = 2 ;
	 department2.departmentName = "marketing" ;
	 Department department3 = new Department() ;
	 department3.departmentId = 3 ;
	 department3.departmentName = "hacker" ;
	 //Position
	 Position position1 = new Position () ;
	 position1.positionId = 1 ;
	 position1.positionName = "Dev" ;
	 Position position2 = new Position () ;
	 position2.positionId = 2 ;
	 position2.positionName = "Test" ;
	 Position position3 = new Position () ;
	 position3.positionId = 3 ;
	 position3.positionName = "Scrum" ;	
	 Position position4 = new Position () ;
	 position4.positionId = 4 ;
	 position4.positionName = "Master," ;
	 Position position5 = new Position () ;
	 position5.positionId = 5 ;
	 position5.positionName = "PM" ;
	 //Account
	 Account account1 = new Account () ;
	 account1.accountId = 1 ;
	 account1.emall = "CEO@yourdomain.com" ;
	 account1.userName = "viet" ;
	 account1.FullName = "le duc viet" ;
	 account1.departmentId = department1 ;
	 account1.positionId = position1 ;
	 account1.createDate =  LocalDate.of(2020,12,10) ;
	 
	 Account account2 = new Account () ;
	 account2.accountId = 2 ;
	 account2.emall = "PhuonganhHanoi@gmail.com" ;
	 account2.userName = "Tom" ;
	 account2.FullName = "Tom Hiddleston." ;
	 account2.departmentId = department2 ;
	 account2.positionId = position2 ;
	 account2.createDate =  LocalDate.of(2020,10,18) ;
	 
	 Account account3 = new Account () ;
	 account3.accountId = 3 ;
	 account3.emall = "you@yourdomain.com" ;
	 account3.userName = "Acacia" ;
	 account3.FullName = "Acacia Adela" ;
	 account3.departmentId = department2 ;
	 account3.positionId = position2 ;
	 account3.createDate =  LocalDate.of(2021,12,12) ;
	 
	 Account account4 = new Account () ;
	 account4.accountId = 4 ;
	 account4.emall = "services@yourdomain.com" ;
	 account4.userName = "Adelaide" ;
	 account4.FullName = "Adelaide Agatha" ;
	 account4.departmentId = department1 ;
	 account4.positionId = position2 ;
	 account4.createDate =  LocalDate.of(2020,12,10) ;

	 // Group
	 Group group1 = new Group() ;
	 group1.groupId = 1 ;
	 group1.groupName = "Alethea and Alida" ;
	 group1.creatorId = account3 ;
	 group1.createDate = LocalDate.of(2021,10,23) ;
	 Account[] accountofgroup1 = {account1,account4};
	 group1.accounts = accountofgroup1 ;
	 
	 Group group2 = new Group() ;
	 group2.groupId = 2 ;
	 group2.groupName = "Angela and Annabella" ;
	 group2.creatorId = account1 ;
	 group2.createDate = LocalDate.of(2023,11,23) ;
	 Account[] accountofgroup2 = {account3,account2};
	 group2.accounts = accountofgroup2 ;
	 
	 Group group3 = new Group() ;
	 group3.groupId = 3 ;
	 group3.groupName = "Aubrey and Audrey" ;
	 group3.creatorId = account2 ;
	 group3.createDate = LocalDate.of(2021,10,29) ;
	 Account[] accountofgroup3 = {account1,account4};
	 group3.accounts = accountofgroup3 ;
	 // GroupAccount
	 GroupAccount groupAccount1 = new GroupAccount () ;
	 groupAccount1.groupId = group1 ;
	 groupAccount1.accountId = account3 ;
	 groupAccount1.JoinDate = LocalDate.of(2021,11,04) ;
	 
	 
	 GroupAccount groupAccount2 = new GroupAccount () ;
	 groupAccount2.groupId = group1 ;
	 groupAccount2.accountId = account2 ;
	 groupAccount2.JoinDate = LocalDate.of(2022,10,04) ;
	 
	 GroupAccount groupAccount3 = new GroupAccount () ;
	 groupAccount3.groupId = group2 ;
	 groupAccount3.accountId = account2 ;
	 groupAccount3.JoinDate = LocalDate.of(2023,12,04) ;
	 
	 //TypeQuestion
	 TypeQuestion typeQuestion1 = new TypeQuestion ();
	 typeQuestion1.typeId = 1 ;
	 typeQuestion1.typeName = TypeName.ESSAY ;
	 
	 TypeQuestion typeQuestion2 = new TypeQuestion ();
	 typeQuestion2.typeId = 2 ;
	 typeQuestion2.typeName = TypeName.MULTIPLE_CHOICE ;
	 
	 TypeQuestion typeQuestion3 = new TypeQuestion ();
	 typeQuestion3.typeId = 3 ;
	 typeQuestion3.typeName = TypeName.ESSAY ;
	 // CategoryQuestion
	 CategoryQuestion categoryQuestion1 = new CategoryQuestion ();
	 categoryQuestion1.categoryId = 1 ;
	 categoryQuestion1.categoryName = "Java" ;
	 
	 CategoryQuestion categoryQuestion2 = new CategoryQuestion ();
	 categoryQuestion2.categoryId = 2 ;
	 categoryQuestion2.categoryName = "NET" ;
	 
	 CategoryQuestion categoryQuestion3 = new CategoryQuestion ();
	 categoryQuestion3.categoryId = 3 ;
	 categoryQuestion3.categoryName = "Postman" ;
	 // Question
	 Question question1 = new Question ();
	 question1.questionId = 1 ;
	 question1.content = "cau hoi 1" ;
	 question1.categoryId = categoryQuestion1 ;
	 question1.typeId = typeQuestion1 ;
	 question1.creatorId = account2 ;
	 question1.createDate = LocalDate.of(2021, 10, 16);
	 
	 Question question2 = new Question ();
	 question2.questionId = 2 ;
	 question2.content = "cau hoi 2" ;
	 question2.categoryId = categoryQuestion2 ;
	 question2.typeId = typeQuestion2 ;
	 question2.creatorId = account3 ;
	 question2.createDate = LocalDate.of(2025, 10, 16);
	 
	 Question question3 = new Question ();
	 question3.questionId = 3 ;
	 question3.content = "cau hoi 3" ;
	 question3.categoryId = categoryQuestion2 ;
	 question3.typeId = typeQuestion3 ;
	 question3.creatorId = account1 ;
	 question3.createDate = LocalDate.of(2027, 10, 16);
	 
	 // Answer 
	 Answer answer1 = new Answer () ;
	 answer1.answerId = 1 ;
	 answer1.Content = "tra loi 1" ;
	 answer1.questionId = question1 ;
	 answer1.isCorrect = true ;
	 
	 Answer answer2 = new Answer () ;
	 answer2.answerId = 2 ;
	 answer2.Content = "tra loi 2" ;
	 answer2.questionId = question2 ;
	 answer2.isCorrect = false ;
	 
	 Answer answer3 = new Answer () ;
	 answer3.answerId = 3 ;
	 answer3.Content = "tra loi 3" ;
	 answer3.questionId = question3 ;
	 answer3.isCorrect = true ;
	 // Exam 
	 Exam exam1 = new Exam () ;
	 exam1.examId = 1;
	 exam1.code = "ma de 1" ;
	 exam1.title = "tieu de 1" ;
	 exam1.categoryId = 1 ;
	 exam1.duration = LocalTime.of(0, 50);
	 exam1.creatorId = account1 ;
	 exam1.createdate = LocalDate.of(2020, 12, 18) ;
	 
	 Exam exam2 = new Exam () ;
	 exam2.examId = 2 ;
	 exam2.code = "ma de 2" ;
	 exam2.title = "tieu de 2" ;
	 exam2.categoryId = 2 ;
	 exam2.duration = LocalTime.of(1, 50);
	 exam2.creatorId = account1 ;
	 exam2.createdate = LocalDate.of(2024, 12, 18) ;
	 
	 Exam exam3 = new Exam () ;
	 exam1.examId = 3;
	 exam1.code = "ma de 3" ;
	 exam1.title = "tieu de 3" ;
	 exam1.categoryId = 3 ;
	 exam1.duration = LocalTime.of(1, 50);
	 exam1.creatorId = account1 ;
	 exam1.createdate = LocalDate.of(2027, 12, 18) ;
	 
	 // ExamQuestion
	 ExamQuestion examQuestion1 = new ExamQuestion () ;
	 examQuestion1.examId = exam1 ;
	 examQuestion1.questionId = question1 ;
	 
	 ExamQuestion examQuestion2 = new ExamQuestion () ;
	 examQuestion2.examId = exam2 ;
	 examQuestion2.questionId = question2 ;
	 
	 ExamQuestion examQuestion3 = new ExamQuestion () ;
	 examQuestion3.examId = exam3 ;
	 examQuestion3.questionId = question1 ;
	 
	 System.out.println("thong tin phong ban 1: ");
	 System.out.println("id : " + department1.departmentId) ;
	 System.out.println("name: " + department1.departmentName ) ;
	 
	 
	 System.out.println("thong tin tai khoan 1: ");
	 System.out.println("id : " + account1.accountId) ;
	 System.out.println("emall: " + account1.emall ) ;
	 System.out.println("userName: " + account1.userName ) ;
	 System.out.println("FullName: " + account1.FullName ) ;
	 System.out.println("departmentId: " + account1.departmentId ) ;
	 System.out.println("positionId : " + account1.positionId) ;
	 System.out.println("createDate : " + account1.createDate) ;
	 
 
 
 
 
 
 
 
 
 
 }
}
 
 
