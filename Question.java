package entities;
import java.time.LocalDate;

public class Question {
 int questionId ;
 String content ;
 CategoryQuestion categoryId ;
 TypeQuestion typeId ;
 Account creatorId ;
 LocalDate createDate ;
}
